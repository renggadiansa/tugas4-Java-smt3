public class Nilai {
    public static void main(String[] args) {
        int[][] dataSiswa = {
                { 1, 81, 90, 62 },
                { 2, 50, 83, 87 },
                { 3, 89, 55, 65 },
                { 4, 77, 70, 92 }
        };

        System.out.println("NRP\tRata-rata");
        System.out.println("--------------------------");

        for (int i = 0; i < dataSiswa.length; i++) {
            int nrp = dataSiswa[i][0];
            int rpl = dataSiswa[i][1];
            int bd = dataSiswa[i][2];
            int pbo = dataSiswa[i][3];

            double rataRata = (rpl + bd + pbo) / 3.0;

            System.out.printf("%d\t%.2f%n", nrp, rataRata);
        }
    }
}
