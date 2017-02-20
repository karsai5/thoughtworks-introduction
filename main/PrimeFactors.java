package main;

import java.util.ArrayList;

/**
 * Created by linus on 20/2/17.
 */
public class PrimeFactors {
    public void print(int i) {
        ArrayList<String> array = new ArrayList<String>();

        // loop through numbers up to i
        for (int x = 1; x < i; x++){
            if (i % x == 0){
                array.add(Integer.toString(x));
            }
        }

        System.out.println(String.join(", ", array));
    }
}