package NonLinearDS.Graph;

public class WarshallsAlgo {
    public static void main(String[] args) {

    }
    public static void warshall(int [][] wMat,int [][]sp) {
        int Infinity = 100000;
        int n = wMat.length;
        int m = wMat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (wMat[i][j] == 0) sp[i][j] = Infinity;
                else sp[i][j] = wMat[i][j];
            }
        }
        for (int a = 0; a <n; a++) {
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    sp[i][j]=Math.min(sp[i][j],sp[i][a]+sp[a][j]);
                }
            }
        }
    }
}
