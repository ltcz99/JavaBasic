package day04;

public class T_04RandomTest {
    public static void main(String[] args) {
        //练习：如何随机获取一个随机数：10,99
        int value=(int)(Math.random()*90+10);
        //公式：【a,b】:(int)Math.random()*(b-a+1)+a)
        System.out.println(value);
    }

}
