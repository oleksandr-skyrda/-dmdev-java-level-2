package p01.lesson01;

public class TextExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 100, 199};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}
