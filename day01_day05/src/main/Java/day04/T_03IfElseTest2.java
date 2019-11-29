package day04;
/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。
 */
import java.util.Scanner;
public class T_03IfElseTest2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2=scanner.nextInt();
        System.out.println("请输入第三个数：");
        int num3=scanner.nextInt();

        if(num1>=num2){
            if(num2>=num3){
                System.out.println(num1+","+num2+","+num3);
            }else if(num2<num3){
                System.out.println(num1+","+num3+","+num2);
            }else{
                System.out.println(num3+","+num1+","+num2);
            }
        }else{  //num1<=num2
            if(num3>=num2){
                System.out.println(num3+","+num2+","+num1);
            }else if(num3<num1){
                System.out.println(num2+","+num1+","+num3);
            }else {
                System.out.println(num2+","+num3+","+num1);
            }
        }
        int x = 4;
        int y = 1;
        if (x > 2) {
            if (y > 2)
                System.out.println(x + y);
            System.out.println("atguigu");
        } else //if else 没有大括号就遵循就近原则
            System.out.println("x is " + x);


    }

}
