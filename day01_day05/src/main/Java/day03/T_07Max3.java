package day03;

public class T_07Max3 {
    public static void main(String[] args) {
        int a=8,b=9,c=6;
        if((a>b)&&(a>c)){
            System.out.println("最大值为："+a);
        }else if((b>c)&&(b>a)){
            System.out.println("最大值为："+b);
        }else {
            System.out.println("最大值为："+c);
        }
    }
}
