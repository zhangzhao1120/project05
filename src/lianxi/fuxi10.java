package lianxi;

public class fuxi10 {
    public static void main(String[] args) {
        int[]arr={11,22,33,44,55,66};
        fanzhuan(arr);
        fanzhuan1(arr);

    }
    public static void fanzhuan(int[]arr){
        //数组内部变量的调换操作
        for(int start=0,end=arr.length-1;start<end;start++,end--){
          int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
    public static void fanzhuan1(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }


        }
        System.out.println("]");
    }
}
