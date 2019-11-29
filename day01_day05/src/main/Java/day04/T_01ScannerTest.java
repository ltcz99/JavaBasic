package day04;
/**
 * 如何从键盘获取不同的变量，需要使用Scanner类
 * 具体实现步骤：
 * 1.导包：import java.util.Scanner;
 * 2.Scanner的实例化（创建对象）
 * 3.调用Scanner类的相关方法，来获取指定的变量
 */

import java.util.Scanner;

public class T_01ScannerTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //1.获取int类型
        int score=scan.nextInt();
        System.out.println("score="+score);
        //2.获取String

        System.out.println("请输入你的姓名:");
        String name=scan.nextLine();
        System.out.println(name);
        //3.获取double
        double d =scan.nextDouble();
        //4.获取boolean
        boolean b=scan.nextBoolean();
    }
}
