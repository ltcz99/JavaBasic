package day03;

/**
 * 练习：随意给出一个三位数的整数，打印它的个位数，十位数，百位数的值
 * 格式如下：
 * 数字xxx的情况如下：
 * 个位数：
 * 十位数：
 * 百位数：
 */
public class T_01Test1 {
    public static void main(String[] args) {
        int i=123;
        System.out.println("数字"+i+"的情况如下：");
        System.out.println("百位数："+(i/100));
        System.out.println("十位数："+(i/10)%10);
        System.out.println("个位数："+(i%10));
    }
}
