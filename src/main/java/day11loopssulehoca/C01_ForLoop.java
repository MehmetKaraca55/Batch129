package day11loopssulehoca;

public class C01_ForLoop {

    public static void main(String[] args) {

        //Interview Sorusu:
        //String karakterleri teker teker yazdıran ; eğer "a" karakterini görürse, yazdırmayı durduran kodu yazın.

        String cümle = "Öğrenmek yaşamın tek kanıtıdır";
        for (int i = 0; i < cümle.length(); i++) {
            if(cümle.charAt(i) =='a'){
                break;
            }
            System.out.print(" " + cümle.charAt(i));
        }
    }
}
