package ssg;

public class C04_forloop {
    public static void main(String[] args) {


         /*
    Soru 4) 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin
    */
        int bas=10;
        int son=70;

        for (int i = bas; i <31 ; i++) {
            if (i < 30) {
                System.out.print(i + ",");

            } else System.out.println(i);
        }

    }

}

