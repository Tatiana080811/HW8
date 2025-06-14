//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] weights = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] height = {1.57, 7.654, 9.986};
        for (int d = 0; d < 3; d++) {
            System.out.print(height[d]);
            if (d != height.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] speed = {60, 80, 120, 200, 250};
        for (int i1 = 0; i1 < speed.length; i1++) {
            System.out.print(speed[i1]);
            if (i1 < speed.length - 1) {
                System.out.print(", ");
            }
        }


        System.out.println();

        weights = new int[]{1, 2, 3};
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        height = new double[]{1.57, 7.654, 9.986};
        for (int d = height.length - 1; d >= 0; d--) {
            System.out.print(height[d]);
            if (d != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        speed = new int[]{60, 80, 120, 200, 250};
        for (int i1 = speed.length - 1; i1 >= 0; i1--) {
            System.out.print(speed[i1]);
            if (i1 != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}








