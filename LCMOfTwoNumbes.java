import java.io.*;
import java.util.Scanner;
public class LCM {
    public  static void main(String[] args){
        try{
            // File containing test cases
//            System.out.println("Current working directory: " + new File(".").getAbsolutePath());

            File file = new File("Resources/testcases.txt");
            Scanner in = new Scanner(file);

            while(in.hasNextLine()){
                String line = in.nextLine();
                String[] numbers = line.split(" ");

                int num1 = Integer.parseInt(numbers[0]);
                int num2 = Integer.parseInt(numbers[1]);
                int result = Integer.parseInt(numbers[2]);

                System.out.println(num1 + ", " + num2);

                int lcm = 1;
//                int counter = num1 <= num2 ? num1 : num2;
                int counter = Math.min(num1, num2);
                for(int div = counter; div >= 1; div--){
                    if(num1 % div == 0 && num2 % div == 0){
                        lcm = div * (num1/div) * (num2/div);
                        break;
                    }
                }
//                lcm == result ? System.out.println("Test Case Passed...") : System.out.println("Test Case failed...");
                // Using ternary for simple print message
                System.out.println((lcm == result) ? "Test Case Passed..." : "Test Case Failed...");
                System.out.println("--------------------\n");

            }


//            char choice;
//            do{
//                System.out.print("Enter two numbers: ");
//                int num1 = in.nextInt();
//                int num2 = in.nextInt();

//                int lcm = 1;
//                int counter = num1 <= num2 ? num1 : num2;
//                for(int div = counter; div >= 1; div--){
//                    if(num1 % div == 0 && num2 % div == 0){
//                        lcm = div * (num1/div) * (num2/div);
//                        break;
//                    }
//                }
//                System.out.print("The lcm of two numbers is " + lcm + "\n");
//
//                choice = in.next().charAt(0);
//
//            }while(choice == 'f');
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}

