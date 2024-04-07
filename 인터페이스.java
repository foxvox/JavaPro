public class Main
{

    public static void main(String[] args)
    {
        Name1 name1 = new Name1("자바");
        Name2 name2 = new Name2("Java");
        System.out.println(name1 instanceof NameInterface);
        name1.friend("Object4");
        name2.friend("Object4");
    } // public static void main(String[] args)
}

interface NameInterface
{
    void friend(String friend);
}

class Name1 implements NameInterface
{
    String name;

    public Name1(String name)
    {
        this.name = name;
    }

    public void friend(String friend)
    {
        System.out.println("새로운 친구요청: " + friend);
    }
}

class Name2 implements NameInterface
{
    String name;

    public Name2(String name)
    {
        this.name = name;
    }

    public void friend(String friend)
    {
        System.out.println(friend + "가 친구하기를 요청했습니다.");
    }
}