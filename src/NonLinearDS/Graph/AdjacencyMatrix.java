package NonLinearDS.Graph;

import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int adjMat[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                System.out.println("");
                String path=sc.next();
                if(path.equals("y")||path.equals("Y")) adjMat[i][j]=1;
            }
        }


    }

}
