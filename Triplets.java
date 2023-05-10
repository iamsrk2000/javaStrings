import java.util.*;
public class program_07 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int i,j,k;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='H'){
               for(j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='S'){
                        for(k=j+1;k<s.length();k++){
                            if(s.charAt(k)=='L'){
                                count++;
                            }
                        }
                    }
                }
            }
        }  
        System.out.println(count); 
     }
}
