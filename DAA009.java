import java.util.*;

class Letra implements Comparable<Letra>{
    public char ch;
    public int many;
    public int ocor;
    
    Letra(char c, int m, int o){
        ch = c;
        many = m;
        ocor = o;
    }

    public int compareTo(Letra l){
        if (many != l.many){
            return Integer.compare(l.many, many);
        } 
        else{
            return Integer.compare(ocor, l.ocor);
        }
    }
}

public class DAA009{

    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);

        String s=in.next();

        Letra v[] = new Letra[26];

        for(int i=0; i<26; i++){
            char ch = (char) ((int) 'A' + i);
            v[i] = new Letra(ch,0,-1);
        }

        for(int j=0; j<s.length(); j++){
            char cur_ch = s.charAt(j);
            int index = (int) cur_ch - (int) 'A';
            v[index].many++;
            if (v[index].ocor==-1){
                v[index].ocor=j;
            }
        }

        Arrays.sort(v);

        for (int j = 0; j<26; j++)
            if (v[j].many>0)
                System.out.println(v[j].ch + " " + v[j].many);

    }
}