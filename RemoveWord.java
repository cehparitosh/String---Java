import java.util.*;
class RemoveWord
{           
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int l = s.length();
        char last = s.charAt(l-1); // Extracting the last character
 
        /* Checking whether the sentence ends with '.' or '?' or not */
        if(last != '.' && last != '?' && last != '!')
        {
            System.out.println("Invalid Input. End a sentence with either '.', '?' or '!' only");
        }
        else
        {
            StringTokenizer str = new StringTokenizer(s," .?!");
            int c = str.countTokens();
            String w="",ans = "";
            System.out.print("Enter the word to delete : ");
            String del = sc.next();
            System.out.print("Enter the word position is the sentence : ");
            int x = sc.nextInt();
 
            if(x<1 || x>c) // Checking whether integer inputted is acceptable or not
            {
                System.out.println("Sorry! The word position entered is out of range");
            }
            else
            {      
                for(int i=1; i<=c; i++)
                {
                    w = str.nextToken();
                    /* Skipping if the word to delete and the position matches */
                    if(w.equals(del)==true && i == x)
                        continue;
                    ans = ans + w + " ";
                }
                System.out.print("Output : "+ans.trim()+last);
            }
        }
    }
}