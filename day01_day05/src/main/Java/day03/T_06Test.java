package day03;

public class T_06Test {
    public static void main(String[] args) {
        int x = 1;
        int y=1;
        if(x++==2 & ++y==2){  //后++，x=1与2判断
            x =7;
        }
        System.out.println("x="+x+",y="+y); //x=2,y=2;
        if(x++==2 && ++y==2){
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=3,y=3;
        if(x++==1 | ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=4,y=4
        if(x++==4 || ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=7,y=4
    }
}
