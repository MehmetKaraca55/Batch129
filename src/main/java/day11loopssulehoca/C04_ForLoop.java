package day11loopssulehoca;

public class C04_ForLoop {

    public static void main(String[] args) {

        //1'den 100 e kadar kadar, 6 ile bölünenler hariç tüm tamsayıları ekrana yazdırınız.

        for (int i = 1; i < 101; i++) {
            if(i%6==0){
                continue;//boş ver, devam et, bölünenleri es geç
            }
            System.out.print(i+ " ");
        }
        System.out.println();

        //Interview Sorusu:
        //Sİze verilen bir String i ters çeviren kodu yazınız.
        String isim= "Mehmet";//temheM
        String tersİsim="";//yeni bir conteyner oluşturduk

        for (int i = isim.length()-1; i >-1 ; i--) {
            char harf= isim.charAt(i);
           // tersİsim=tersİsim+harf;
            tersİsim+=harf;
        }
        System.out.println(tersİsim);




    }


}
