import java.util.Scanner;

public class DAA001{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for(int i=0; i<n; i++){
            int s = in.nextInt();
            if (s==42){
                count ++;
            }
        }
        System.out.println(count);
    }
}