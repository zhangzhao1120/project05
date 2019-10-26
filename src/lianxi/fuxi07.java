package lianxi;

public class fuxi07 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55, 66};
        boolean result = panduan(arr, arr2);
        System.out.println("这两个数组相等吗?:" + result);
    }

    public static boolean panduan(int[] arr, int[] arr2) {
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

/*
  public static boolean panduan(int[]arr,int[]arr2){
                if(arr.length!=arr2.length){
                return false;}
      for (int i = 0; i <arr.length ; i++) {
          if(arr[i]!=arr2[i]){
              return false;
          }
      }
      return true;
  }
}*/
