/**
 * Created by linus on 20/2/17.
 */
public class Triangle {
    public void printAsterisk() {
        printAsterisk(true);
    }

    public void printAsterisk(boolean newline){
        System.out.print("*");
        if (newline) {
            System.out.println();
        }
    }

    public void printVerticalLine(int i) {
        for (int x = 0; x < i; x++){
            printAsterisk(false);
        }
        System.out.println();
    }
}

