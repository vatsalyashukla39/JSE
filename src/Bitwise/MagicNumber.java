package Bitwise;

public class  MagicNumber{
    public static void main(String[] args) {
        int i;
        //System.out.println(i);
        System.out.println(nthMagicNo(3));
    }
    static int nthMagicNo(int n){
        int pow=1,answer=0;
        while(n!=0){
            pow*=5;
            if((int)(n&1)==1)
                answer+=pow;
            n>>=1;
        }return answer;
    }
}
