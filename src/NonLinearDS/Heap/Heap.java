package NonLinearDS.Heap;

import java.util.Scanner;

public class Heap {
    public static void main(String[] args) {
        int []heap=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i < heap.length; i++) {
            System.out.println("Enter element :");
            int data=sc.nextInt();
            insertHeap(heap,i,data);
        }
        for(int x:heap){
            System.out.print(x+" ");
        }
    }
    private static void insertHeap(int []heap,int i,int data){
            heap[i]=data;
            while (i>1&&data>heap[(i)/2]){
                int temp=heap[(i)/2];
                heap[(i)/2]=heap[i];
                heap[i]=temp;
                i=(i)/2;
            }
    }
    private static void insertHeap2(int []heap,int i,int data){
        int par,child;
        par=child=i;
        while (child>1){
            par=child/2;
            if (heap[par]>data){
                heap[child]=data;
                return;
            }
            heap[child]=heap[par];
            child=par;
        }
    }
}
