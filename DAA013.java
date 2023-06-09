import java.util.*;

class Segment implements Comparable<Segment>{
    int li;
    int ri;
    int size;

    Segment(int l, int r, int s){
        li=l;
        ri=r;
        size=s;
    }

    public int compareTo(Segment p){
        if(li!=p.li) return Integer.compare(li,p.li);
        else{
            if(size<p.size){return +1;}
            else if(size>p.size){return -1;}
        }
        return 0;
    }
}

public class DAA013{
    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        Segment[] s = new Segment[n];

        for(int i=0; i<n; i++){
            int li=in.nextInt();
            int ri=in.nextInt();
            int size = ri-li;
            s[i] = new Segment(li,ri,size);
        }

        Arrays.sort(s);

        int end = 0;
        int sum = 0;
        while (end < m) {
            int aux=end;
            for (int j = 0; j<n; j++) {
                if (s[j].li<=end && s[j].ri>aux){
                    aux = s[j].ri;
                }
            }
            end = aux;
            sum++;
        }

        FastPrint.out.println(sum);
        FastPrint.out.close();
    }
}