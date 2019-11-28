package day03;

public class T_05OperatorTest {
    public static void main(String[] args) {
        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num4 = " + num4);

        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            z++;
        }
        if ((x = false) || (++z == 43)) {
            z++;
        }
        System.out.println("z = " + z);
    }

}
