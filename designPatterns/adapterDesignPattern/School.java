package designPatterns.adapterDesignPattern;

public class School {
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        AssignmentWork as = new AssignmentWork();
        as.setPen(p);
        as.writeAssignment("Hello everyone");

    }
}

