package day04;

import java.util.Scanner;

/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺：
如果：
成绩为100分时，奖励一辆BMW；
成绩为(80，99]时，奖励一台iphone xs max；
当成绩为[60,80]时，奖励一个 iPad；
其它时，什么奖励也没有。
请从键盘输入岳小鹏的期末成绩，并加以判断
 */
public class T_02IfElseTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入岳晓鹏的成绩：");
        int score =scan.nextInt();
        if(score==100){
            System.out.println("奖励一辆宝马");
        }else if(score>80&&score<99){
            System.out.println("奖励iPhone 11");
        }else if(score>=60&&score<=80){
            System.out.println("奖励一个iPad");
        }else{
            System.out.println("啥都没有，努力学习！");
        }
    }
}
