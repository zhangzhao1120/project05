package lianxi;

/*
public class fuxi03 {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            int shi=i/10%10;
            int ge=i%10;
            if(shi==7||ge==7||i%7==0){
                System.out.println(i);
            }
        }
    }
}
*/
public class fuxi03{
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            int shi=i/10%10;
            int ge=i%10;
            if(shi==7||ge==7||i%7==0){
                System.out.println("过");
            }else{
                System.out.println(i);
            }
        }
    }
}
