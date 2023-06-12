public class DAA026 {
    static int MAX=100;
    static boolean visited[][] = new boolean[MAX][MAX];
    static char m[][] = new char[MAX][MAX];

    static char FILL = '#';

    static int incrx[] = {-1,1,0,0,-1,-1,1,1};
    static int incry[] = {0,0,-1,1,-1,1,-1,1};

    static int counter;

    static void dfs(int x, int y, int rows, int cols){
        if(x>=0 && x<rows && y>=0 && y<cols){
            if (!visited[x][y] && m[x][y]==FILL){
                visited[x][y]=true;
                counter++;
                for(int i=0; i<incrx.length; i++){
                    dfs(x+incrx[i],y+incry[i],rows,cols);
                }
            }
        }
    }
        
    
    public static void main(String[] args){
        FastScanner in = new FastScanner(System.in);
        int n = in.nextInt();
        
        for(int i=0; i<n; i++){
            int l = in.nextInt();
            int c = in.nextInt();

            for(int b=0; b<l; b++){
                for(int w=0; w<c; w++)
                    m[b][w] = ' ';
            }
            for (int a=0;a<l;a++){
                for (int j=0;j<c;j++) 
                    visited[a][j] = false;
            }

            for(int j=0; j<l; j++){
                String line = in.next();
                for(int k=0; k<c; k++){
                    char ch = line.charAt(k);
                    m[j][k]=ch;
                }
            }

            int max_counter=0;

            for(int s=0; s<l; s++){
                for(int p=0; p<c; p++){
                    if (m[s][p]==FILL && !visited[s][p]){
                        dfs(s,p,l,c);
                        max_counter=Math.max(max_counter,counter);
                        counter=0;
                    }
                }
            }
            
            FastPrint.out.println(max_counter);
            
        }

        FastPrint.out.close();
    }
}