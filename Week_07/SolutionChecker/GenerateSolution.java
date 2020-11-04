import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.StringBuilder;

public class GenerateSolution {
    public static void main(String args[]) {
        Problem1 robert = new Problem1();
        double rect1[][] =
            {{28, 42}, {40, 42}, {28, -36}, {40, -36}}
        ;
        double rect2[][] =
            {{48, -30}, {-28, -27}, {48, -27}, {-28, -30}}
        ;
        System.out.println(robert.overlappingRectangles2D(rect1, rect2));
    }
}
