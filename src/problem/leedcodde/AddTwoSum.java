package problem.leedcodde;

import java.util.Collections;
import java.util.LinkedList;

public class AddTwoSum {
    public static void main(String[] args) {

        AddTwoSum addTwoSum = new AddTwoSum();
        LinkedList<Integer> listTwo = new LinkedList<>();
        LinkedList<Integer> listOne = new LinkedList<>();
        for (int i = 0; i <= 5; i++) {
            listOne.add(i);
        }
        for (int i = 10; i >= 5; i--) {
            listTwo.add(i);
        }

        addTwoSum.addTwoNumbers(listOne, listTwo);
    }


    public void addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> ListNode = new LinkedList<>();
        l1.sort(Collections.reverseOrder());
        l2.sort(Collections.reverseOrder());
        int num1 = 0, num2 = 0;

        for (Integer integer : l1) {
            num1 = num1 * 10 + integer;
        }
        for (Integer integer : l2) {
            num2 = num2 * 10 + integer;
        }
        int temp = num1 + num2;
        do {
            ListNode.add(temp % 10);
            temp /= 10;
        } while (temp > 0);

        Collections.sort(ListNode);

        for (Integer a : ListNode) {
            System.out.print(a + " ");
        }

    }
}
