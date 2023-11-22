public class LaguAnakAyam {
    public static void main(String[] args) {
        // Menggunakan perulangan for
        System.out.println("=== Menggunakan Perulangan For ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }

        // Menggunakan perulangan while
        System.out.println("\n=== Menggunakan Perulangan While ===");
        int j = 5;
        while (j >= 1) {
            System.out.println("Anak ayam turun " + j + ", mati satu tinggal " + (j - 1));
            j--;
        }

        // Menggunakan perulangan do-while
        System.out.println("\n=== Menggunakan Perulangan Do-While ===");
        int k = 5;
        do {
            System.out.println("Anak ayam turun " + k + ", mati satu tinggal " + (k - 1));
            k--;
        } while (k >= 1);
    }
}