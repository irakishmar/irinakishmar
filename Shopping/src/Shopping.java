import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Shopping {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> purchases = new LinkedHashMap<String, Integer>();
        purchases.put("Bread", 3);
        purchases.put("Milk", 2);
        purchases.put("Eggs", 10);
        purchases.put("Chocolate", 4);
        purchases.put("Meat", 6);
        purchases.put("Pasta", 4);

        int result = 0;
        for (Map.Entry<String, Integer> entry : purchases.entrySet()) {
            result = result + entry.getValue();

            System.out.println(entry.getKey() + " - " + entry.getValue());

        }
        System.out.println("Total number of products: " + result);


        //for(String key: purchases.keySet()){
        // purchases.get(key);
        //System.out.println(purchases.get(key));
    }


}

