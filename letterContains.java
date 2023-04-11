import java.util.*;
public class letterContains {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char p=sc.next().charAt(0);
        char c[]=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c[i]==p){
                count=count+1;
            }
            else{
                continue;
            }
        }
        if(count==0){
            System.out.println("The given Character not present in String");
        }
        else{
            System.out.println("The given Character present in String");
        }
    }
    
}
