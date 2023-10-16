import java.util.Scanner;

public class FizzBuzzRecursion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        fizzBuzz(number);
    }

    public static void fizzBuzz(int n){
        if (n > 0){
            if (n % 3 == 0 && n % 5 == 0){
                System.out.print("FizzBuzz" + " ");
            } else if (n % 5 == 0){
                System.out.print("Buzz" + " ");
            } else if (n % 3 == 0){
                System.out.print("Fizz" + " ");
            } else {
                System.out.print(n + " ");
            }
            fizzBuzz(n - 1);
        }
    }
}