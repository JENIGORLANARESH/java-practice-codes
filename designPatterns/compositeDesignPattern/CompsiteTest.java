package designPatterns.compositeDesignPattern;

public class CompsiteTest {
    public static void main(String[] args) {
        Components ram = new Leaf(3000, "RAM");
        Components mon = new Leaf(5000, "Monitor");
        Components key = new Leaf(1000, "Keyboard");
        Components cpu = new Leaf(10000, "CPU");
        Components hd = new Leaf(4000, "HDD");

        Composite pr = new Composite("Periferal");
        Composite mb = new Composite("Mother Board");
        Composite cb = new Composite("Cabinet");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);
        pr.addComponent(key);
        pr.addComponent(mon);
        cb.addComponent(hd);
        cb.addComponent(mb);

        computer.addComponent(pr);
        computer.addComponent(cb);

        ram.showPrice();
        // pr.showPrice();
        // computer.showPrice();

    }
}
