package collectionFrameworkLibrary.mapsinterface;

import java.util.*;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        sc.close();
        // int value = 1;
        // for(char c = 'a'; c<= 'z'; c++,value++){
        // m.put(c, value);
        // }

        // int total = 0;
        // for(int i=0; i<str.length(); i++){
        // total += m.get(str.charAt(i));
        // }
        // System.out.println("total : " + total);

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (m.containsKey(ch)) {
                m.put(ch, m.get(ch)+1);
            } else {
                m.put(ch, 1);
            }
        }

        System.out.println(m);
    }
}
