package problemtwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public void user() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("entre the total length of array");
            int input = scanner.nextInt();
            int[] arr = new int[input];
            System.out.println("entre the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            SortTheArray sortTheArray = new SortTheArray();
            sortTheArray.array(arr, input);
        }catch (InputMismatchException e){
            System.out.println("invalid input");
        }
    }
}
