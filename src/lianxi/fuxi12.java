package lianxi;

import java.util.Scanner;

public class fuxi12 {
    public static void main(String[] args) {
        int[]arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请第"+(i+1)+"个评委打分");
            arr[i]=sc.nextInt();
        }
//           bianli(arr);
           int max=getmax(arr);
            int min=getmin(arr);
            int sum=getsum(arr);
           int avr=(sum-max-min)/(arr.length-2);
            System.out.println("该选手的最终得分为:"+avr);


    }
    public static void bianli(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            ;
        }
    }
    public static int getmax(int[]arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getmin(int[]arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
       return min;
    }
    public static int getsum(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
