class Clss
{
    public static int suja = 100;

    public static void method()
    {
        System.out.println("Java, Class Language!");

        suja += 10;
    }
}
public class Main
{
    public static void main(String[] args)
    {
       int n = Clss.suja;

       System.out.println(n);

       Clss.method();

       n = Clss.suja;
       System.out.println(n);

    } // public static void main(String[] args)
}