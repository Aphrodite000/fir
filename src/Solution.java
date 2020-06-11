import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        while(c<n){
            a=b;
            b=c;
            c=a+b;
        }
        if(c-n<n-b){
            System.out.println(c-n);
        }else{
            System.out.println(n-b);
        }

    }
}
