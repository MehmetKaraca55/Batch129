package mini_Projects.textOkumaYazma;

import java.io.*;

public class TextOkumaYazma {

    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonuna yazdıran bir kod yazınız.

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("src/main/java/mini_Projects/textOkumaYazma/Text.txt");
        BufferedReader br = new BufferedReader(fr);
        String satır = br.readLine();
        String yeniDosya="";

        while(satır!=null){
            yeniDosya +=satır+ "==>Satır kelime sayısı: "+satır.split(" ").length +"\n";
           satır =  br.readLine();//bir alttaki satıra geçer
        }
        System.out.println("yeniDosya = " + yeniDosya);
        br.close();

        FileWriter writer = new FileWriter("src/main/java/mini_Projects/textOkumaYazma/Text.txt");
        writer.write(yeniDosya);
        writer.close();




    }


}
