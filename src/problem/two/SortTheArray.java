package problemtwo;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheArray {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        userInput.user();
    }

    public void array(int[] n, int input) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int index = 0; index < input; index++) {
            if (n[index] == 1 || n[index] % 2 == 0 && n[index] > 0) {
                evenList.add(n[index]);
            } else oddList.add(n[index]);
        }

        Collections.sort(oddList);
        Collections.sort(evenList);

        for (int a : oddList) {
            System.out.print("Order list" + a + " ");
        }
        System.out.println();
        for (int b : evenList) {
            System.out.print("Even List " + b + " ");
        }


//        for (Integer integer : oddList) {
//            for (Integer value : evenList) {
//                ans.add(integer, value);
//            }
//        }
        try {
            for (int index = 0; index < input; index++) {
                if (index % 2 == 0) {
                    ans.set(index, oddList.get(index));
                } else {
                    ans.set(index, evenList.get(index));
                }
            }
            for (int answer : ans) {
                System.out.print(answer + " ");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("error");
        }
    }

}
