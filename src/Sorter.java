// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Sorter {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
    public int[] selectionSort(int[] list) {
        int i, j, minValue, minIndex, temp = 0;
        for (i = 1; i < list.length; i++) {
            minValue = list[i];
            minIndex = i;
            j = i - 1;
            for (j = i; j < list.length; j++) {

                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }

            }
            if (list[i] > minValue) {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }

        }
        return list;
    }
}