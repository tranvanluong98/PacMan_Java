
public class map2 {
	private static Controller controller;
	
	static String Ghost1 = "./res/img/ghost1.png";
	static String Ghost2 = "./res/img/ghost2.png"; 
	static String Ghost3 = "./res/img/ghost3.png";
	static String Ghost4 = "./res/img/ghost4.png";
        static String Ghost5;
        static String Ghost6;
        
        static int posXghost1=27;
	static int posYghost1=49;
	static int posXghost2=173;
	static int posYghost2=49;
	static int posXghost3=135;
	static int posYghost3=93;
	static int posXghost4=63;
	static int posYghost4=7;
        static int posXghost5;
        static int posYghost5;
        static int posXghost6;
        static int posYghost6;
        
        
		static void paint() {
		controller.border(100,1,"./res/img/map2_bot.PNG",200,3);
		controller.border(1,50,"./res/img/map2_left.PNG",2,95);
	    controller.border(100,98,"./res/img/map2_head1.PNG",200,3);
	    controller.border(199,50,"./res/img/map2_right.PNG",2,94.5);
	    //bot
	    controller.border(55,9,"./res/img/map2_bot1.PNG",5,15);
	    controller.border(88,9,"./res/img/map2_bot1.PNG",5,15);
	    controller.border(110.3,9,"./res/img/map2_bot1.PNG",5,15);
	    controller.border(144,9,"./res/img/map2_bot1.PNG",5,15);
	    //top
	    controller.border(55,89,"./res/img/map2_head2.PNG",5,15);
	    controller.border(99.5,83,"./res/img/map2_headcent.PNG",5,27);
	    controller.border(144,89,"./res/img/map2_head2.PNG",5,15);
	    // left
	    controller.border(18.5, 80, "./res/img/map2_docngan.PNG", 5, 15);
	    controller.border(18.5, 18, "./res/img/map2_docngan.PNG", 5, 15);
	    controller.border(18.5, 49, "./res/img/map2_vuongdoc.PNG", 5, 17);
	    controller.border(29.5, 42.5, "./res/img/map2_vuongngang.PNG", 17, 4.5);
	    // right
	    controller.border(180, 80, "./res/img/map2_docngan.PNG", 5, 15);
	    controller.border(180, 18, "./res/img/map2_docngan.PNG", 5, 15);
	    controller.border(179.3, 49, "./res/img/map2_vuongdoc1.PNG", 5, 17);
	    controller.border(172, 42.5, "./res/img/map2_vuongngang1.PNG", 20, 4.5);
	    // center
	    controller.border(80.7, 44, "./res/img/map2_cent2.PNG", 2.4, 20);
	    controller.border(85, 55, "./res/img/map2_cent1.PNG", 11, 2);
	    controller.border(99.9, 35.3, "./res/img/map2_cent3.PNG", 36, 2.4);
	    controller.border(116.4, 46.4, "./res/img/map2_cent4.PNG", 2.5, 20);
	    controller.border(111, 55.1, "./res/img/map2_cent5.PNG", 9, 2);
	    // ngang
	    controller.border(55, 70, "./res/img/map2_ngang.PNG", 25, 5);
	    controller.border(144, 70, "./res/img/map2_ngang.PNG", 25, 5);
	    controller.border(41, 28, "./res/img/map2_ngang.PNG", 12, 5);
	    controller.border(158, 28, "./res/img/map2_ngang.PNG", 12, 5);
	    // doc
	    controller.border(63, 45, "./res/img/map2_docngan.PNG", 5, 22);
	    controller.border(135, 45, "./res/img/map2_docngan.PNG", 5, 22);
	}
                
        /*static void ghostUpdate(){
            posXghost1 = controller.randomMovie(posXghost1,posYghost1,9,45,93,7)[0];
            posYghost1 = controller.randomMovie(posXghost1,posYghost1,9,45,93,7)[1];
        }*/
	
	static void ghostPaint() {
	   StdDraw.picture(posXghost1,posYghost1,Ghost1,7,7);
           StdDraw.picture(posXghost2,posYghost2,Ghost2,7,7);
           StdDraw.picture(posXghost3,posYghost3,Ghost3,7,7);
           StdDraw.picture(posXghost4,posYghost4,Ghost4,7,7);
   }
}