import java.util.*;
public class program_10 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='7'){
            s=s.replace("7","");
        }
        else if(s.charAt(i)=='5' && s.charAt(i+1)=='6'){
          s=s.replace("5","");
          s=s.replace("6","");
        }

    }
    System.out.println(s);
}
}
