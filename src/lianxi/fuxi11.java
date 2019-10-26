package lianxi;

import java.util.Scanner;

public class fuxi11 {
    public static void main(String[] args) {
        int[]arr={12,13,14,15,16};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要查询的数字:");
        int num=sc.nextInt();
        int result=getindex(arr,num);
        System.out.println("该数字对应的索引号为:"+result);
    }
   public static int getindex(int[]arr,int num){
        int index=-1;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]==num){
               index=i;
               break;
           }
       }
       return index;
   }
}
