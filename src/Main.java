public class Main {
    /*
Bir restoranda farklı gruplarda ve çok sayıda müşterinin yemek siparişi verdiğini düşünelim.
Çok sayıda ve farklı gruplardaki müşterilerin birbirinden farklı siparişlerini  aynı method ile
düzenleyen bir algoritma oluşturunuz.
     */

    public static void main(String[] args) {
        // Farklı gruplardan çok sayıda müşteri siparişi oluşturma
        YemekSiparisi siparis1 = new YemekSiparisi("Grup 1 - Müşteri 1", "Burger");
        YemekSiparisi siparis2 = new YemekSiparisi("Grup 1 - Müşteri 2", "Pizza");
        YemekSiparisi siparis3 = new YemekSiparisi("Grup 2 - Müşteri 1", "Salata");
        YemekSiparisi siparis4 = new YemekSiparisi("Grup 2 - Müşteri 2", "Pasta");

        // BenimMenum() metodunu kullanarak tüm siparişleri oluşturma
        siparis1.benimMenum();
        siparis2.benimMenum();
        siparis3.benimMenum();
        siparis4.benimMenum();
    }


    }

   /* çıktı
    Grup 1 - Müşteri 1: Burger
    Grup 1 - Müşteri 2: Pizza
    Grup 2 - Müşteri 1: Salata
    Grup 2 - Müşteri 2: Pasta
    */

