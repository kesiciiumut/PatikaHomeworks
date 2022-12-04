import  java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        // değişkenleri oluşturduk
        int mat, fizik, tarih, turkce, kimya;
        Scanner not = new Scanner(System.in);


        System.out.println("lütfen matematik notunuzu giriniz :");
        mat = not.nextInt();

        System.out.println("lütfen fizik notunuzu giriniz :");
        fizik = not.nextInt();

        System.out.println("lütfen tarih notunuzu giriniz :");
        tarih = not.nextInt();


        System.out.println("lütfen türkçe notunuzu giriniz :");
        turkce = not.nextInt();


        System.out.println("lütfen kimya notunuzu giriniz :");
        kimya = not.nextInt();

        int toplam = (mat + fizik + tarih + kimya + turkce);

        double sonuc = (toplam / 5.0);


        System.out.println("ortamalanız "+ sonuc + "'dir");
        String geçtinMi = (sonuc>=60)?("sınıfı geçtin aga"):("kaldın paşa");
        System.out.println(geçtinMi);



    }
}
