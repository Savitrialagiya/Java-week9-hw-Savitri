package week9hw;

import java.util.HashMap;
import java.util.Map;

public class Programme9_HashMap {
    public static void main(String[] args) {
        Programme9_HashMap obj = new Programme9_HashMap();
        obj.hashMapStoreKeysAndValues();
    }
    public void hashMapStoreKeysAndValues() {

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Savitri", 1);
        people.put("Hetarth", 2);
        people.put("Dhyan", 3);
        people.put("Nilesh", 4);
        people.put("Krishna", 5);

         for (String i :people.keySet()){
           System.out.println("key: " + i + " , " + " value: " + people.get(i));
        }
//        for (Map.Entry<String, Integer> peopleName : people.entrySet()) {
//            System.out.println(peopleName);
//        }

    }
}
