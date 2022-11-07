import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define the input class
        Scanner input = new Scanner(System.in);

        double tutar,kdvOran;

        System.out.println("Lutfen tutari giriniz!");
        tutar = input.nextDouble();
        if(tutar> 0 && tutar < 1000){
            kdvOran=0.18;
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println("Kdv orani = " + kdvOran);
            System.out.println("Kdv'li tutariniz =" + kdvliTutar);
        }
        else if (tutar>1000){
            kdvOran=0.08;
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println("Kdv orani = " + kdvOran);
            System.out.println("Kdv'li tutariniz =" + kdvliTutar);
        }
        else {
            System.out.println("Girdiginiz tutar eksi olamaz!");
        }
    }
}
