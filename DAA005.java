//somas acumuladas

public class DAA005{
    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);

        int n = in.nextInt();

        int[] l = new int[n];
        int i=0;

        for(int j=0; j<n; j++){
            int e = in.nextInt();
            if (i==0){l[i]=e;}
            else{l[i]= l[i-1]+e;}
            i++;
        }

        int f = in.nextInt();

        for(int k=0; k<f; k++){
            int inic = in.nextInt();
            int fin = in.nextInt();

            int sum=0;
            if (inic==1){sum= l[fin-1];}
            else{sum = l[fin-1]-l[inic-2];}

            FastPrint.out.println(sum);
        }
        FastPrint.out.close();
    }
}