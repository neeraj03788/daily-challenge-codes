package array;

import java.util.Scanner;
public class Q2MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the values of the Array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum element is: " + max(arr,size));
        System.out.println("Minimum element is: " +min(arr,size));
    }
    static int max(int arr[],int size){
        int max=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>=max)
                max=arr[i];
        }
        return max;

    }
    static int min(int arr[],int size){
        int min=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]<=min)
                min=arr[i];
        }
        return min;
    }
}
