public class Main {

    public static void main(String[] args) {
        // write your code here
        Square[] squares = new Square[2];
        squares[0] = new Square(3, "red", true);
        squares[1] = new Square(5, "white", false);
        for (Square square : squares) {
            if (square.isFilled() == true) {
                System.out.println(square.howtoColor());
                System.out.println("Diện tích là: "+square.getArea());
            } else {
                System.out.println("Diện tích là: "+square.getArea());
            }
        }
    }
}
