import java.util.Scanner;

public class AsalSayi {

    /*
    Kullanıcı tarafından n sayısı girildiğini düşünelim. 1 den girilen bu n sayısına kadar olan
    asal sayıları yazdıran bir algoritma kodlayınız.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");

        int num = scanner.nextInt();

        for(int i=2; i<= num; i++) {
            //System.out.println("i: "+i);
            boolean asal = true;
            for(int j= 2; j<=i/2; j++) {
                //	System.out.println("j: "+j);
                if( i %j==0) {
                    asal= false;
                    break;
                }
            }
            if(asal) {
                System.out.println(i+" asal sayı");
            }
        }
    }
}
