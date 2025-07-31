package designPatterns.builderDesignPattern;

public class CreatePhone {
    public static void main(String[] args) {
        Phone redMi = new PhoneBuilder().setOs("Android").setProcessor("Snapdragon").setBattery(3500).getPhone();
        System.out.println(redMi);
        Phone realMe = new PhoneBuilder().setOs("Android").setProcessor("MediaTech").getPhone();
        System.out.println(realMe);
    }
}
