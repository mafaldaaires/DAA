public class DAA025 {

    static void dfs(int v, int n, boolean adj[][],boolean visited[]){
        visited[v]=true;
        for(int i=1; i<=n; i++){
            if (adj[v][i] && !visited[i])
                dfs(i,n,adj,visited);
        }
    }

    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();

        boolean adj[][] = new boolean[n+1][n+1];
        boolean visited[] = new boolean[n+1];

        for(int i=1; i<=l; i++){
            int n1 = in.nextInt();
            int n2 = in.nextInt();

            adj[n1][n2] = adj[n2][n1] = true;
        }


        int contador=0;
        for(int j=1; j<=n; j++){
            if(!visited[j]){
                contador++;
                dfs(j,n,adj,visited);
            }
        }
        
        FastPrint.out.println(contador);
        FastPrint.out.close();
    }
}