package zaicilianxi;
//定义一个方法，用于比较两个数组的内容是否相同
public class HaHa04 {
    public static void main(String[] args) {
        int[]arr={11,12,13,15,14,};
        int[]arr2={11,12,13,14,15};
        boolean res=same(arr,arr2);
        System.out.println("这两个数组相同吗?"+res);

    }
    public static boolean same(int[]arr,int[]arr2){
        if(arr.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

}
