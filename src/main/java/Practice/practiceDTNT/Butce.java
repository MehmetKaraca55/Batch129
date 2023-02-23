package Practice.practiceDTNT;

public class Butce {

    // Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin
    // kullanildigi bir butce ile kisisel harcamalarin yapildigi
    // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static int butce;//tüm aileyi etkileceği için

    public int harçlık; //sadece kişiyi etkilediği için



    public void harçlıkAl(int alınanHarçlık){

        butce-=alınanHarçlık; //ortak hesaptan harcanıyor

        harçlık+=alınanHarçlık;
    }

    public void BütçedenHarca(int harcanacakPara){
        butce-=harcanacakPara;

    }

    public void harçlıkHarca(int harçlıkHarcaması){
        harçlık-=harçlıkHarcaması;

    }

    public void maaşAl(int alınanMaaş){
        butce+=alınanMaaş;

    }




}
