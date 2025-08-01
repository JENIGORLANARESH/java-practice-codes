package designPatterns.prototypeDesignPattern;

public class Book {
    private int id;
    private String name;
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + "]";
    }
    
}
