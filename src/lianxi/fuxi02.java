package lianxi;

import java.util.Scanner;

public class fuxi02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个星期数:");
        int week=sc.nextInt();
        test01((byte)week);

    }
    public static void test01(int week){
        if(week==1){
            System.out.println("跑步");
        }else if(week==2){
            System.out.println("游泳");
        }
        else if(week==3){
            System.out.println("慢走");
        }
        else if(week==4){
            System.out.println("哈哈");
            System.out.println("动感单车");
        }
        else if(week==5){
            System.out.println("拳击");
        }
        else if(week==6){
            System.out.println("爬山");
        }
        else if(week==7){
            System.out.println("好好吃一顿");
        }else{
            System.out.println("你输入的星期数有误");
        }
    }
    public static void test01(byte week){
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("你输入的星期数有误");
        }
    }
}
