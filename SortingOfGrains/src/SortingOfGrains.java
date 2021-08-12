import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortingOfGrains {
    public static void main(String[] args) {
        List<Integer> allNumber = new ArrayList<>();
        int i = 0, j = 0, num = 0;
        System.out.println("Collection of 100 numbers: ");
        Random rand = new Random();
        for (i = 0; i < 100; i++) {
            j = rand.nextInt(500);
            allNumber.add(j);

        }
        System.out.println(allNumber);

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        List<Integer> thirdList = new ArrayList<>();
        for (i = 0; i < allNumber.size(); i++) {
            num = allNumber.get(i);
            if (num % 2 == 0) {
                firstList.add(num);

            }
            if (num % 3 == 0) {
                secondList.add(num);

            } else {
                thirdList.add(num);

            }
        }
        System.out.println("Numbers Divisible by 2:" + firstList);
        System.out.println("Numbers Divisible by 3:" + secondList);
        System.out.println("Other:" + thirdList);
    }


}




