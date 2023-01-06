package day11forloop;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: Verilen bir String de 'a' karakteri hariç tüm karakterleri yazdırınız.

        String s="Madagaskar";

        //1.Yol: Bu diğerlerine göre tercih edilir.

        String t=s.replace("a", "");
        System.out.print(t);//Mdgsk

        System.out.println();

        //2. Yol:

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch!='a'){
                System.out.print(ch);

            }

        }

        System.out.println();

        // 3.Yol:

        for (int i = 0; i < s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                continue;//continue keyword u bazı şartlar için, Loop un adımlarını atlamamamızı sağlar. Atla, yazdırma
                //demek

            }
            System.out.print(ch);
        }

        }
    }

