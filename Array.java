public class Array {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };

        int angkaDicari = 12;

        boolean ditemukan = false;

        outerLoop: for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == angkaDicari) {
                    System.out.printf("Found %d at %d, %d%n", angkaDicari, i, j);
                    ditemukan = true;
                    break outerLoop;
                }
            }
        }

        if (!ditemukan) {
            System.out.println(angkaDicari + " not found in the array.");
        }
    }
}
