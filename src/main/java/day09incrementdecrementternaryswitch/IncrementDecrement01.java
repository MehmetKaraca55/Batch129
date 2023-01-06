package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);

        //Increment 1:
        a = a + 2; //veya a +=2
        System.out.println(a);

        //Example 1: Bir tane int variable oluşturun, ve onu iki şekilde 5 artırın.

        int s = 3;
        System.out.println(s);
        s = s + 5;
        System.out.println(s);
        s +=5;
        System.out.println(s);

        //Decrement 1:

        int c = 8;
        System.out.println(c);

        c = c-3;
        System.out.println(c);

        c -=3;
        System.out.println(c);

        //Increment 2:

        int d = 6;
        System.out.println(d);

        d = d*2;//12
        System.out.println(d);

        d *=2;//24
        System.out.println(d);

        //Decrement 2:

        int e = 24;
        System.out.println(e);

        e = e/2;//12
        System.out.println(e);

        e /=2;//6
        System.out.println(e);


        //1 ile Increment ve Decrement

        int f = 12;
        // f = f + 1;
        // f +=1;

        f++;

        // 1 ile Decrement

        int h = 10;
        //h = h -1;
        // h -=1;

        h--;


        // Post Increment ve Pre Increment

        int i = 10;

        int k = i++; //post increment çünkü increment variable ın isminden sonra yazıldı.
        System.out.println(k); //10 ==> "i" artırılmadan "k" ya konulduğu için, k nın değeri 10 olur.
        System.out.println(i); //11 ==> "i" satır sonunda artırıldığı için "i" nin

        int m = 15;

        int n = ++m; //pre increment çünkü increment variable ın isminden önce yazıldı.
        System.out.println(m); //16 ==> "m" satır sonunda artırıldıkdan sonra "n" ye konulduğu için "n" 16 olur.
        System.out.println(n); //16 ==> "m" artırıldıktan sonra "n" ye konulduğu için "n" 16 olur.

        //Post Decrement ve Pre Decrement

        int p = 17;
        int r = p--;
        System.out.println(p);
        System.out.println(r);

        int u = 20;
        int t = --u;
        System.out.println(u);
        System.out.println(t);







    }

}
