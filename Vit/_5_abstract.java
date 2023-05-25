abstract class marks{
    abstract double getPercentage();
}

class A extends marks{
    public int subject1;
    public int subject2;
    public int subject3;
    A(int subject1,int subject2, int subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    double getPercentage(){
        double percentage = subject1 + subject2 + subject3;
        return (percentage/300)*100;
    }
}
class B extends marks{
    public int subject1;
    public int subject2;
    public int subject3;
    public int subject4;
    B(int subject1,int subject2, int subject3, int subject4){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage(){
        double percentage = subject1 + subject2 + subject3 + subject4;
        return (percentage/400)*100;
    }
}

public class _5_abstract {
    public static void main(String[] args) {
        A StudentA = new A(54,35,21);
        double percentage = StudentA.getPercentage();
        System.out.println("Percentage of Student A is: "+ percentage);

        B StudentB = new B(34,64,32,53);
        double percentage1 = StudentB.getPercentage();
        System.out.println("Percentage of Student B is: "+ percentage1);
    }
}
