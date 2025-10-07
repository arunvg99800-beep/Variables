public class Variables
{
    int num =100;// Global or Instance Variable creating inside class but we can use inside method
    void m1()
    {
       int num1 = 10;//Local variable creating withing the method
        System.out.println(num1);
        System.out.println(num + num1);
       // System.out.println(num2);
    }
    void m2()
    {
        int num2 = 20;//Local variable creating withing the method
        System.out.println(num2);
    }
    public static void main(String[] args)
    {
        Variables obj = new Variables();
                  obj.m1();
                  obj.m2();
    }
}
