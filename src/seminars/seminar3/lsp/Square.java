package seminars.seminar3.lsp;

public class Square extends QuadRangle {
    protected int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return length * length;
    }
}
