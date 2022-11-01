package problem.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Frequency frequency = new Frequency();
        frequency.input();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int input = scanner.nextInt();
        int[] array = new int[input];
        System.out.println("Enter the Array Below");
        for (int index = 0; index < input; index++) {
            array[index] = scanner.nextInt();
        }
        occurrences(array);
    }

    public void occurrences(int[] array) {
        int temp;
        ArrayList<Integer> frequency = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        for (int index : array) {
            if (number.contains(index)) {
                frequency.set(number.indexOf(index), frequency.get(number.indexOf(index)) + 1);
            } else {
                number.add(index);
                frequency.add(number.indexOf(index), 1);
            }
        }
        for (int index = 0; index < frequency.size(); index++) {
            for (int indexTwo = index + 1; indexTwo < frequency.size(); indexTwo++) {
                if (frequency.get(index) < frequency.get(indexTwo)) {
                    temp = frequency.get(index);
                    frequency.set(index, frequency.get(indexTwo));
                    frequency.set(indexTwo, temp);
                    temp = number.get(index);
                    number.set(index, number.get(indexTwo));
                    number.set(indexTwo, temp);
                }
            }
        }
        for (int row = 0; row < frequency.size(); row++) {
            for (int col = 0; col < frequency.get(row); col++) {
                System.out.print(number.get(row));
            }
        }
    }
}
