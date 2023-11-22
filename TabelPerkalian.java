import java.util.Scanner;

public class TabelPerkalian {

  private static Scanner scanner;

public static void main(String[] args) {
    int n;

    System.out.println("Tabel Perkalian");
    System.out.println("----------------");

    // Input nilai n
    System.out.print("Masukkan nilai n: ");
    scanner = new Scanner(System.in);
    n = Integer.parseInt (scanner.nextLine());

    // Mencetak tabel perkalian
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1) {
          System.out.printf("%2d ", i * j);
        } else if (i == j) {
          System.out.printf("%2d ", i * i);
        } else {
          System.out.printf("%2d ", i * j);
        }
      }
      System.out.println();
    }
  }
}