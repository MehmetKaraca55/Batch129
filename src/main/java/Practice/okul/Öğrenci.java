package Practice.okul;

public class Öğrenci {

    private String ad;
    private String soyAd;
    private int yaş;

    public Öğrenci(String ad, String soyAd, int yaş) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yaş = yaş;
    }

    public Öğrenci() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    @Override
    public String toString() {
        return "Öğrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yaş=" + yaş +
                '}';
    }
}
