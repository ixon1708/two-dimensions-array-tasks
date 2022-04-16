public class TwoDimensionsArrayTask4 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        int min = array[0][0];
        int iMin = 0;
        int jMin = 0;
        int max = array[0][0];
        int iMax = 0;
        int jMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                    iMin = i;
                    jMin = j;
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println("Минимальный элемент " + min + " находится в позиции (" + iMin + "," + jMin + ")");
        System.out.println("Максимальный элемент " + max + " находится в позиции (" + iMax + "," + jMax + ")");
        for (int[] line: array) {
            for (int element: line) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
       /* усложнение к задаче
         пусть у нас есть вот такой массив:
            61	29	48	33	14
            57	43	73	12	91
            66	86	54	62	14
            87	50	71	62	96
            92	98	46	55	16
        Минимальный элемент 12 находится в позиции (1,3)
        Максимальный элемент 98 находится в позиции (4,1)
        Элементы между мин и макс можно разделить на три части:
            *   *   *   *   *
            *   *   *   12	91	которые в одной неполной верхней строке

            66	86	54	62	14
            87	50	71	62	96	которые в полных строках

            92	98	*   *   *   которыев в одной неполной нижней строке
        */
        int betweenMaxAndMin = 0;
        if (iMax < iMin) {
            int top = array.length - jMax - 1;
            int fullRows = array.length * (iMin - iMax - 1);
            int bottom = jMin;
            betweenMaxAndMin = top + fullRows + bottom;
        } else if (iMax > iMin) {
            int top = array.length - jMin - 1;
            int fullRows = array.length * (iMax - iMin - 1);
            int bottom = jMax;
            betweenMaxAndMin = top + fullRows + bottom;
        } else {
            // макс и мин в одной строке
            betweenMaxAndMin = Math.abs(jMax - jMin) - 1;
        }
        System.out.println("Количество элементов между мин и макс = " + betweenMaxAndMin);
    }
}
