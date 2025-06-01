package main.java.coding;

public class SumOfNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = calculateSum(numbers);
        System.out.println("The sum of the numbers is: " + sum);
    }

    private static int calculateSum(int[] numbers) {
        if(null == numbers || numbers.length == 0) {
            return 0; // Return 0 if the array is null or empty
        }
        else{
            int totalNumbers = numbers.length;
            return totalNumbers*(totalNumbers+1)/2;
        }
    }
}