package interfacejava.practice;

public class Artist {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        sf.getShape(new Circle());
    }
}
