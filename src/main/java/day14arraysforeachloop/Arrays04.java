package day14arraysforeachloop;

public class Arrays04 {

    public static void main(String[] args) {

        // Example 1: String bir array oluşturunuz. 6 eleman ekleyiniz. Yellow'dan önceki elemanları yazdırınız.

        String colors []= new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        for (String w: colors) {

            if(w.equals("Yellow")){
                break;

            }
            System.out.println(w);


        }

        System.out.println();

        // Example 1: String bir array oluşturunuz. 6 eleman ekleyiniz. Yellow'dan sonraki elemanları yazdırınız.

        String color []= new String[6];
        color[0]="Red";
        color[1]="Orange";
        color[2]="Blue";
        color[3]="Yellow";
        color[4]="Green";
        color[5]="Brown";

        //1.YOL:
        //Note: Elemanları almaya son elemandan başlayacağım için for-each loop kullanamam. Bu yüzden for loop kullandık.

        for(int i=color.length-1; i>0; i--){
            if(color[i].equals("Yellow")){
                break;
            }
            System.out.println(color[i]);
        }

        System.out.println();


        //2.YOL:
        //Yellow elemanının index'ini bul ve o index'ten daha büyük index'e sahip olan elemanları yazdır.

        int counter=0;

        for(String w: color){

            if(w.equals("Yellow")){
                break;
            }
            counter++;


        }

        for (int i = counter+1; i < color.length ; i++) {

            System.out.println(color[i]);

        }

        }


    }

