import java.lang.*;
public class Main
{
    int i;

    public Main(int i)
    {
        this.i = i;
    }

    public class Inner
    {
        public int getInt()
        {
            return i;
        }
    }
    public static void main(String[] args)
    {
        Main main1 = new Main(100);
        Main.Inner inner1 = main1.new Inner();
        System.out.print(inner1.getClass());
        System.out.print("의 인스턴스 메소드 getInt(): ");
        System.out.println( + inner1.getInt());
    } // public static void main(String[] args)
}
