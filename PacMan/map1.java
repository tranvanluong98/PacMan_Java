    
public class map1 {
	static int posXghost1=10;
	static int posYghost1=90;
	static int posXghost2=190;
	static int posYghost2=10;
	static int posXghost3=140;
	static int posYghost3=90;
	static int posXghost4=60;
	static int posYghost4=10;
	static int huong =0;
	static String Ghost1 = "./res/img/ghost1.png";
	static String Ghost2 = "./res/img/ghost2.png"; 
	static String Ghost3 = "./res/img/ghost3.png";
	static String Ghost4 = "./res/img/ghost4.png";
	static  int huongGhost1 =0;
	static int huongGhost2 =2;
	static int huongGhost3 =1;
	static int huongGhost4 =3;
	private static Controller controller;
	static void paint() {
		 	controller.border(53,86,"./res/img/header1.jpg",5,20);
		    controller.border(146,86,"./res/img/header1.jpg",5,20);
		    controller.border(53,14,"./res/img/header2.jpg",5,20);
		    controller.border(146,14,"./res/img/header2.jpg",5,20);
		    controller.border(2,48,"./res/img/doc1.jpg",5,97);
		    controller.border(100,98,"./res/img/ngang1.jpg",200,5);
		    controller.border(102,2,"./res/img/ngang2.jpg",196,5);
		    controller.border(198,50,"./res/img/doc2.jpg",5,91);
		    // ô vuông ở trung tâm
		    controller.border(76.9,52,"./res/img/center2.jpg",4,20);
		    controller.border(116.2,59.3,"./res/img/center5.jpg",10,5);
		    controller.border(83.8,59.3,"./res/img/center1.jpg",10,5);
		    controller.border(123.2,52,"./res/img/center4.jpg",4,20);
		    controller.border(100,40,"./res/img/center3.jpg",50,5);
		    // hàng ngang ở trung tâm
		    controller.border(100,78,"./res/img/breadthCenter.jpg",50,5);
		    controller.border(100,22,"./res/img/breadthCenter.jpg",50,5);
		    // hàng ngang bé
		    controller.border(50,59.3,"./res/img/smallBreadth.jpg",15,5);
		    controller.border(150,59.3,"./res/img/smallBreadth.jpg",15,5);
		    controller.border(50,40,"./res/img/smallBreadth.jpg",15,5);
		    controller.border(150,40,"./res/img/smallBreadth.jpg",15,5);
		    // vuông góc 1
		    controller.border(19,67,"./res/img/part1.jpg",5,17);
		    controller.border(25,78,"./res/img/part2-1.jpg",17,5);
		    // vuông góc 2
		    controller.border(181,67,"./res/img/part1.jpg",5,17);
		    controller.border(175,78,"./res/img/part2-2.jpg",17,5);
		    // vuông góc 3
		    controller.border(19,33,"./res/img/part3.jpg",5,17);
		    controller.border(25,22,"./res/img/part4-1.jpg",17,5);
		    // vuông góc 4
		    controller.border(181,33,"./res/img/part3.jpg",5,17);
		    controller.border(175,22,"./res/img/part4-2.jpg",17,5);
	}
   static void ghostUpdate() {
	   huongGhost1 = controller.updateSwipe(huongGhost1,posXghost1,posYghost1,10,40,90,10)[0];
       posXghost1 = controller.updateSwipe(huongGhost1,posXghost1,posYghost1,10,40,90,10)[1];
       posYghost1 = controller.updateSwipe(huongGhost1,posXghost1,posYghost1,10,40,90,10)[2];
       // ghost2
       huongGhost2 = controller.updateSwipe(huongGhost2,posXghost2,posYghost2,160,190,90,10)[0];
       posXghost2 = controller.updateSwipe(huongGhost2,posXghost2,posYghost2,160,190,90,10)[1];
       posYghost2 = controller.updateSwipe(huongGhost2,posXghost2,posYghost2,160,190,90,10)[2];
       // ghost3
       huongGhost3 = controller.updateSwipe(huongGhost3,posXghost3,posYghost3,60,140,90,70)[0];
       posXghost3 = controller.updateSwipe(huongGhost3,posXghost3,posYghost3,60,140,90,70)[1];
       posYghost3 = controller.updateSwipe(huongGhost3,posXghost3,posYghost3,60,140,90,70)[2];
       // ghost 4
       huongGhost4 = controller.updateSwipe(huongGhost4,posXghost4,posYghost4,60,140,30,10)[0];
       posXghost4 = controller.updateSwipe(huongGhost4,posXghost4,posYghost4,60,140,30,10)[1];
       posYghost4 = controller.updateSwipe(huongGhost4,posXghost4,posYghost4,60,140,30,10)[2];
   }
   static void ghostPaint() {
	   StdDraw.picture(posXghost1,posYghost1,Ghost1,7,7);
       StdDraw.picture(posXghost2,posYghost2,Ghost2,7,7);
       StdDraw.picture(posXghost3,posYghost3,Ghost3,7,7);
       StdDraw.picture(posXghost4,posYghost4,Ghost4,7,7);
   }
   
}
