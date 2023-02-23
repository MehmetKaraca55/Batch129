package mini_Projects.UsAlma;

public class ForLoop_UsAlma {
    //Bir sayının istenen kuvvetini hesaplayan bir method yazınız

    public static void main(String[] args) {


        System.out.println(kuvvetiniAl(5,2));


    }

    public static double kuvvetiniAl(double taban, int üs){

        double sonuc=1;

        if(taban==0 && üs==0){
        throw new ArithmeticException("Taban ve üs aynı anda 0 olamaz");
        }

        if(üs>=0){
            for(int i=0; i<üs; i++){
                sonuc*=taban;
            }
            return sonuc;
        }else{
            for(int i=0; i<Math.abs(üs); i++){
                sonuc*=taban;
            }
            return 1/sonuc;
        }

    }



}
