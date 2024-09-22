import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah deretan Fibonacci? ");
        int jumlah = scanner.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah harus lebih besar dari 0.");
        } else {
            System.out.print("Deret Fibonacci: ");
            tampilkanFibonacci(jumlah);
        }

        scanner.close();
    }

    public static void tampilkanFibonacci(int n) {
        if (n >= 1)
            System.out.print("0");
        if (n >= 2)
            System.out.print(" 1");

        int a = 0, b = 1;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
