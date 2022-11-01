package problemthree;

import java.util.LinkedList;

public class SortLinkedList {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        userInput.user();
    }

    public void function(int[] arr, int input) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            list.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (Integer i : list) {
            System.out.print(i);
        }

    }
}
