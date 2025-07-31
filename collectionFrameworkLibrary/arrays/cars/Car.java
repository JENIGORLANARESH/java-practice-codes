package collectionFrameworkLibrary.arrays.cars;

public class Car {
    private String name;
    private String color;
    private int price;

    Car(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void setName(String name){
        this.name =name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }

    public String toString(){
        return name+" "+ color + " " + price;
    }

    public void display(Car[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }
    
}
