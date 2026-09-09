package interfaces;

interface Drawable {
    void draw();
}
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
public class BasicInterface {

    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
    }
}