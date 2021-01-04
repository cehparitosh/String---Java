import java.util.*;
class FiboString
{
    String x,y,z;
    int n;
     
    FiboString()
    {
        x = "a";
        y = "b";
        z = "ba"; // mentioned in the question otherwise not required. z = "" is sufficient
    }
     
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of terms : ");
        n = sc.nextInt();
    }
     
    void generate()
    {
        System.out.print("\nThe Fibonacci String Series is : ");
        if(n <= 1) // If no of terms is less than or equal to 1
            System.out.print(x);
        else
        {
            System.out.print(x+", "+y);
            for(int i=3; i<=n; i++)
            {
                z = y+x;
                System.out.print(", "+z);
                x = y;
                y = z;
            }
        }
    }
     
    public static void main(String args[])
    {
        FiboString ob = new FiboString();
        ob.accept();
        ob.generate();
    }
}