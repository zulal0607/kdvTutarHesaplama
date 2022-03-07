import java.util.Scanner;

public class kdvTutarHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvTutarı, kdvliTutar;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Tutar miktarını giriniz : ");
        tutar = inp.nextInt();
        kdvTutarı = tutar * kdvOran;
        kdvliTutar = kdvTutarı + tutar;

        System.out.println("Tutar : " + tutar + "\n KDV oranı : " + kdvOran +
                "\n KDV tutarı :" + kdvTutarı + "\n KDVli tutar : " + kdvliTutar);

    }
}
