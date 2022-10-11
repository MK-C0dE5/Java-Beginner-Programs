class Rectangle
{
    double length;
    double width;
    void getdata(int x, int y)
    {
        length = x;
        width = y;
    }
    void putdata()
    {
        System.out.println("The Value of x is: "+ length);
        System.out.println("The value of y is: "+ width);
        System.out.println("The area of rectangle is: "+ length*width);
    }
}
class class1
{
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.getdata(10,20);
        R1.putdata();
    }
}