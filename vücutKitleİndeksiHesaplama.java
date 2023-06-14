import java.util.Scanner;

public class vücutKitleİndeksiHesaplama {
    public static void main(String[] args) {


        double kg , m , vucutKitleIndeksi;

        Scanner imp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz");
        m = imp.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz");
        kg = imp.nextDouble();

        vucutKitleIndeksi = kg / (m * m);
        System.out.println("Vücut Kitle İndeksiniz : "+ vucutKitleIndeksi);
    }
}
