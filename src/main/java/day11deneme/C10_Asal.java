package day11deneme;

public class C10_Asal {

    public static void main(String[] args) {
        asalMı(13);


    }

    public static void asalMı(int a){
        boolean asal=true;
        for (int i = 2; i <a ; i++) {
            if(a%i==0){
                asal=false;
            }

        }
        if(asal){
            System.out.println( a + "asal bir sayıdır");
        }else{
            System.out.println(a + "asal bir sayı değildir");

        }
    }
}
