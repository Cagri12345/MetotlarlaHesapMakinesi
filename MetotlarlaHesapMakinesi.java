package Basic;
import java.util.Scanner;
public class MetotlarlaHesapMakinesi {

    static int toplama(int a ,int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int cikar(int a ,int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int carpma(int a, int b){
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int bolme(int a, int b){
        if ( b== 0){
            System.out.println("İkinci sayı 0 'dan farklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static int us(int a ,int b){
        int result = 1;
        for(int i = 1 ; i <= b ; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a ,int b){
        return a % b;
    }

    static void calc(int a , int b){
        System.out.println("Dikdörtgenin Çevresi: " + (2*(a+b)));
        System.out.println("Dikdörtgenin Alanı: " + (a*b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesaplama\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.println("Bir işlem seçiniz: ");
            int select = input.nextInt();

            if(select == 0){
                System.out.println("Çıkış Yapılıyor...");
                break;
            }

            System.out.println("İlk sayı: ");
            int a = input.nextInt();
            System.out.println("İkinci sayı: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    toplama(a,b);
                    break;
                case 2:
                    cikar(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı: " + us(a,b));
                    break;
                case 6:
                    System.out.println("Mod Sonucu: " + mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                default:
                    System.out.println("Hatalı işlem!");
            }
        }
    }
}
