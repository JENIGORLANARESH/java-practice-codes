package collectionFrameworkLibrary.mapsinterface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.*;;

public class MapDemo4 {
    public static void main(String[] args) throws Exception {
        Map<String,Integer> m = new LinkedHashMap<String,Integer>();
        File f = new File("D:\\Practice\\JAVA\\collectionFrameworkLibrary\\mapsinterface\\Textfile.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String str = "";
        while ((str = br.readLine() ) != null) {
            // System.out.println(str);
            
            String[] arr = str.split(" ");
            for(int i=0; i<arr.length; i++){
                if(m.containsKey(arr[i])){
                    m.put(arr[i], m.get(arr[i])+1);
                }
                else{
                    m.put(arr[i], 1);
                }
            }
        }

        System.out.println(m);

        br.close();

    }

}
