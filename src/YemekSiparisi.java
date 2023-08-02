public class YemekSiparisi {
    private String musteriIsmi;
    private String siparis;

    public YemekSiparisi(String musteriIsmi, String siparis) {
        this.musteriIsmi = musteriIsmi;
        this.siparis = siparis;
    }

    public void benimMenum() {
        System.out.println(musteriIsmi + ": " + siparis);
    }
}
