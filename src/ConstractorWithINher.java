public class ConstractorWithINher {
    ConstractorWithINher(int i)
    {
        System.out.println("hi first constractor");
    }
    public void ttt()
    {
        System.out.println("hi i am using super class");
    }
}
class Inher extends ConstractorWithINher
{

    Inher()
    {
        super(0);
        System.out.println("hi this is second constractor");
    }
    public void test()
    {
        super.ttt();
    }
}
