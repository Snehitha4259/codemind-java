import java.util.Scanner;
public class Vote{
    public static void main(String[] args){
        
    Scanner read=new Scanner (System.in);
   int  n=read.nextInt();
    if(n>=18) {
        System.out.println("YES");
        
    }
    else {
        System.out.println("NO");
    }
}
}