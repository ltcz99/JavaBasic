package day02;

public class T_05StringTest1 {
    public static void main(String[] args) {
        //练习1：
        char c='a';//anscll :97 ，A:65
        int num=10;
        String str="hello";
        System.out.println(c+num+str);//107hello
        System.out.println(c+str+num);//ahello10
        System.out.println(c+(str+num));//ahello10
        System.out.println((c+num)+str);//107hello
        System.out.println(str+num+c);//hello10a
        //练习2：
        //控制台输出：* *
        System.out.println("* *");
        System.out.println('*'+'\t'+'*');
        System.out.println('*'+"\t"+'*');
        String s6=str+4;
        System.out.println(s6);
    }
}
