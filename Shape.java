/**
 * Created by linus on 20/2/17.
 */
public class Shape {
    public void printAsterisk() {
        printAsterisk(true);
    }

    public void printAsterisk(boolean newline){
        System.out.print("*");
        if (newline) {
            System.out.println();
        }
    }

    public void printHorizontalLine(int i) {
        for (int x = 0; x < i; x++){
            printAsterisk(false);
        }
        System.out.println();
    }

    public void printVerticalLine(int i) {
        for (int x = 0; x < i; x++){
            printAsterisk();
        }
    }

    public void print_right_triangle(int i) {
        for (int x = 0; x < i; x++) {
           printHorizontalLine(x+1);
        }
    }
}

