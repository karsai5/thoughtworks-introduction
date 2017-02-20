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

    private void printHorizontalSpace(int i){
        for (int x = 0; x < i; x++){
            System.out.print(" ");
        }
    }

    public void printVerticalLine(int i) {
        for (int x = 0; x < i; x++){
            printAsterisk();
        }
    }

    public void printRightTriangle(int i) {
        for (int x = 0; x < i; x++) {
            printHorizontalLine(x + 1);
        }
    }

    public void printIsoscelesTriangle(int i) {
       for (int x = 0; x < i; x++) {
           printHorizontalSpace(i - x - 1);
           printHorizontalLine(x * 2 + 1);
       }
    }
}

