package designPatterns.compositeDesignPattern;
import java.util.*;
import java.util.ArrayList;

interface Components{
    void showPrice();
}

class Leaf implements Components{
    private int price;
    private String name;
    public Leaf(int price, String name){
        this.price = price;
        this.name = name;
    }

    public void showPrice(){
        System.out.println(name + " : " +price);
    }
}

class Composite implements Components{
    String name;
    List<Components> l = new ArrayList<>();

    public Composite(String name){
        this.name = name;
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for(Components ele: l){
            ele.showPrice();
        }
    }

    public void addComponent(Components com){
        l.add(com);
    }
    
}