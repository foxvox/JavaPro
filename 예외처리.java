import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            int i = 1 / 0;
            System.out.println("i의 값: " + i);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("숫자에 관한 예외상황 발생: " + ae);
        }
        catch (Exception e)
        {
            System.out.println("예외상황 발생: " + e);
        }
        finally
        {
            System.out.println("이 코드는 무조건 실행"); 
        }

    } // public static void main(String[] args)
}
