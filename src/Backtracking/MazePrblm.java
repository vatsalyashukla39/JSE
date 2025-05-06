package Backtracking;

public class MazePrblm {
    public static void main(String[] args) {
        maze("",0,0);
        System.out.println(count(0,0));
    }
    static void mazeWithObstacles(String p,int xi,int yi){
        if (xi==1&&yi==1)return;

        if (xi==2&&yi==2){
            System.out.println(p);
            return;
        }
        if (xi==2&&yi==1){
            System.out.println(p+"D");
            return;
        }
        if (xi==1&&yi==2){
            System.out.println(p+"R");
            return;
        }
        if (xi==0&&yi==2){
            System.out.println(p+"RR");
            return;
        }
        if (xi==2&&yi==0){
            System.out.println(p+"DD");
            return;
        }
        mazeWithObstacles(p+"S",xi+1,yi+1);
        mazeWithObstacles(p+"R",xi+1,yi);
        mazeWithObstacles(p+"D",xi,yi+1);
    }
    static int count(int xi,int yi){
        if(xi==2||yi==2){
            return 1;
        }
        return count(xi+1, yi)+count(xi, yi+1);
    }
    static void maze(String p,int xi,int yi){
        if (xi==0&&yi==0){
            maze(p+"R",xi+1,yi);
            maze(p+"D",xi,yi+1);
            return;
        }

        if (xi==2&&yi==2){
            System.out.println(p);
            return;
        }
        if (xi==2&&yi==1){
            maze(p+"R",xi+1,yi);
            maze(p+"D",xi,yi+1);
            maze(p+"U",xi,yi-1);
            return;
        }
        if (xi==1&&yi==2){
            maze(p+"R",xi+1,yi);
            maze(p+"L",xi-1,yi);
            maze(p+"U",xi,yi-1);
            return;
        }
        if (xi==0&&yi==2){
            maze(p+"U",xi,yi-1);
            maze(p+"R",xi+1,yi);
            return;
        }
        if (xi==2&&yi==0){
            maze(p+"D",xi,yi+1);
            maze(p+"L",xi-1,yi);
            return;
        }
        if (xi==0&&yi==1){
            maze(p+"R",xi+1,yi);
            maze(p+"D",xi,yi+1);
            maze(p+"U",xi,yi-1);
            return;
        }
        if (xi==1&&yi==0){
            maze(p+"R",xi+1,yi);
            maze(p+"L",xi-1,yi);
            maze(p+"D",xi,yi+1);

        }
        else{
            maze(p+"D",xi,yi+1);
            maze(p+"L",xi-1,yi);
            maze(p+"U",xi,yi-1);
            maze(p+"R",xi+1,yi);
        }

    }
}
