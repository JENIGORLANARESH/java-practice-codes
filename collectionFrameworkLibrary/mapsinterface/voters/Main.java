package collectionFrameworkLibrary.mapsinterface.voters;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Citizen> m = new LinkedHashMap<Integer,Citizen>();        
        m.put(1, new Citizen("Naresh", 18));
        m.put(2, new Citizen("Suresh", 29));
        m.put(3, new Citizen("Rajesh", 24));
        m.put(4, new Citizen("guru", 29));
        m.put(5, new Citizen("Ariv", 23));
        m.put(6, new Citizen("Aiaf", 22));

        Iterator<Entry<Integer,Citizen>> itr = m.entrySet().iterator();

        while (itr.hasNext()) {
            Entry<Integer,Citizen> ele = itr.next();
            int age = ele.getValue().getAge();
            if(age >= 25 && age <= 35){
                System.out.println(ele.getValue().getName());
            }
            if(ele.getValue().getName().charAt(0) == 'A'){
                System.out.println(ele.getValue().getName());
            }
        }
    }
}
