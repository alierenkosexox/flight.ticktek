
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenlerimizi tanımladık.
        double km;
        int userAge;
        int roadType;
        double price = 0.10;

        Scanner takeInformation = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("XXX Havayoluna Hoş geldiniz");
        // Kullanıcıdan koşulları sağlarsa, km bilgisi aldık.
        while(true){
            System.out.print("Kilometre bilgisi giriniz:  ");
            km = takeInformation.nextDouble();
            price*=km;
            if(km <= 0){
                System.out.println("-------------------------------------------");
                System.out.println("Kilometre bilgisi 0'dan küçük veya 0 olamaz.");
                System.out.println("-------------------------------------------");
                System.out.println("Tekrar giriniz...");
                System.out.println("-------------------------------------------");
            }else{
                System.out.println("Kilometre bilgisi kaydedildi...");
                System.out.println("Toplam mesafe: " + km + " Km");
                break;
            }
        }
        // Kullanıcıdan koşulları sağlarsa, yaş bilgisini aldık.
        while(true){
            System.out.print("Yaşınızı giriniz: ");
            userAge = takeInformation.nextInt();
            if(userAge <= 0){
                System.out.println("-------------------------------------------");
                System.out.println("Hatalı giriş yaptınız");
                System.out.println("-------------------------------------------");
                System.out.println("Tekrar giriniz...");
                System.out.println("-------------------------------------------");
            }else{
                System.out.println("Yaş bilgisi kaydedildi...");
                break;
            }
        }
        // Kullanıcıdan koşulları sağlarsa, işlem seçimini aldık
        while(true){
            System.out.println("Yolculuk tipi seçiniz: ");
            System.out.println("1 - Tek Yön");
            System.out.println("2- Çift Yön");
            roadType = takeInformation.nextInt();
            if(roadType > 2 || roadType < 1){
                System.out.println("-------------------------------------------");
                System.out.println("Hatalı seçim yaptınız");
                System.out.println("-------------------------------------------");
                System.out.println("Sizi seçim menüsüne aktarıyorum...");
                System.out.println("-------------------------------------------");
                continue;
            }
            else{
                System.out.println("Yolculuk tipi seçimi kaydedildi....");
            }
            if(roadType == 2){
                price*=1.6;
                System.out.println("Toplam tutara indirim uygulandı..");
                break;
            }
            else{
                break;
            }
        }
        // Koşullar sağlanırsa toplam ödenecek tutar ve indirimler uygulanarak çıktı yansıtıldı
        if(userAge < 12){
            price*=0.5;
            System.out.println("İndirimli toplam tutar: " + price + "$");
        }
        else if(userAge > 12 && userAge < 24 || userAge == 12 || userAge == 24){
            price*=0.9;
            System.out.println("İndirimli toplam tutar: " + price + "$");
        }
        else if(userAge > 65){
            price*=0.7;
            System.out.println("İndirimli toplam tutar: " + price + "$");
        }
        else{
            System.out.println("Toplam ödenecek tutar: " + price + "$");
        }
        System.out.println("Bizi tercih ettiğiniz için teşekürler...");
        System.out.println("-------------------------------------------");

    }
}