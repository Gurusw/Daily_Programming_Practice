package Day4;

import java.util.HashSet;

public class DuplicateInArray {

    public static void main(String[] args) {
        int[] arr = {122, 22, 33, 44};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }


}
