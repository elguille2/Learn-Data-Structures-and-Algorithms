package sortingAlgorithms;

import java.util.Hashtable;

public class HashTables {

    public static void main(String[] args) {

        Hashtable<String, String> hashtable = new Hashtable<>(21); // We can increase the size of the hashtable to avoid collisions

        hashtable.put("100", "Kaladin");
        hashtable.put("123", "Teft");
        hashtable.put("321", "Lopen");
        hashtable.put("789", "Sigzil");
        hashtable.put("777", "Numuhukumakiaki'aialunamor");
        hashtable.put("666", "Moash");

        hashtable.remove("666");

        // For Integer keys:
//        for (Integer key: hashtable.keySet()){
//            System.out.println(key.hashCode() % 10 + "\t\t" + key + "\t\t" + hashtable.get(key));
//        }

        // For String keys:
        for (String key: hashtable.keySet()){
            System.out.println(key.hashCode() % 21 + "\t\t" + key + "\t\t" + hashtable.get(key));
        }

    }

}
