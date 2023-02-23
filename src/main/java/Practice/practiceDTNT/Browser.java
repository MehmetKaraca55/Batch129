package Practice.practiceDTNT;

public class Browser {

    public static void main(String[] args) {

        String adresÇubuğu = "Her Browser'da adres çubuğu vardır";

        Edge edge = new Edge();
        edge.search();
        edge.şifreKaydetme();
        edge.get();

        Edge edge2 = new Edge(adresÇubuğu);
        System.out.println(edge2.adresÇubuğu);


    }

    public void get(){
        System.out.println("Browser'lar Web sayfasına gider");
    }

    public void search(){
        System.out.println("Browser'lar Web sayfasın'da araştırma yapar");
    }

    public void şifreKaydetme(){
        System.out.println("Browser'lar istenildiğinde şifreyi kaydeder");
    }
}
