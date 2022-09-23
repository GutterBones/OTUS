import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of array elements: ");
        int[] numbers = buildInitialArr();
        System.out.print("Initial: ");
        //printRowArr(numbers);
        shellSort(numbers);
        defaultSort(numbers);
        shellSort(numbers);
        defaultSort(numbers);
    }

    public static int[] buildInitialArr() {
        Scanner in = new Scanner(System.in);
        int nElems = in.nextInt();
        int[] array = new int[nElems];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
        }
        return array;
    }

    public static void printRowArr(int[] array) {
        StringJoiner stringJoiner = new StringJoiner(",");
        for (int j : array) {
            stringJoiner.add("" + j);
        }
        System.out.println(stringJoiner);
    }

    public static void defaultSort(int[] array) {
        long time = System.nanoTime();
        Arrays.sort(array);
        time = System.nanoTime() - time;
        System.out.print("Fast sorted: ");
        //printRowArr(array);
        System.out.printf("Sort time: %,9.3f ms\n", time/1_000_000.0);
    }

    public static void shellSort(int[] array) {
        int h = 1;
        long time = System.nanoTime();
        while (h*3 <= array.length) {
            h = h*3 + 1;
        }
        while (h >= 1) {
            hSort (array,h);
            h = h/3;
        }
        time = System.nanoTime() - time;
        System.out.print("Shell sorted: ");
        //printRowArr(array);
        System.out.printf("Sort time: %,9.3f ms\n", time/1_000_000.0);
    }

    public static void hSort(int[] array, int h){
        int length = array.length;
        for (int i = h;i < length;i++) {
            for (int j = i; j >= h;j = j - h){
                if (array[j] < array[j - h]) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
                else
                    break;
            }
        }
    }
}