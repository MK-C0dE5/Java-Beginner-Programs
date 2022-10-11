interface area
{
    final float PI = 3.14265926F;
    float compute(float x, float y);
}
class triangle implements area
{
    public float compute(float x, float y){
        return (0.5*x*y);
    }
}
class Rectangle implements area
{
    public float compute(float x, float y){
        return (x*y);
    }
}
public class interface1 {
    public static void main(String[] args) {
        Rectangle Rect = new Rectangle();
        triangle t1 = new triangle();
        area Area;
        Area = Rect;
        System.out.println("Area of rectangle = "+Area.compute(10,20));
        Area = t1;
        System.out.println("Area of triangle = "+Area.compute(10,20));
    }
}
