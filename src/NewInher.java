public class NewInher
{
    public void set()
    {
        System.out.println("+++++++++++hi I am add new class like NewInnher+++++");
    }
}

class NewInherchild extends NewInher
{
    public void set()
    {
        super.set();
        System.out.println("************hi this is chield class set******");
    }
}
