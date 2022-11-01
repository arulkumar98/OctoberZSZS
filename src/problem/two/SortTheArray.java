package problem.two;

import java.util.ArrayList;
public class SortTheArray {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        userInput.user();
    }

    public void array(int[] arr, int size) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int index = 0; index < size; index++) {
            if (index % 2 == 0) {
                oddList.add(arr[index]);
            } else {
                evenList.add(arr[index]);
            }
        }

        //oddList sort
        for (int row = 0; row < oddList.size(); row++) {
            for (int col = row + 1; col < oddList.size(); col++) {
                if (oddList.get(row) > oddList.get(col)) {
                    int temp = oddList.get(row);
                    oddList.set(row, oddList.get(row));
                    oddList.set(col, oddList.get(temp));
                }
            }
        }

        //evenList sort
        for (int row = 0; row < evenList.size(); row++) {
            for (int col = row + 1; col < evenList.size(); col++) {
                if (evenList.get(row) > evenList.get(col)) {
                    int temp = evenList.get(row);
                    evenList.set(row, evenList.get(row));
                    evenList.set(col, evenList.get(temp));
                }
            }
        }
        int i, j;
        for (i = 0, j = 0; i < oddList.size() && j < evenList.size(); i++, j++) {
            System.out.print(" " + oddList.get(i) + " " + evenList.get(j));
        }
    }
}
