package dongu;

import java.util.Scanner;

public class Atm {
	
		public static void main(String[] args) {
			
	String kullaniciAdi, sifre;
	Scanner scanner = new Scanner(System.in);
	int hak = 3;
	int bakiye = 1500;
	int secim;
	while (hak > 0) {
		System.out.print("Kullanıcı Adınız :");
		kullaniciAdi = scanner.nextLine();
		System.out.print("Parolanız : ");
		sifre = scanner.nextLine();


        if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
            System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
            do {
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                secim = scanner.nextInt();
                switch (secim) {
                    case 1:
                        System.out.print("Para miktarı : ");
                        int tutar = scanner.nextInt();
                        bakiye += tutar;
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        tutar = scanner.nextInt();
                        if (tutar > bakiye) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            bakiye -= tutar;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + bakiye);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    default:
                        System.out.println("Geçersiz işlem. Lütfen tekrar deneyiniz.");
                        break;
                }
            } while (secim != 4);
            break;
        } else {
            hak--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            if (hak == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan Hakkınız : " + hak);
            }
        }
    }
}
}