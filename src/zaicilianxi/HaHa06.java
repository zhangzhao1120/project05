package zaicilianxi;
//已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
//​交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。
public class HaHa06 {
    public static void main(String[] args) {
        int[]arr={19, 28, 37, 46, 50};
        diaohuan(arr);
//        fanzhuan(arr);
    }
    public static void diaohuan(int[]arr){

        for(int start=0,end=arr.length-1;start<end;start++,end--){
            int tem=arr[start];
            arr[start]=arr[end];
            arr[end]=tem;

        }
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
   /* public static void fanzhuan(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }*/
}
