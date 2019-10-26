package lianxi;

import java.util.Scanner;

public class fuxi08 {
    public static void main(String[] args) {
        int[]arr={11,22,33,44,55,66};
        int result=find(arr);
        System.out.println("索引号为:"+result);
    }
    public static int find(int[]arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int a=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i]){
                return i;
            }else{
                continue;
            }
        }
        return -1;
    }
}
