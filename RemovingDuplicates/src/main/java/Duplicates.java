import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        int i = 0, j = 0;
        System.out.println("Collection of 100 numbers: ");
        Random rand = new Random();
        for (i = 0; i < 100; i++) {
            j = rand.nextInt(20);
            myArrayList.add(j);

        }
        System.out.println(myArrayList);

        Set<Integer> set = new LinkedHashSet<Integer>(myArrayList);
        System.out.println("Collection without duplicate: ");
        System.out.println(set);

        int diff = myArrayList.size() - set.size();
        System.out.println("Number of deleted items: " + diff);

    }
}

