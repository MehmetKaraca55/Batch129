package Practice.practiceDTNT;

public class Edge extends Browser{

    String adresÇubuğu;

    public Edge() {
    }

    public Edge(String adresÇubuğu) {
        this.adresÇubuğu=adresÇubuğu;
    }

    @Override
    public void search(){
        System.out.println("Edge Web sayfasın'da araştırma yapar");
    }

    @Override
    public void şifreKaydetme(){
        System.out.println("Edge cookiesleri kabul edilenlerin istenildiğinde şifresini kaydeder");
    }
}
