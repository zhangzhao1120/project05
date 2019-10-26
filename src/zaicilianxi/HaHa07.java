package zaicilianxi;
/*
* (1)定义方法public static boolean isSXH(int num)，功能:判断数字num是否是水仙花数,
* 如果是返回true,如果不是返回false。
(2)定义方法public static int getCount(),功能：
借助isSXH方法，获取100到999以内水仙花个数，
(3)定义方法public static int[] getArr(int count)，根据参数值创建int数组，
借助isSXH方法，获取100到999以内水仙花数，存入到数组并返回。
(4)在main方法中调用getCount方法，获取水仙花的个数，然后调用getArr方法，
将水仙花的个数作为参数传递，获取到返回值后遍历打印数组。*/







public class HaHa07 {
    public static void main(String[] args) {
        boolean a=isSXH(371);
        System.out.println(a);
        int b=getCount();
        System.out.println(b);
        int[]arr2=getArr(b);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
    public static boolean isSXH(int num){
       int ge=num%10;
       int shi=num/10%10;
       int bai=num/10/10%10;
        if(num==ge*ge*ge+shi*shi*shi+bai*bai*bai){
            return true;
        }else{
            return false;
        }
    }
    public static int getCount(){
        int count=0;
        for (int i = 100; i <=999 ; i++) {
            if(isSXH(i)==true){
                count++;
            }
        }
       return count;
    }
    public static int[] getArr(int count){
                int index=0;
                int[]arr=new int[count];
        for (int i = 100; i <=999 ; i++) {
            if(isSXH(i)==true){
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
}
