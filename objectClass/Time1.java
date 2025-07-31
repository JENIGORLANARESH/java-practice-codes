package objectClass;

public class Time1 {
    public static void main(String[] args) {
        Watch wt1 = new Watch(10, 10, 10);
        Watch wt2 = new Watch(20, 20, 20);

        System.out.println(wt1);
        System.out.println(wt2);
        System.out.println(wt1.equals(wt2));
    }
}
