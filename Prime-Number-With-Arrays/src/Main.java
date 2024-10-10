import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("DİZİLER İLE ASAL SAYI BULMA UYGULAMASINA HOŞGELDİNİZ");
        System.out.println("------------------------------------------------------");

        int asalToplam = 0;
        int asalOlmayanToplam = 0;

        String asalSayilar = "";
        String asalOlmayanSayilar = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int[diziUzunluk];

        for (int i = 0; i < diziUzunluk; i++) {
            System.out.print("Dizinin " + i + ". elemanını giriniz: ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int sayi : sayilar) {
            if (isPrime(sayi)) {
                asalToplam++;
                asalSayilar += sayi + " ";
            } else {
                asalOlmayanToplam++;
                asalOlmayanSayilar += sayi + " ";
            }
        }

        System.out.println("Girilen sayılar içerisindeki asal sayı adedi: " + asalToplam);
        System.out.println("Girilen sayılar içerisindeki asal sayılar: " + asalSayilar);
        System.out.println("-----------------------ASAL BİLGİLERİ-----------------------------");
        System.out.println("Girilen sayılar içerisindeki asal olmayan sayı adedi: " + asalOlmayanToplam);
        System.out.println("Girilen sayılar içerisindeki asal olmayan sayılar: " + asalOlmayanSayilar);
    }

    private static boolean isPrime(int sayi) {
        if (sayi <= 1) return false;
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
