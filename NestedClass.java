import java.lang.*;
public class Main
{
    static int i = 100;

    static class Nested1
    {
        public int getInt()
        {
            return i;
        }
    }
    public static void main(String[] args)
    {
        Nested1 nested1 = new Nested1();
        System.out.print(nested1.getClass());
        System.out.print("의 클래스 메소드 getInt(): ");
        System.out.println( + nested1.getInt());
    } // public static void main(String[] args)
}
