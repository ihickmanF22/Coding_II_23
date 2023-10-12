public class LoopShape {
    public static String rect;

    public static void rWidth(int width) {
        //Try Repeating
        char jl = '#';
            for (int il = 0; il <= width; il++) {
                System.out.print(jl);
            }
        }

    static void createRectangle(int width, int height) {
        //Draw a Rectangle
        if (width < 1 || height < 1) {
            System.out.println("error:");
        } else {
            //1st Row
            for (int i =0; i < width; i++) {
                rect += "#";
            }
            rect += "\n";
        }
            //In-Beetween
            for (int i = 0; i < height -2; i++) {
                rect += "#";
                for (int j = 0; j < width - 2; j++) {
                    rect += " ";
                }
                rect += "#\n";
            }
            //Last Row
            if (height > 1){
                for (int i = 0; i < width; i++) {
                    rect += "#";
                }
            }
            System.out.println(rect);
        }

    static void createTriangle(int leg){
        if (leg < 1){
            System.out.println("error: Invalid Dimensions");
        } else {
        //Draw an Isosceles Right Triangle
        String tri = "";
            //First Row
            tri += "#\n";
            if (leg > 1){
                for (int i = 0; i < leg - 2; i++) {
                    tri += "#";
                    for (int j = 0; j < i; j++) {
                        tri += " ";
                    }
                    tri += "#\n";
                }
                for (int i = 0; i < leg; i++) {
                    tri += "#";
                }
            } 
            System.out.println(tri);
        }
    }
}