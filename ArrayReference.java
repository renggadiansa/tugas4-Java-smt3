public class ArrayReference {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };

        int[] array2 = array1;

        array2[0] = 10;

        System.out.println("Isi array1:");
        for (int i : array1) {
            System.out.println(i);
        }

        System.out.println("Isi array2:");
        for (int i : array2) {
            System.out.println(i);
        }
    }
}
