import static java.lang.Math.random;
import java.util.*;

public class Controller {
	static int[][] arr = new int [600][300];
	public static void border(double x,double y,String img,double a,double b){
        StdDraw.picture(x,y,img,a,b);
        int m = (int) Math.round(a);
        int n = (int) Math.round(b);
        int p = (int) Math.round(x);
        int q = (int) Math.round(y);
        for(int i=p-m/2;i<=p+m/2;i++){
            for(int j=q-n/2;j<=q+n/2;j++){
                if(i>=0&&j>=0){ 
                   arr[i][j]=1;
                }
            }
        }
   }
	
	 public static int[] updateSwipe(int swipe, int currentX, int currentY, int positionX1, int positionX2, int positionY1, int positionY2)
	    {
	        if (swipe % 4 == 0)
		{
			currentX = currentX +1;
			if (currentX == positionX2)
			{
				swipe = swipe +1;
			}			
		} else
		if (swipe % 4 == 1)
		{
			currentY = currentY -1;
			if (currentY == positionY2)
			{
				swipe = swipe +1;
			}			
		} else
		if (swipe % 4 == 2)
		{
			currentX = currentX -1;
			if (currentX == positionX1)
			{
				swipe = swipe +1;
			}			
		} else
		if (swipe % 4 == 3)
		{
			currentY = currentY +1;
			if (currentY == positionY1)
			{
				swipe = swipe +1;
			}			
		}
	    int[] A = {swipe,currentX,currentY};
	    return A;
	}
        
         public static int Random(){
             double ran = random();
             ran = ran *4;
             return (int)ran;
         }
         
         public static int[] randomMovie(int a, int nowX, int nowY){
             boolean test = true;
                 //int a = Random();
                 int nowX1 = nowX; 
                 int nowY1 = nowY;
                 if (a == 0){
                         nowX = nowX - 1;
                         nowX1 = nowX - 4;
                 }
                 if (a == 1){
                         nowY = nowY + 1;
                         nowY1 = nowY + 4;
                 }
                 if (a ==2){
                         nowX = nowX + 1;
                         nowX1 = nowX + 4;
                 }
                 if (a==3){
                         nowY = nowY - 1;
                         nowY1 = nowY - 4;
                 }
                  int[] A = {nowX,nowY,nowX1,nowY1};
                         return A;
         }
         
         public static int duoi(int X, int Y){
             int a =0;
             if ((X>=0)&&(X<=52)&&(Y>=0)&&(Y<=100)){
                 a=1;
             }
             if ((X>=148)&&(X<=200)&&(Y>=0)&&(Y<=100)){
                 a=2;
             }
             if ((X>=58)&&(X<=142)&&(Y>=65)&&(Y<=100)){
                 a=3;
             }
             if ((X>=58)&&(X<=142)&&(Y>=0)&&(Y<=28)){
                 a=4;
             }
             return a;
         }
         
         public static int[] creatGhost(int k){
             int a = 0;
             int b = 0;
             int c = 0;
             int d = 0;
             
             if (k==1){
                 a = 27;
                 b = 93;
                 c = 27;
                 d = 7;
             }
             
             if (k==2){
                 a=173;
                 b=93;
                 c=173;
                 d=7;
             }      
             
             if (k==3){
                 a=72;
                 b=93;
                 c=117;
                 d=93;
             }
             
             if (k==4){
                 a=72;
                 b=7;
                 c=117;
                 d=7;
             }
             
             int[] A = {a,b,c,d};
             return A;
         }
         
         public static String Ghost(int number){
             String ghost = "./res/img/ghost1.png";
             
             if (number == 1)
             {
                 ghost = "./res/img/ghost1.png";
             }
             
             if (number == 2)
             {
                 ghost = "./res/img/ghost2.png";
             }
             
             if (number ==3)
             {
                 ghost = "./res/img/ghost3.png";
             }
             
             if (number ==4)
             {
                 ghost = "./res/img/ghost4.png";
             }
             
             return ghost;
         }
         
         public static void paintNewGhost(int k, String ghost, int X, int Y){
             if (k!=0)
             {
                 StdDraw.picture(X,Y,ghost,7,7);
             }
         }
//	 
//	 public static int[] updateGhostMap2(int posX,int posY) {
//		 
//	 }
}
