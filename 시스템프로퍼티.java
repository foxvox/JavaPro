import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            Properties p = System.getProperties();
            p.list(System.out);
        }
        else
        {
            System.out.println(System.getProperty(args[0]));
        }

    } // public static void main(String[] args)
}
