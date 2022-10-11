package mypkg1;

public class delay {
    public static void millisec(int n)
    {
        long i,j,k;
        for(k=0;k<n;k++)
        {
            j = 10000000;
            for(i=1;i<1000000;i++)
            {
                j=j+1;
            }
        }
    }    
}
