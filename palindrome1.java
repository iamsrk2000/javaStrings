import java.util.*;
public class palindrome1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length()-1;
        String b="";
        for(int i=n;i>=0;i--){
            b=b+s.charAt(i);
        }
        if(s.equals(b)){
            System.out.println("The given Word is palindrome");
        }
        else{
            System.out.println("The given word is not palindrome");
        }
    }
    
}
