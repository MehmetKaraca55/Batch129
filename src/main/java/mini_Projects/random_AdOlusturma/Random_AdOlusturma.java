package mini_Projects.random_AdOlusturma;

public class Random_AdOlusturma {

    //Rastgele alınan harfleri bir String e ekleyerek, adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız


    public static void main(String[] args) {
    String alfabe= "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ ";

       String isim = "Ali Can";
       String yeniİsim="";

       int sayac=0;

       for(int i=0; i<isim.length(); i++){

           while(true){
               char rastgeleHarf = alfabe.charAt((int) (Math.random()*alfabe.length()));
               sayac++;
               if(isim.charAt(i)==rastgeleHarf){
                   yeniİsim+=rastgeleHarf;
                   System.out.println("yeniİsim = " + yeniİsim);
                   System.out.println("sayac = " + sayac);
                   break;
               }
           }
       }

        System.out.println("sayac = " + sayac);


    }

}
