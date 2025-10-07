public class Variablesta
{
     static int num = 400;// Static variable creating inside class we can use inside method

    void m1()
    {
        System.out.println(num + 10);
    }

    public static void main(String[] args)
    {
        Variablesta obj = new Variablesta();
                    obj.m1();
    }
}
