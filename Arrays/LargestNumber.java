public class LargestNumber {
    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 5, 10, 5, 8, 12, 6};
        int result = largest(numbers);
        System.out.println("The largest number is: " + result);
    }
}
