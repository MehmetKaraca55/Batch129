package day30exceptionsinterface;

public class InvalidStudentGradeException extends Exception {

    /*
    1) Kendi application'ınınıza kurallar oluşturmak için, kendi exception class'larınızı oluşturabilirsiniz.
    2) Oluşturduğunuz exception class'lar
        i)compile time exception
        ii) run time exception olabilir.
    3) Compile time exception oluşturmak için, class'ınızın parent'ı exception class olmalıdır.
    4) Run time exception oluşturmak için, class'ınızın parent'ı RuntimeException class olmalıdır.
    5) Kendi oluşturduğumuz exception class'lara "CustumException Class" denir.
     */

    public InvalidStudentGradeException (String message){
        super(message);
    }
}
