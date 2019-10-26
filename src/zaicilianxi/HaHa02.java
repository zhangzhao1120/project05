package zaicilianxi;
//我国古代数学家张丘建在《算经》一书中提出的数学问题
// 鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
//​ 百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
//穷举法?for循环,返回值类型void
public class HaHa02 {
    public static void main(String[] args) {
        for(int a=0;a<=20;a++){
            for(int b=0;b<=33;b++){
                int c=100-a-b;
                if(c%3==0&&5*a+3*b+c/3==100){
                    System.out.println(a+"  "+b+"  "+c);
                }
            }
        }
    }

}
