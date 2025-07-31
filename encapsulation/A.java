package encapsulation;

public class A {
    private int rollNo;
    private String name;
    private float CGPA;

    A(){

    }

    A(int rollNo,String name, float CGPA){
        // super();
        this.rollNo = rollNo;
        this.name = name;
        this.CGPA = CGPA;
    }

    int getRoll(){
        return rollNo;
    }
    String getName(){
        return name;
    }
    float getCGPA(){
        return CGPA;
    }
    void setRoll(int rollNo){
        this.rollNo = rollNo;
    }
    void setCGPA(float CGPA){
        this.CGPA = CGPA;
    }
    void setName(String name){
        this.name = name;
    }
}
