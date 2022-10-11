class A extends Thread{
    public void run()
    {
        int i;
        for(i = 0;i<=5;i++)
        {
            System.out.println("\t From thread A: i = "+i);
        }
        System.out.println("\t Exit from thread A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j = 0; j<=5; j++)
        {
            System.out.println("\t From thread B: "+j);
        }
        System.out.println("\t Exit from thread B");
    }
}
class thread
{
    public static void main(String[] args) {
        A threadA = new A();
        threadA.start();
        new B().start();
    }
}