package mini_Projects.MiniBookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2-b: Notebook ile ilgili işlemler
public class NotebookService implements ProductService {

    //defter ile ilgili işlemler
    Scanner scan=new Scanner(System.in);

    //Defterleri saklamak için bir List'e ihtiyacımız var.
    List<Notebook> notebooks=new ArrayList<>();

    // başlangıçta sistemde mevcut defterler olsun.

    public NotebookService(){
        Notebook notebook1=new Notebook("Türkçe", "25", 15, "Mopak", 120, 111);
        Notebook notebook2=new Notebook("Tarih", "18", 10, "Kalite", 80, 222);
        Notebook notebook3=new Notebook("Math", "35", 23, "Ucuz", 100, 333);
        this.notebooks.add(notebook1);
        this.notebooks.add(notebook2);
        this.notebooks.add(notebook3);
    }

    @Override
    public void processMenu() {
    int choice;
    do{
        System.out.println("-------------------------------------------------------");
        System.out.println("1-Defterleri listele");
        System.out.println("2-Defter ekle");
        System.out.println("3-Defter sil");
        System.out.println("4-Markasına göre defter filtrele");
        System.out.println("0-Geri Dön");
        System.out.println("Seçiminiz: ");
        choice= scan.nextInt();
        scan.nextLine();
        switch (choice){
            case 1:
                listProduct();
                break;
            case 2:
                addProduct();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                System.out.println("Marka: ");
                String brand= scan.nextLine();
                filterProduct(brand);
                break;
            case 0:
                System.out.println("Ana menuye yönlendiriliyorsunuz...");
                break;
            default:
                System.out.println("Hatalı giriş!!!");
                break;
        }

    }while(choice!=0);


    }

    @Override
    public void listProduct() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-2s  |  %-15s  |  %-10s  |  %-5s  |  %-8s  |  %-5s  |  %-3s\n",
                "ID", "Defter Adı", "Ücret", "Stok", "Marka", "Sayfa Sayısı", "Kod");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        this.notebooks.forEach(notebook -> System.out.printf("%-2s  |  %-15s  |  %-10s  |  %-5s  |  %-8s  |  %-5s  |  %-3s\n",
                notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getStock(), notebook.getBrand(), notebook.getSheet(), notebook.getCode()));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    @Override
    public void addProduct() {
        System.out.println("Code :");
        int code=scan.nextInt();
        scan.nextLine();
        boolean isExists=false;
        for(Notebook notebook:this.notebooks){
            if(notebook.getCode()==code){
                System.out.println("Bu defter sistemde zaten kayıtlı, lütfen ürün güncelleme yapınız.");
                isExists=true;
                break;
            }
        }
        if(!isExists){
            System.out.println("Defter Adı: ");
            String name=scan.nextLine();
            System.out.println("Ücret: ");
            String price=scan.nextLine();
            System.out.println("Stok: ");
            int stock=scan.nextInt();
            scan.nextLine();
            System.out.println("Marka: ");
            String brand=scan.nextLine();
            System.out.println("Sayfa Sayısı: ");
            int sheet=scan.nextInt();
            scan.nextLine();

            Notebook newNotebook= new Notebook(name, price, stock, brand, sheet, code);
            this.notebooks.add(newNotebook);
        }
        listProduct();

    }

    @Override
    public void deleteProduct() {
        boolean isExists=true;
        System.out.println("Defter id: ");
        int id= scan.nextInt();
        for(Notebook notebook:this.notebooks){
            if(notebook.getId()==id){
                isExists=true;
                this.notebooks.remove(notebook);
                System.out.println("Ürün silindi.");
                listProduct();
                break;
            }else{
                isExists=false;
            }
        }
        if(!isExists){
            System.out.println("Ürün bulunamadı!!!");
        }

    }

    @Override
    public void filterProducts(String filter) {

    }

    @Override
    public void filterProduct(String filter) {
        int counter=0;
        for(Notebook notebook:this.notebooks){
            if(notebook.getBrand().equalsIgnoreCase(filter)){
                System.out.println("Aradığınız ürün(ler) aşağıda listelenmiştir");
                System.out.println("===========================================");
                System.out.printf("%-2s  |  %-15s  |  %-10s  |  %-5s  |  %-8s  |  %-5s  |  %-3s\n",
                        notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getStock(), notebook.getBrand(), notebook.getSheet(), notebook.getCode());

                    counter++;
            }
        }
        if(counter==0){
            System.out.println("Ürün bulunamadı!!!");
        }

    }
}
