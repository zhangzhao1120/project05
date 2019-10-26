package lianxi;
//我国古代数学家张丘建在《算经》一书中提出的数学问题：
//鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
//​百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
public class fuxi05 {
    public static void main(String[] args) {
        for (int i = 0; i <=20 ; i++) {
            for (int j = 0; j <=33 ; j++) {
                int m=100-i-j;
                if(m%3==0&&5*i+3*j+m/3==100){
                    System.out.println("鸡翁"+i+"鸡母"+j+"鸡雏"+m);
                }
            }
        }
    }
}
