package collectionFrameworkLibrary.mapsinterface;

// import java.util.HashMap;
import java.util.Map;
// import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Iterator;
// import java.util.LinkedHashMap;

public class MapDemo2 implements Comparator<Integer>{
    public static void main(String[] args) {
        // Map<Integer, String> m = new HashMap<Integer,String>();
        // Map<Integer, String> m = new LinkedHashMap<Integer, String>();
        Map<Integer, String> m = new TreeMap<Integer, String>(new MapDemo2());
        m.put(101, "Apple");
        m.put(102, "Banana");
        m.put(110, "Orange");
        m.put(88, "Mosambi");
        m.put(103, "Grape");
        m.put(104, "Sapota");

        // Set<Entry<Integer, String>> s = m.entrySet();
        // Iterator<Entry<Integer,String>> itr = s.iterator();      
        // ABOVE OR BELOW
        Iterator<Entry<Integer,String>> itr = m.entrySet().iterator();
     
        while (itr.hasNext()) {
            Entry<Integer,String> e = itr.next();
            System.out.println(e.getKey()+ "\t" + e.getValue());
        }

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
