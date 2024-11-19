import java.util.Scanner;
public class CheckSorting {

    static boolean isSorted(float[] arr){
        boolean broked = false;
        if(arr.length > 1 && arr[0] <= arr[1]){
            for(int i = 0; i < arr.length - 1; i++){
                if(!(arr[i] <= arr[i+1])){
                    broked = true;
                    break;
                }
            }
            if(!broked) return  true;
        }

        if(arr.length > 1){
            for(int i = 0; i < arr.length - 1; i++){
                if(!(arr[i] >= arr[i+1])){
                    return false;
                }
            }
            return true;
        }
        return  true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.print("Enter a list of numbers: ");
            String input = scanner.nextLine();
            String[] nums = input.split(" ");

            float[] numbers = new float[nums.length];

            for(int i = 0; i < nums.length; i++){
                numbers[i] = Float.parseFloat(nums[i]);
            }

            System.out.println(isSorted(numbers) ? "Sorted\n" : "Unsorted\n");
            System.out.print("Enter '1' to continue and '0' to exit.. ");
            choice = scanner.nextInt();
            System.out.println();
            scanner.nextLine(); // Consume the leftover newline
        }while(choice == 1);

    }
}
