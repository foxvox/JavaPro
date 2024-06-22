import java.lang.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        if (args.length < 1)
        {
            System.out.println("사용법: java ClassVersion 클래스이름");
            System.exit(1);
        }

        Class c = Class.forName(args[0]);
        Package pkg = c.getPackage();

        if (pkg == null)
        {
            System.out.println("패키지 정보가 없습니다.");
        }
        else
        {
            System.out.println(pkg);
            try
            {
                if (pkg.isCompatibleWith("21.0.1"))
                    System.out.println("Java 2(JKD 1.2)와 호환되는 클래스입니다.");
            }
            catch (Exception e)
            {}
        }


    } // public static void main(String[] args)
}
