//maior racio m/d
import java.util.*;

class Encomenda implements Comparable<Encomenda>{
    double d;
    double m;
    double racio;
    int index;

    Encomenda(double di, double mi, double r, int i){
        d=di;
        m=mi;
        racio=r;
        index=i;
    }

    public int compareTo(Encomenda e){
        if(racio<e.racio){return +1;}
        else if(racio>e.racio){return -1;}
        return Integer.compare(index,e.index);
    }
}

public class DAA014 {
    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);
        int n = in.nextInt();
        Encomenda[] e = new Encomenda[n];

        for(int i=0; i<n; i++){
            double d = in.nextDouble();
            double m = in.nextDouble();
            double racio=m/d;
            e[i]=new Encomenda(d,m,racio,i);
        }

        Arrays.sort(e);

        for(int s=0; s<n; s++){
            if(s==n-1){
                FastPrint.out.print(e[s].index+1);
            }
            else{
                FastPrint.out.printf(e[s].index+1 + " ");
            }
        }

        FastPrint.out.println();
        FastPrint.out.close();
    }
}