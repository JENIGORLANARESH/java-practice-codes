package collectionFrameworkLibrary.arrays.cars;

import java.util.*;

public class Owner {
    public Car[] readCars() {
        Car[] arr = new Car[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter car name :");
            String name = sc.nextLine();
            System.out.println("Enter Color :");    
            String color = sc.nextLine();
            System.out.println("Enter Price :");
            int price = sc.nextInt();
            sc.nextLine();
            arr[i] = new Car(name, color, price);
        }
        sc.close();
        return arr;
    }

    public void displayCar(Car[] cars){
        System.out.println("Name\t\t Color \t\t Price");
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i].getName() + " \t\t" + cars[i].getColor()+ " \t\t" + cars[i].getPrice());
        }
    } 

    public void top3(Car[] cars){
        System.out.println("Name\t\t Color \t\t Price");
        for(Car ele:cars){
            if(ele.getPrice()>300){
                System.out.println(ele.getName() + " \t\t" + ele.getColor()+ " \t\t" + ele.getPrice());
            }
        }
    }
}
