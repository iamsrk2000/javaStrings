import java.util.*;
public class palindrome {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char[] c=s.toCharArray();
    String p="";
    int n=s.length();
    for(int i=n-1;i>=0;i--){
      p=p+c[i];  
    }
    if(s.equals(p)){
        System.out.println("The given String is Palindrome");
    }
    else{
        System.out.println("The given String is not palindrome");
    }
    
}
    
}
