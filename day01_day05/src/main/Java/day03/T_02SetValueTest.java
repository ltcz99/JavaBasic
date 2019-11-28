package day03;

public class T_02SetValueTest {
    public static void main(String[] args) {
        //赋值符合
        int i1=10;
        int j1=10;
        int i2,j2;
        //连续赋值
        i2=j2=10;

        int num1=10;
        num1+=2;
        System.out.println(num1);

        short s1=10;
        //s1=s1+10;//编译失败
        s1+=2;
        System.out.println(s1);
    }
}
