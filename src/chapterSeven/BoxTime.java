package chapterSeven;

public class BoxTime {
	public static void main(String arg[]){
        drawBox(5, 5, "pizza");
    }

    public static void drawBar(){
        System.out.println("****************");
    }

    public static void drawBox(int l, int w){

        for(int x =0; x < l; x++){
            for ( int y = 0; y < w; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawBox(int l, int w, String string){

        for(int x =0; x < l; x++){
            for ( int y = 0; y < w; y++){
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
