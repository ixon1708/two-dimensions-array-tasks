public class TwoDimensionsArrayTask5 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int elem = array[i][j];
                int digitSum = 0;
                while (elem > 0) {
                    digitSum += elem % 10;
                    elem /= 10;
                }
                if (digitSum > 7 && digitSum < 13) {
                    System.out.printf("%d(%d,%d); ",array[i][j], i, j);
                    //или System.out.print(array[i][j] + "(" + i + "," + j + "); ");
                }
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
