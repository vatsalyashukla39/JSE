package Arrays;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetter {
    public static void main(String[] args) {
        char[] ch ={'a','c','d'};
        System.out.println(nextGreatestLetter(ch,'b'));

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int s=0,e=letters.length-1,mid=s+(e-s)/2;int c=0;
        if (letters[e]<=target)
            return letters[0];
        while(s<=e){
            if(letters[mid]>target){
                e=mid-1;

        }
            else if (letters[mid]<target){
                s=mid+1;
            }
            else {
            for(int i=mid+1;i<letters.length;i++){
                if(letters[i]!=target)
                    c=i;
                else c=0;

            }}mid=s+(e-s)/2;}

   return letters[c]; }
}

//OPTIMISED APPROACH
//    public static char nextGreatestLetter(char[] letters, char target) {
//        int s=0,e=letters.length-1;
//
//        while(s<=e){
//            int mid=s+(e-s)/2;
//            if(letters[mid]>target)
//                e=mid-1;
//            else
//                s=mid+1;
//
//        }
//        return letters[s%(letters.length)];
//}}