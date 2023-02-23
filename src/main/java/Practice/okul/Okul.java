package Practice.okul;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String okulAdı;
    private int maxÖğrenciSayısı;
    private List<Öğrenci> öğrenciListesi = new ArrayList<>();

    public Okul(String okulAdı, int maxÖğrenciSayısı, List<Öğrenci> öğrenciListesi) {
        this.okulAdı = okulAdı;
        this.maxÖğrenciSayısı = maxÖğrenciSayısı;
        this.öğrenciListesi = öğrenciListesi;
    }

    public Okul() {
    }

    public String getOkulAdı() {
        return okulAdı;
    }

    public void setOkulAdı(String okulAdı) {
        this.okulAdı = okulAdı;
    }

    public int getMaxÖğrenciSayısı() {
        return maxÖğrenciSayısı;
    }

    public void setMaxÖğrenciSayısı(int maxÖğrenciSayısı) {
        this.maxÖğrenciSayısı = maxÖğrenciSayısı;
    }

    public List<Öğrenci> getÖğrenciListesi() {
        return öğrenciListesi;
    }

    public void setÖğrenciListesi(List<Öğrenci> öğrenciListesi) {
        this.öğrenciListesi = öğrenciListesi;
    }

    public void addÖğrenciToList(Öğrenci öğrenci){
        öğrenciListesi.add(öğrenci);
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAdı='" + okulAdı + '\'' +
                ", maxÖğrenciSayısı=" + maxÖğrenciSayısı +
                ", öğrenciListesi=" + öğrenciListesi +
                '}';
    }
}
