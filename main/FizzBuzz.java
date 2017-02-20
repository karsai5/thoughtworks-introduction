package main;

/**
 * Created by linus on 20/2/17.
 */
public class FizzBuzz {

    public void printCount(int i) {
        for (int x = 1; x <= i; x++){
            if (x % 3 == 0 && x % 5 == 0){
                System.out.println("main.FizzBuzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}
