package Practice.practiceDTNT;

public class Kumanda {

    private double genişlik;
    private double yükseklik;
    private double ekranBüyüklüğü;
    private int maxVolume=32;
    private int ses=10;
    private boolean güç;


    public Kumanda(double genişlik, double yükseklik, double ekranBüyüklüğü) {
        this.genişlik = genişlik;
        this.yükseklik = yükseklik;
        this.ekranBüyüklüğü = ekranBüyüklüğü;
    }


    public String kanalDeğiştirme(String kanal){

        switch (kanal){
            case ("A"):
                return kanal;
            case ("B"):
                return kanal;
            case ("C"):
                return kanal;
        }
        return kanal;

    }


    public void güçDÜğmesi(){
        this.güç=!güç;
        System.out.println(güç);
    }

    public int sesAzaltma(){
        if(ses>0){
            ses--;
        }
        return ses;
    }

    public int sesArtırma(){
        if(ses<maxVolume){
            ses++;
        }
        return ses;
    }


}
