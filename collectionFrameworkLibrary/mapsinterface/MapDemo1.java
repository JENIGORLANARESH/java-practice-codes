package collectionFrameworkLibrary.mapsinterface;

// import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
// import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<>();
        m.put(101, "Naresh");
        m.put("hello", 102);
        m.put(null, 34.53);
        m.put("Jsp", null);

        System.out.println(m);

        System.out.println(m.put(101, "Mahesh"));
        System.out.println(m);
        System.out.println("Removed : " + m.remove(null));
        System.out.println(m.get("Jsp"));
        System.out.println(m.containsKey("hello"));
        System.out.println(m.containsValue(102));
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        
        // Set s = m.entrySet();
        // System.out.println(s);

        // Set k = m.keySet();
        // System.out.println(k);

        // Collection values = m.values();
        // System.out.println(values);
    }
}
