package zaicilianxi;

import java.util.Scanner;

//已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，
// 查找该数据在数组中的索引。
//​	并在控制台输出找到的索引值。如果没有查找到，则输出-1
//明确返回值为int 明确参数为一个数组和一个键盘输入的数字
public class HaHa05 {
    public static void main(String[] args) {
        int[]arr={19, 28, 37, 46, 50};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要查找的元素:");
        int num=sc.nextInt();
        int res=find(arr,num);
        System.out.println("你查询的元素对应的索引号为:"+res);

    }
    public static int find(int[]arr,int num){
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                index=i;
            }
        }
        return index;
    }
}
