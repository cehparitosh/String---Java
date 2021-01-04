import java.io.*;
class repeatwords
{
     public static void main(String args[]) throws IOException
    {
     InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader x=new BufferedReader (read);
    System.out.println("enter any word");
    String s=x.readLine();
    s=s+" ";
    int l=s.length();
    String ans="";
    char ch1,ch2;
    for(int i=0;i<l-1;i++)
    {
        ch1=s.charAt(i);
        ch2=s.charAt(i+1);
        if(ch1!=ch2)
        {
            ans=ans+ch1;
        }
    }
    System.out.println("word after removing repeated characters="+ans);
}
}