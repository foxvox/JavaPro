import java.lang.*;
public class Main
{
    int value1;
    int value2;

    public Main(int _value1, int _value2)
    {
        this.value1 = _value1;
        this.value2 = _value2;
    }

    public int multiply()
    {
        int result = value1 * value2;
        return result;
    }

    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("사용법: java Multiplier <곱할수1> <곱할수2>");
            System.exit(1);
        }

        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        Main m = new Main(val1, val2);
        System.out.println(m.multiply());

    } // public static void main(String[] args)
}
