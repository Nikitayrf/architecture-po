package seminars.seminar3.lsp;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( 4, 5 );
        System.out.println("rectangle = "  + rectangle.area() + " m");

        Square square = new Square( 6 );
        System.out.println("square = " + square.area() + " m");
    }


}
