package problem.chennai;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Product product = new Product();
        product.input();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] array = new int[input];
        for (int i = 0; i < input; i++) {
            array[i] = scanner.nextInt();
        }
        sum(array);

    }
    public void sum(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int product = 1;
        for (int index : arr) {
            product *= index;
        }
        for (int index:arr) {
            list.add(product/index);
        }

        for (int ans:list) {
            System.out.print(ans+ " ");
        }
    }
}

