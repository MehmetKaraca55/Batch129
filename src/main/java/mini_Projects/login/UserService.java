package mini_Projects.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> usernameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();


public void showMenu(){
    System.out.println("======TECHPROEDUCATION======");
    System.out.println("1-Üye Ol");
    System.out.println("2-Giriş Yap");
    System.out.println("3-Çıkış");
    System.out.println("Seçiminiz: ");

}

    public void register(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Ad-Soyad giriniz");
        String name=scanner.nextLine();

        String username;
        boolean existUsername;

        do{
            System.out.println("Kullanıcı adınızı giriniz");
           username= scanner.nextLine();
           existUsername =usernameList.contains(username);
            if(existUsername){
                System.out.println("Bu username daha önce kullanılmıştır. Yeni bir username deneyiniz");
            }
        }while (existUsername);

        String email;
        boolean isValid;
        boolean existEmail;
        do{
            System.out.println("Email giriniz");
            email = scanner.nextLine().trim();
            isValid = validateEmail(email);
            existEmail = emailList.contains(email);

            if(existEmail){
                isValid=false;
                System.out.println("Bu email daha önce kullanılmıştır. Yeni bir email deneyiniz");
            }


        }while (!isValid);


        String password;
        boolean isValidPsw;
        do{
            System.out.println("Şifre giriniz");
            password = scanner.nextLine();
            isValidPsw = validatePassword(password);


        }while (!isValidPsw);

        User user = new User(name, username, email, password);
        usernameList.add(username);
        emailList.add(email);
        passwordList.add(password);

        System.out.println(user);
        System.out.println("Tebrikler kayıt işleminiz gerçekleşmiştir");
        System.out.println("Kullanıcı adı veya email ve şifre ile şifre ile sisteme giriş yapabilirsiniz");

    }
    public void login(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adı veya email giriniz ");
        String usernameOremail = scanner.nextLine();

        boolean iseMail = emailList.contains(usernameOremail);
        boolean isUsername = usernameList.contains(usernameOremail);

        if(iseMail ||isUsername){


           while(true){
               System.out.println("Şifrenizi giriniz");
               String password =  scanner.nextLine();

               int idx;
               if(isUsername){
                   idx = usernameList.indexOf(usernameOremail);
               }else {
                   idx= emailList.indexOf(usernameOremail);
               }

               if(passwordList.get(idx).equals(password)){
                   System.out.println("Sisteme giriş yaptınız");
                   break;
               }else{
                   System.out.println("Şifreniz yanlış. Tekrar deneyiniz");
               }
           }

        }else{
            System.out.println("Sisteme kayıtlı kullanıcı bulunamadı");
            System.out.println("Bilgileri kontrol ediniz ya da üye olunuz");
        }
    }

    public static boolean validateEmail(String email){
        boolean isValid;

       boolean space = email.contains(" ");
       boolean isContainAt = email.contains("@");

       if(space){
           System.out.println("Email boşluk içeremez");
           isValid=false;
       }else if(!isContainAt){
           System.out.println("Email '@' içermelidir");
           isValid=false;
       }else{
           String firstPart = email.split("@")[0];
           String secondPart = email.split("@")[1];

           boolean checkStart = firstPart.replaceAll("[a-zA-Z0-9_.-]", "").length()==0;
           boolean checkEnd = secondPart.equals("gmail.com") ||
                                            secondPart.equals("yahoo.com") ||
                                            secondPart.equals("hotmail.com");

           if(!checkStart){
               System.out.println("Email küçük harf, büyük harf, rakam ve -._ dışında karakter içeremez");
           } else if (!checkEnd) {
               System.out.println("Email gmail.com, hotmail.com, yahoo.com ile bitmeli");
           }
           isValid = checkEnd && checkStart;

       }
       return isValid;

    }

    public static boolean validatePassword(String password){
    boolean isValid;

    boolean space = password.contains(" ");
    boolean lengthGt6 = password.length()>=6;
    boolean existUpper = password.replaceAll("^A-Z", "").length()>0;
    boolean existLower = password.replaceAll("^a-z", "").length()>0;
    boolean existDigit = password.replaceAll("[\\D]", "").length()>0;
    boolean existSymbol = password.replaceAll("[\\P{Punct}]", "").length()>0;
    
    if(space){
        System.out.println("Şifre boşluk içeremez");
    } else if (!lengthGt6) {
        System.out.println("Şifre en az 6 karakter içermelidir");
    } else if (!existUpper) {
        System.out.println("Şifre en az bir büyük harf içermelidir");
    } else if (!existLower) {
        System.out.println("Şifre en az bir küçük harf içermelidir");
    } else if (!existDigit) {
        System.out.println("Şifre en az bir rakam içermelidir");
    } else if (!existSymbol) {
        System.out.println("Şifre en az bir sembol içermelidir");
    }

    isValid = !space && lengthGt6 && existUpper && existLower && existDigit && existSymbol;

    if(!isValid){
        System.out.println("Tekrar deneyiniz");
    }
    return isValid;

    }

}
