package day02;

/**
 * 1.String属于引用类型
 * 2.使用String类型变量时，使用一对“”;
 * 3.Stirng能和8种基本数据类型变量运算，且运算连接只能是：+
 */
public class T_04StringTest {
    public static void main(String[] args) {
        String s1="hello world!";
        System.out.println(s1);
        String s2=""; //编译通过
        System.out.println(s2);
        String s3="a";
//        char c1=''; 编译不通过
        int i1=1001;
        String s4="学号：";
        String s5=s4+i1;
        System.out.println(s5);
    }
}
