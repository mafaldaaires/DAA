import java.util.TreeMap;
import java.util.Map;

public class DAA021 {
    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);
        TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();

        int a = in.nextInt();
        int r = in.nextInt();
        
        for(int i=0; i<a+r; i++){
            String line = in.next();
            if(line.equals("BAK")){
                int n = in.nextInt();
                if(m.containsKey(n)){
                    int value = m.get(n)+1;
                    m.replace(n,value);
                }
                else{
                    m.put(n,1);
                }
            }
            if(line.equals("MIN")){
                Map.Entry<Integer, Integer> first = m.firstEntry();
                if(first.getValue()>1){
                    int key=first.getKey();
                    int value=first.getValue()-1;
                    m.replace(key,value);
                }
                else{
                    m.pollFirstEntry();
                }
                FastPrint.out.println(first.getKey());
            }
            if(line.equals("MAX")){
                Map.Entry<Integer, Integer> last = m.lastEntry();
                if(last.getValue()>1){
                    int key=last.getKey();
                    int value=last.getValue()-1;
                    m.replace(key,value);
                }
                else{
                    m.pollLastEntry();
                }
                FastPrint.out.println(last.getKey());
            }
        }

        FastPrint.out.close();
    }
}