package designPatterns.adapterDesignPattern;

public class PenAdapter implements Pen  {

    PioletPen pp = new PioletPen();
    @Override
    public void write(String write) {
        pp.mark(write);
    }
        
}
