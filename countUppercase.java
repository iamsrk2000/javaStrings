import java.util.*;
public class countUpperCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c[i]>='A' && c[i]<='Z'){
               count=count+1;
            }
            else{
                continue;
            }
        }
        if(count==0){
            System.out.println("No Uppercase Characters");
        }
        else{
            System.out.println(count);
        }
    }
    
}
