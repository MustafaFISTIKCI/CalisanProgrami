import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar programına hoşgeldiniz.");

        String islemler = "-----İşlemler-----\n" +
                "1- Yazılımcı İşlemleri\n"+
                "2- Yönetici İşlemleri\n" +
                "Çıkış için 'q' tuşuna basınız.";
        System.out.println(islemler);

        while(true){
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Sistemden çıkılıyor.");
                break;
            }

            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Mustafa", "Fıstıkçı",123, "Java, Kotlin, Python, C" );
                String yazilimci_islem = "1- Format at\n" +
                        "2- Bilgileri göster\n" +
                        "Çıkış için 'q' tuşuna basınız.";

                System.out.println(yazilimci_islem);

                while (true){
                    System.out.print("İşlemi seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;
                    }

                    else if (y_islem.equals("1")){
                        System.out.print("İşletim sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }

                    else if (y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }

                    else System.out.println("Geçersiz yazılımcı işlemi.");
                }
            }

            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Polat", "Alemdar", 123,10);

                String yonetici_islem = "-----Yönetici işlemleri-----\n" +
                        "1- Zam yap\n" +
                        "2- Bilgileri Göster\n" +
                        "Çıkış yapmak için 'q' tuşuna basınız.";
                System.out.println(yonetici_islem);

                while (true){
                    System.out.print("İşlem seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yöneticiişlemlerinden çıkılıyor.");
                        break;
                    }

                    else if (y_islem.equals("1")){
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }

                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }

                    else System.out.println("Geçersiz yönetici işlemi");
                }
            }

            else System.out.println("Geçersiz işlem...");

        }
    }
}