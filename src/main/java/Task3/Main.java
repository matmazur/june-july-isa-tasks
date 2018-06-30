package Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Dictionary d = new Dictionary();

        d.newEntry("Apple", "A fruit that grows on trees");

        System.out.println(d.look("Apple"));
//>>> A fruit that grows on trees

        System.out.println(d.look("Banana"));
//>>> Cant find entry for Banana


    }
    public static class Dictionary {
        Map<String, String> someMap = new HashMap<>();


        public void newEntry(String key, String value) {
            someMap.put(key, value);
        }

        public String look(String key) {

            if (someMap.get(key)==null)
                return "Cant find entry for " + key;

            return someMap.get(key);
        }
    }
}
