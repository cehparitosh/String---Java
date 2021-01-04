import java.io.*;
import java.util.*;
class revstr
{
    public void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str="",word;
        int l,l1,i;
        String a[]=new String[20];
        System.out.println("enter string");
        str=sc.nextLine();
        StringTokenizer data=new StringTokenizer(str);
        l=data.countTokens();
        for(i=0;i<l;i++)
        {
           word=data.nextToken();
           a[i]=word;
        }
        for(i=l-1;i>=0;i--)
        {
           System.out.print(a[i]+" ");
        }
    }
}