public class ExcampleArray {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        int panjangArray = array.length;

        System.out.println("Array index ke-0: " + array[0]);
        System.out.println("Array index ke-1: " + array[1]);
        System.out.println("Array index ke-2: " + array[2]);
        System.out.println("Array index ke-3: " + array[3]);
        System.out.println("Array index ke-4: " + array[4]);
        System.out.println("Panjang array: " + panjangArray);

    }

}