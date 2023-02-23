package Practice.practiceDTNT;

public abstract class TSE {

    public static void main(String[] args) {

        BagetEkmek baget = new BagetEkmek();

        baget.gramaj500();
        baget.hijyenikOlma();
        baget.odunAteşindePiser();
        baget.undanYapılır();

        DiyetEkmek diyet = new DiyetEkmek();
        diyet.gramaj500();
        diyet.hijyenikOlma();
        diyet.odunAteşindePiser();
        diyet.undanYapılır();





    }//main

    abstract void gramaj500();//child'lar buna uymak zorunda.

    abstract void hijyenikOlma();

    void odunAteşindePiser(){
        System.out.println("TSE odun ateşinde pişer");
    }

    void undanYapılır(){
        System.out.println("TSE undan yapılır");
    }



}
