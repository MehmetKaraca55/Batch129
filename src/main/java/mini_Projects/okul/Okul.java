package mini_Projects.okul;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String okulAdı;
    private int maxOgrenciSayısı;
    private List<Ogrenci> ogrenciListesi = new ArrayList();

    public Okul(String okulAdı, int maxOgrenciSayısı, List<Ogrenci> ogrenciListesi) {
        this.okulAdı = okulAdı;
        this.maxOgrenciSayısı = maxOgrenciSayısı;
        this.ogrenciListesi = ogrenciListesi;
    }

    public Okul() {
    }

    public String getOkulAdı() {
        return okulAdı;
    }

    public void setOkulAdı(String okulAdı) {
        this.okulAdı = okulAdı;
    }

    public int getMaxOgrenciSayısı() {
        return maxOgrenciSayısı;
    }

    public void setMaxOgrenciSayısı(int maxOgrenciSayısı) {
        this.maxOgrenciSayısı = maxOgrenciSayısı;
    }

    public List<Ogrenci> getOgrenciListesi() {
        return ogrenciListesi;
    }

    public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
        this.ogrenciListesi = ogrenciListesi;
    }
    public void addOgrenciToList(Ogrenci ogrenci){
        this.ogrenciListesi.add(ogrenci);
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAdı='" + okulAdı + '\'' +
                ", maxOgrenciSayısı=" + maxOgrenciSayısı +
                ", ogrenciListesi=" + ogrenciListesi +
                '}';
    }
}
