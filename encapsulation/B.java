package encapsulation;

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.setCGPA(4.3f);
        a.setName("naresh");
        a.setRoll(404);
        System.out.println("Roll :" + a.getRoll() + " Name :" + a.getName() + " CGPA :" + a.getCGPA());
        A b = new A(101,"Shiva",34.5f);
        System.out.println(b.getCGPA());
        System.out.println(b.getName());
        System.out.println(b.getRoll());
        A c = new A();
        c.setName("naveen");
        c.setCGPA(66.4f);
        c.setRoll(102);
        
    }
}
