public class Main
{
    int instanceInt1;
    final int instanceInt2;

    {
        instanceInt1 = 5;
        System.out.println("Instance 초기화");
    }

    static int classInt;

    static
    {
        classInt = 10;
        System.out.println("Static 초기화");
    }

    public Main(int value)
    {
        instanceInt2 = value;
        System.out.println("생성자에서 받은 수: " + value);
    }

    public void printInstanceInt()
    {
        System.out.println("Instance 변수: " + instanceInt2);
    }

    public static void printStaticInt()
    {
        System.out.println("Class 변수: " + classInt);
    }

    public static void main(String[] args)
    {
        Main.printStaticInt();
        Main obj1 = new Main(20);
        obj1.printInstanceInt();
        Main obj2 = new Main(30);
        obj2.printInstanceInt();
    } // public static void main(String[] args)
}