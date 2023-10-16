import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number=input.nextInt();

        for (int i = 1; i <= number; i++){
            if (i % 3 ==0 && i % 5 == 0){
                System.out.print("FizzBuzz" + " ");
            } else if (i % 5 == 0){
                System.out.print("Buzz" + " ");
            } else if (i % 3 == 0){
                System.out.print("Fizz" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
