class NegativeAgeException extends Exception
{
    private int age;
    public NegativeAgeException(int age)
    {
        this.age = age;
    }
    public String toString()
    {
        return "Age cannot be negative";
    }
}

public class user_defined {
    public static void main(String[] args) throws Exception{
        int age = getAge();
        if(age < 0)
        {
            throw new NegativeAgeException(age);
        }
        else
        {
            System.out.println("Age entered is: "+ age);
        }
    }
    static int getAge()
    {
        return -7;
    }
}
