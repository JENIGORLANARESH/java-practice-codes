package collectionFrameworkLibrary.mapsinterface.voters;

public class Citizen {
    private String name;
    private int age;
    public Citizen(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
