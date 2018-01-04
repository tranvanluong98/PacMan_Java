import java.awt.Color;
import java.awt.Font;
import static java.lang.Math.random;

public class pacMan{ 
   private static Controller controller;

   public static void main(String[] args) {
      StdAudio.loop("./res/sound/Begin Game.wav");
       boolean all = true;
       boolean start = true;
       boolean game = false;
       boolean choseLevel = false;
       boolean win = false;
       boolean lose = false;
       while(all){
       boolean up = false;
       boolean down = false;
       boolean left = false;
       boolean right = false;
       int c=0;
       // số lượng thức ăn
       int food1 = 134 ;
       int food2 = 208;
       
       for(int i=0;i<600;i++){
            for(int j=0;j<300;j++){
            	controller.arr[i][j] =0;
            }
        }
       
        StdDraw.setCanvasSize(1100,550);
        // set the scale of the coordinate system
        StdDraw.setXscale(0, 200);
        StdDraw.setYscale(0, 100);
        StdDraw.enableDoubleBuffering();
        StdDraw.picture(100,50,"./res/img/intro.png");
        StdDraw.setPenColor(StdDraw.RED);
        Font font = new Font("VNI-TOP" , Font.BOLD , 40);
        StdDraw.setFont(font);
        StdDraw.text(73, 10,"SPACE");
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.text(100, 10, "Press              to choose version");
        StdDraw.show();

        int rx =100, ry = 50;     // position
        int vx = 0, vy = 0;  
        int speedPlayer = 1;
        //long currentTime = 0;
        String imagePlayer = "./res/img/pacman-right.png"; 
        int level = 1;
        int X,Y,X1,Y1;
        int k =0;
        int k1 = 0;
        int A = 0;
        int B = 0;
        int A1 = 0;
        int B1=0;
        
        int[] a = {9,153,63,63};
        int[] b = {45,189,135,135};
        int[] c1 = {7,7,65,7};
        int[] d = {93,93,93,28};        
        
        int huong1 =0;
        int huong2 =0;
        int huong3 =0;
        int huong4 =0;
        int huong5 =0;
        int huong6 =0;
        
        while(start){
            if(StdDraw.isKeyPressed(32)){
            choseLevel= true;
            start = false;
            }
        }
        
        while(choseLevel) {
        	StdDraw.picture(100,50,"./res/img/levels.png");
        	//StdDraw.clear(StdDraw.BLACK);

            Font font1 = new Font("VNI-Lithos",Font.BOLD, 16);
            StdDraw.setFont(font1);
            StdDraw.setPenColor(StdDraw.YELLOW);
        	StdDraw.text(30, 90, "Press     to play version 1.0");
            StdDraw.text(30, 80, "Press     to play version 2.0");
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(16.5,90,"O");
            StdDraw.text(16.5,80,"T");
        	StdDraw.show();
        	if(StdDraw.isKeyPressed(79)){
               level = 1;
               game =true;
               choseLevel = false;
            }
        	if(StdDraw.isKeyPressed(84)){
                level = 2;
                game =true;
                choseLevel = false;
             }
        }
        
        while (game)  { 
            
            int x = c%10;
            if(StdDraw.isKeyPressed(37)){
                left = true;
                up = false;
                down = false;
                right = false;
            }
            if(StdDraw.isKeyPressed(38)){
                left = false;
                up = true;
                down = false;
                right = false;
            }
            if(StdDraw.isKeyPressed(39)){
                left = false;
                up = false;
                down = false;
                right = true;
            }
            if(StdDraw.isKeyPressed(40)){
                left = false;
                up = false;
                down = true;
                right = false;
            }
            if( left && controller.arr[rx-4][ry] != 1 ){
                vx = -speedPlayer;
                vy=0;
                imagePlayer="./res/img/pacman-left.png";
               
            }else if(  up && controller.arr[rx][ry+4] != 1 ){
                vx = 0;
                vy=speedPlayer;
                imagePlayer="./res/img/pacman-up.png";
            }else if(  right && controller.arr[rx+4][ry] != 1){
                vx = speedPlayer;
                vy=0;
                imagePlayer="./res/img/pacman-right.png";
            }
            else if(down && controller.arr[rx][ry-4] != 1 ){
                vx = 0;
                vy=-speedPlayer;
                imagePlayer="./res/img/pacman-down.png";
            }else{
                vx = 0;
                vy = 0;
            }
            rx = rx + vx;
            ry = ry + vy;
            StdDraw.clear(StdDraw.BLACK);
            StdDraw.setPenColor(StdDraw.BLUE);
            
            switch(level) {
           
	            case 1:{
	            	map1.paint();
	            	// food
	            	for(int i=0;i<600;i=i+10){
	                     for(int j=0;j<300;j=j+10){
	                         if(controller.arr[i][j] ==0){
	                             StdDraw.setPenColor(StdDraw.WHITE);
	                             //Size of food
	                             StdDraw.filledCircle(i,j,1.2);  
	                             double r =   Math.pow((rx - i),2)+Math.pow((ry-j),2);
	                             if(Math.sqrt(r)<5){
	                                 controller.arr[i][j] =3;
	                                 food1 -=1;
	                             }
	                         }
	                     }
	                 }
	                 if(food1==0){
	                     win = true;
	                     game = false;
	                 }    
	                 // ghost
	                 map1.ghostUpdate();
	                 double r1 =   Math.pow((rx - map1.posXghost1),2)+Math.pow((ry-map1.posYghost1),2);
	                 double r2 =   Math.pow((rx - map1.posXghost2),2)+Math.pow((ry-map1.posYghost2),2);
	                 double r3 =   Math.pow((rx - map1.posXghost3),2)+Math.pow((ry-map1.posYghost3),2);
	                 double r4 =   Math.pow((rx - map1.posXghost4),2)+Math.pow((ry-map1.posYghost4),2);
	                 
	                 if((Math.sqrt(r1)<6)||(Math.sqrt(r2)<6)||(Math.sqrt(r3)<6)||(Math.sqrt(r4)<6))
	                 {
	                     lose = true;
	                     game = false;
	                     start = false;
	                 } 
	                 map1.ghostPaint();
	            	break;	
	            }
            	
	            case 2:{ 
	            	map2.paint();
	            	//food
	            	for(int i=0;i<600;i=i+9){
	                     for(int j=0;j<300;j=j+7){
	                         if(controller.arr[i][j] ==0){
	                             StdDraw.setPenColor(StdDraw.WHITE);
	                             StdDraw.filledCircle(i,j,0.9);  
	                             double r =   Math.pow((rx - i),2)+Math.pow((ry-j),2);
	                             if(Math.sqrt(r)<5){
	                                 controller.arr[i][j] =3;
	                                 food2 -=1;
	                             }
	                         }
	                     }
	                 }
                        if(food2==0){
	                     win = true;
	                     game = false;
	                 }
                        
                        X = controller.randomMovie(huong1,map2.posXghost1,map2.posYghost1)[0];
                        Y = controller.randomMovie(huong1,map2.posXghost1,map2.posYghost1)[1];
                        X1 = controller.randomMovie(huong1,map2.posXghost1,map2.posYghost1)[2];
                        Y1 = controller.randomMovie(huong1,map2.posXghost1,map2.posYghost1)[3];
                        
	            	if ((controller.arr[X][Y]!=1)&&(X>=9)&&(X<=45)&&(Y>=7)&&(Y<=93)&&(controller.arr[X1][Y1]!=1)){
                            map2.posXghost1 = X;
                            map2.posYghost1 = Y;
                        }
                        else
                        {
                            huong1 = controller.Random();
                        }
                        
                         X = controller.randomMovie(huong2,map2.posXghost2,map2.posYghost2)[0];
                         Y = controller.randomMovie(huong2,map2.posXghost2,map2.posYghost2)[1];
                         X1 = controller.randomMovie(huong2,map2.posXghost2,map2.posYghost2)[2];
                        Y1 = controller.randomMovie(huong2,map2.posXghost2,map2.posYghost2)[3];
                       
	            	if ((controller.arr[X][Y]!=1)&&(X>=153)&&(X<=189)&&(Y>=7)&&(Y<=93)&&(controller.arr[X1][Y1]!=1)){
                            map2.posXghost2 = X;
                            map2.posYghost2 = Y;
                        }
                        else
                        {
                            huong2 = controller.Random();
                        }
                        
                        X = controller.randomMovie(huong3,map2.posXghost3,map2.posYghost3)[0];
                        Y = controller.randomMovie(huong3,map2.posXghost3,map2.posYghost3)[1];
                        X1 = controller.randomMovie(huong3,map2.posXghost3,map2.posYghost3)[2];
                        Y1 = controller.randomMovie(huong3,map2.posXghost3,map2.posYghost3)[3];
                       
	            	if ((controller.arr[X][Y]!=1)&&(X>=63)&&(X<=135)&&(Y>=65)&&(Y<=93)&&(controller.arr[X1][Y1]!=1)){
                            map2.posXghost3 = X;
                            map2.posYghost3 = Y;
                        }
                        else
                        {
                            huong3 = controller.Random();
                        }
                        
                        X = controller.randomMovie(huong4,map2.posXghost4,map2.posYghost4)[0];
                        Y = controller.randomMovie(huong4,map2.posXghost4,map2.posYghost4)[1];
                       X1 = controller.randomMovie(huong4,map2.posXghost4,map2.posYghost4)[2];
                        Y1 = controller.randomMovie(huong4,map2.posXghost4,map2.posYghost4)[3];
	            	
                        if ((controller.arr[X][Y]!=1)&&(X>=63)&&(X<=135)&&(Y>=7)&&(Y<=28)&&(controller.arr[X1][Y1]!=1)){
                            map2.posXghost4 = X;
                            map2.posYghost4 = Y;
                        }
                        else
                        {
                            huong4 = controller.Random();
                        }
                        
                        if (controller.duoi(rx,ry)==0){
                            k =0;
                        }
                        
                        if (controller.duoi(rx,ry)!=0)
                        {
                            k1 = controller.duoi(rx,ry);
                            
                            if (k==0){
                            
                            map2.Ghost5 = controller.Ghost(k1);
                            map2.Ghost6 = controller.Ghost(k1);
                            map2.posXghost5 = controller.creatGhost(k1)[0];
                            map2.posYghost5 = controller.creatGhost(k1)[1];
                            map2.posXghost6 = controller.creatGhost(k1)[2];
                            map2.posYghost6 = controller.creatGhost(k1)[3];
                            
                            k=1;
                            
                            }
                            A = controller.randomMovie(huong5,map2.posXghost5,map2.posYghost5)[0];
                            B = controller.randomMovie(huong5,map2.posXghost5,map2.posYghost5)[1];
                            A1 = controller.randomMovie(huong5,map2.posXghost5,map2.posYghost5)[2];
                            B1 = controller.randomMovie(huong5,map2.posXghost5,map2.posYghost5)[3];
                            //System.out.println(A+" "+B);
                            
                            
                            
                            if ((controller.arr[A][B]!=1)&&(A>=a[k1-1])&&(A<=b[k1-1])&&(B>=c1[k1-1])&&(B<=d[k1-1])&&(controller.arr[A1][B1]!=1)){
                            map2.posXghost5 = A;
                            map2.posYghost5 = B;
                            System.out.println("T/M");
                            System.out.println(map2.posXghost5 + "''' " + map2.posYghost5);
                            }
                            else
                            {
                                huong5 = controller.Random();
                                System.out.println("1");    
                            }
                            
                            A = controller.randomMovie(huong6,map2.posXghost6,map2.posYghost6)[0];
                            B = controller.randomMovie(huong6,map2.posXghost6,map2.posYghost6)[1];
                            A1 = controller.randomMovie(huong6,map2.posXghost6,map2.posYghost6)[2];
                            B1 = controller.randomMovie(huong6,map2.posXghost6,map2.posYghost6)[3];
                            //System.out.println(A+" "+B);
                            
                            
                            
                            if ((controller.arr[A][B]!=1)&&(A>=a[k1-1])&&(A<=b[k1-1])&&(B>=c1[k1-1])&&(B<=d[k1-1])&&(controller.arr[A1][B1]!=1)){
                            map2.posXghost6 = A;
                            map2.posYghost6 = B;
                            System.out.println("T/M");
                            System.out.println(map2.posXghost5 + "''' " + map2.posYghost5);
                            }
                            else
                            {
                                huong6 = controller.Random();
                                System.out.println("1");    
                            }
                            
                            controller.paintNewGhost(k,map2.Ghost5,map2.posXghost5,map2.posYghost5);
                            controller.paintNewGhost(k,map2.Ghost6,map2.posXghost6,map2.posYghost6);
                            
                            double r5 =   Math.pow((rx - map2.posXghost5),2)+Math.pow((ry-map2.posYghost5),2);
	                    double r6 =   Math.pow((rx - map2.posXghost6),2)+Math.pow((ry-map2.posYghost6),2);
                            if((Math.sqrt(r5)<6)||(Math.sqrt(r6)<6))
	                 {
	                     lose = true;
	                     game = false;
	                     start = false;
	                 }
                        }
                        
                        map2.ghostPaint();
                        double r1 =   Math.pow((rx - map2.posXghost1),2)+Math.pow((ry-map2.posYghost1),2);
	                 double r2 =   Math.pow((rx - map2.posXghost2),2)+Math.pow((ry-map2.posYghost2),2);
	                 double r3 =   Math.pow((rx - map2.posXghost3),2)+Math.pow((ry-map2.posYghost3),2);
	                 double r4 =   Math.pow((rx - map2.posXghost4),2)+Math.pow((ry-map2.posYghost4),2);
	                 
	                 if((Math.sqrt(r1)<6)||(Math.sqrt(r2)<6)||(Math.sqrt(r3)<6)||(Math.sqrt(r4)<6))
	                 {
	                     lose = true;
	                     game = false;
	                     start = false;
	                 }
	            	break;
	            }
            }
         // animation player
            if(x<5){
                StdDraw.picture(rx,ry,imagePlayer,6,6);
                c +=1;
            }else{
                StdDraw.setPenColor(StdDraw.YELLOW);
                StdDraw.filledCircle(rx,ry,3);
                c +=1;
            }
            //show
            StdDraw.show();
            StdDraw.pause(8);
        } 
        
        //win
        if(win){
            StdDraw.picture(100,50,"./res/img/win.png");
            StdDraw.show();
            StdAudio.play("./res/sound/you win.wav");
            all = false;
            Font fontWin =  new Font("Impact",Font.ITALIC,45);
            StdDraw.setFont(fontWin);
            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.text(90,10,"Press                              To Play Again!!");
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.text(78, 10, "BACKSPACE  ");
            StdDraw.show();
            while(win) {
            	if(StdDraw.isKeyPressed(8)) {
            		all = true;
                	win = false;
                	choseLevel = true;
                	start = false; 
            	}
            	
            }
        }
        //lose
        if(lose){
            StdDraw.picture(100,50,"./res/img/you_lose.png");
            StdDraw.setPenColor(StdDraw.RED);
            Font fontLose = new Font("VNI-Lithos",Font.BOLD, 36);
            StdDraw.setFont(fontLose);
            StdDraw.text(80, 40, "Try Again :(((( ");
            StdDraw.text(80, 20, "Press              to play again!");
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.text(60, 20,"SPACE");
            StdDraw.show();
            StdAudio.play("./res/sound/Player Die.wav");
            all = false;
            while(lose){
                if(StdDraw.isKeyPressed(32)){
                all = true;
                lose = false;
                choseLevel = true;
                start = false;
            }
            }
       }
    }    
    } 
} 

