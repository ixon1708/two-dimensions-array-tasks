public class TwoDimensionsArrayTask2 {
    public static void main(String[] args) {
        char[][] matrix = new char[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    matrix[i][j] = 'X';
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        for (char[] line: matrix) {
            for (char element: line) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
