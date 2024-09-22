public class Hitung {
    public static void main(String[] args) {
        char[] matKul = {
            'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a',
            'n', 'b', 'e', 'r', 'b', 'a', 's', 'i', 's', 'o',
            'b', 'y', 'e', 'k'
        };

        int countA = 0;

        for (char c : matKul) {
            if (c == 'a') {
                countA++;
            }
        }

        System.out.println("Jumlah huruf 'a': " + countA);
    }
}
