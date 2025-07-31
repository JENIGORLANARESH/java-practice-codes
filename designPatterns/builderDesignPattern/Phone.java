package designPatterns.builderDesignPattern;


    // ***** Builder Design Pattern -> Creational Design Pattern    ******


public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public Phone(String os,int ram,String processor,double screenSize,int battery){
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    public String toString(){
        return "Os : " + os + " Ram : " + ram + " Processor : " + processor + " ScreenSize : " + screenSize + " Battery : " + battery;
    }
}
