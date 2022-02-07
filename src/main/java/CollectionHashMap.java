import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionHashMap {

    public static void main(String[] args) {

        System.out.println("Initial HashMap");

        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "Red ");
        newMap.put(2, "Blue ");
        newMap.put(3, "Green ");
        newMap.put(4, "Brown ");
        newMap.put(5, "Purple ");

        for (Map.Entry<Integer,String> entry : newMap.entrySet()) {
            System.out.printf(entry.getKey() + " - " + entry.getValue() + "; ");
        }
        System.out.println("\n");

        sizeMappings(newMap);
        copyHashMap(newMap);
        checkIsEmpty(newMap, removeMappings(newMap));
        shallowCopy();
        containsSpecifiedKey(newMap);
        containsSpecifiedValue(newMap);
        creationOfView(newMap);
        getValueSpecifiedKey(newMap);
        getSetViewKeys(newMap);
        getSetViewValues(newMap);
    }


    public static void sizeMappings (Map hashMap) {
        System.out.println("1. count the number of key-value (size) mappings in a map: ");
        System.out.println("Size of the hash map: " + hashMap.size());
        System.out.println("");

    }

    public static void copyHashMap (Map hashMap) {
        System.out.println("2. copy all of the mappings from the specified map to another map");
        Map<Integer, String> newMap1 = new HashMap<>();
        newMap1.put(6, "Orange");
        newMap1.put(7, "Black");
        System.out.println("Second Map: " + newMap1.get(6) +" " + newMap1.get(7));
        newMap1.putAll(hashMap);
        System.out.println("New map: " + newMap1);
        System.out.println("");
    }

    public static Map removeMappings (Map hashMap) {
        hashMap = new HashMap();
        System.out.println("3. remove all the mappings from a map: ");
        hashMap.clear();
        System.out.println(hashMap);
        System.out.println("");
        return hashMap;
    }

    public static void checkIsEmpty (Map hashMap, Map hashMap1) {
        System.out.println("4. check whether a map contains key-value mappings (empty) or not");
        boolean result = hashMap.isEmpty();
        System.out.println("Is hash map empty: " + result);
        result = hashMap1.isEmpty();
        System.out.println("Is hash map empty: " + result);
        System.out.println("");
    }
    public static void shallowCopy () {
        System.out.println("5. get a shallow copy of a HashMap instance");
        HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Blue");

        System.out.println("Original map: " + hashMap);
        HashMap<Integer,String> newMap= new HashMap<Integer,String>();
        newMap = (HashMap)hashMap.clone();
        System.out.println("Cloned map: " + newMap);
        System.out.println("");
    }

    public static void containsSpecifiedKey (Map hashMap) {
        System.out.println("7. test if a map contains a mapping for the specified key");
        if (hashMap.containsKey(2)) {
            System.out.println("Does contain: " + hashMap.get(2));
        } else {
            System.out.println("Does NOT contain: " + hashMap.get(2));
            System.out.println("");
        }
        System.out.println("");
    }

    public static void containsSpecifiedValue (Map hashMap) {
        System.out.println("8. test if a map contains a mapping for the specified value");
        if (hashMap.containsValue("Green")) {
            System.out.println("Does contain value.");
        } else {
            System.out.println("Does NOT contain such a value.");
        }
        System.out.println("");
    }

    public static void creationOfView (Map hashMap) {
        System.out.println("9. create a set view of the mappings contained in a map");

        Set set = hashMap.entrySet();
        System.out.println("Set values: " + set);
        System.out.println("");
    }
    public static void getValueSpecifiedKey (Map hashMap) {
        System.out.println("10. get the value of a specified key in a map");
        System.out.println("get the value of a specified key in a map");
        String value = (String) hashMap.get(3);
        System.out.println("Value is: " + value);
        System.out.println("");
    }
    public static void getSetViewKeys (Map hashMap) {
        System.out.println("11. get a set view of the keys contained in this map:");
        Set keySet = hashMap.keySet();
        System.out.println("Key set values are: " + keySet);
        System.out.println("");
    }

    public static void getSetViewValues (Map hashMap) {
        System.out.println("12. get a collection view of the values contained in this map:");
        System.out.println("Collection view is: "+ hashMap.values());
    }
}
