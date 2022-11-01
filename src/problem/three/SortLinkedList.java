package problem.three;

import java.util.LinkedList;
import java.util.Scanner;

public class SortLinkedList {
    public static void main(String[] args) {
        SortLinkedList sortLinkedList = new SortLinkedList();
        sortLinkedList.input();
    }

    private void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the LinkedList Size");
        int input = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter the LinkedList Below");
        for (int index = 0; index < input; index++) {
            linkedList.add(scanner.nextInt());
        }
        singleFunction(linkedList);

    }

    public void singleFunction(LinkedList<Integer> list) {
        int number = 0;
        int index = 0;
        while (list.lastIndexOf(number) != index) {
            list.add(index, list.remove(list.lastIndexOf(number)));
            index++;
            if (list.lastIndexOf(number) == index - 1) {
                number++;
                if (number == 2) {
                    break;
                }
            }
        }
        //Print
        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}