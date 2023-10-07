import java.util.Scanner;
public class ArrayReversal {
    public static void main(String[] args) {
        //initializes scanner
        Scanner sc = new Scanner(System.in);

        //establishes an Array with a max length of 100
        int[] numArray = new int[100];

        //length variable to change the position of our array inputs
        int length = 0;

        //user prompt and loop variable
        System.out.println("Enter values (-1 to stop)");
        boolean loops = true;

        //while loop to input as many desired array values as needed
        while(loops) {
            //user input indicator and variable for array input values
            System.out.print(": ");
            int nums = sc.nextInt();

            //only commits values to array if they are not -1
            if (nums != -1) {
                numArray[length] = nums;

                //changes position of array for next input
                length++;
            }
            else {
                //exits loop
                loops = false;
            }
        }
        System.out.println("you values, reversed");

        //uses variable j to output array values in opposite order from input, excludes -1 input
        for (int j = length - 1; j >= 0; j--) {
            System.out.println(numArray[j]);
        }
    }
}