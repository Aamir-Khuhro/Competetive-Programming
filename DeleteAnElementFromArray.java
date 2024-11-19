import java.util.Scanner;

public class DeleteAnElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.print("Enter a list of numbers: ");
            String input = scanner.nextLine();

            System.out.print("Enter a key to delete: ");
            float key = scanner.nextFloat();

            String[] nums = input.split(" ");

            float[] numbers = new float[nums.length];

            for(int i = 0; i < nums.length; i++){
                numbers[i] = Float.parseFloat(nums[i]);
            }

            int occur = 0;
            for(float num: numbers){
                if(key == num){
                    occur++;
                }
            }

            float[] newArr = new float[numbers.length - occur];
            for(int i = 0, j = 0; i < numbers.length; i++){
                if(numbers[i] != key){
                    newArr[j] = numbers[i];
                    j += 1;
                }
            }

            // Printing the elements of newArry
            for(float num : newArr){
                System.out.print(num + " ");
            }


            System.out.print("\n\nEnter '1' to continue and '0' to exit.. ");
            choice = scanner.nextInt();
            System.out.println();
            scanner.nextLine(); // Consume the leftover newline
        }while(choice == 1);
    }
}
