import java.util.*;
public class decimaltobinary {
    public static int decToBin(int n){
        int i=0;
        int bin=0;
        int ld=0;
        while(n>0){
            ld=n%2;
            bin=bin+(ld*(int)Math.pow(10,i));
            i++;
            n=n/2;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();

        int binNum=decToBin(n);
        System.out.println("Binary number:"+binNum);
    }
}
