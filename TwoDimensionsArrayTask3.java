import java.util.Scanner;

public class TwoDimensionsArrayTask3 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int[] line: array) {
            for (int element: line) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println();
        for (int[] line: array) {
            for (int element: line) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
