import java.util.Scanner;

public class DAA002 {
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for(int j=0; j<t; j++){
            int n = in.nextInt();
            int k = in.nextInt();

            n++; //começa a testar com n superior ao atual

            int soma=0;
            while(soma!=k){
                int p = n;
                while(p>0){
                    int aux = p%10;
                    soma += aux;
                    p = p/10;
                }
                if (soma==k){
                    System.out.println(n);
                    break;
                }
                n++;
                soma=0;
            }
        }
    }
}