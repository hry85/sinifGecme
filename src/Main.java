import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, toplam = 0 ;
        int dersSayisi=0;


        Scanner sc=new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat=sc.nextDouble();
        if (mat>=0 && mat<=100){
            toplam+=mat;
            dersSayisi++;
        }
        

        System.out.print("Fizik notunuz : ");
        fizik=sc.nextDouble();
        if (fizik>=0 && fizik<=100){
            toplam+=fizik;
            dersSayisi++;
        }

        System.out.print("Turkce notunuz : ");
        turkce=sc.nextDouble();
        if (turkce>=0 && turkce<=100){
            toplam+=turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunuz : ");
        kimya=sc.nextDouble();
        if (kimya>=0 && kimya<=100){
            toplam+=kimya;
            dersSayisi++;
        }

        System.out.print("Muzik notunuz : ");
        muzik=sc.nextDouble();
        if (muzik>=0 && muzik<=100){
            toplam+=muzik;
            dersSayisi++;
        }

        double avarage= toplam / dersSayisi;

        if (avarage<55){
            System.out.println("Sinifta kaldiniz. Seneye tekrar gorusmek uzere. ");

        }else {
            System.out.println("Sinifi gectiniz, tebrikler. ");
        }
        System.out.println("Ortalamaniz : " +avarage );
    }
}
