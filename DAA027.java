public class DAA027 {

    static boolean[] visited;
    static boolean[][] adj;
    static int[] colorida;

    static boolean flag;

    static int v;
    static int e;
    
    static void dfs(int x){
        if(flag){return;}

        for(int i=1; i<=v; i++){
            if(adj[x][i]){
                if (!visited[i]){
                    visited[i] = true;
                    //atribui cor diferente ao nó vizinho
                    if(colorida[x]==1){colorida[i]=2;} 
                    if(colorida[x]==2){colorida[i]=1;}
                    dfs(i);
                }
                if (colorida[x]==colorida[i]){flag=true;} //i é nó vizinho de x e ambos têm a mesma cor
            }
        }
    }

    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);

        int n = in.nextInt();
        
        for(int i=0; i<n; i++){
            flag=false;

            v = in.nextInt();
            e = in.nextInt();

            adj = new boolean[v+1][v+1];
            visited = new boolean[v+1];
            colorida = new int[v+1];
            
            for(int j=0; j<e; j++){

                int a = in.nextInt();
                int b = in.nextInt();

                adj[a][b] = adj[b][a] = true;
            }

            colorida[1] = 1;
            for (int l=1; l<=v; l++){
                if (!visited[l]) 
                    dfs(l);
            }

            if (!flag){
                FastPrint.out.println("sim");
            }
            else {
                FastPrint.out.println("nao");
            }

        }
        FastPrint.out.close();
    }
}