/*
案例分析
准备牌： 用集合把54张牌都准备好
牌面  牌里都要搞好
嵌套遍历
发牌： 用索引%人数 来发牌，
看牌：直接打印输出。



*/
package doudizhu;
import java.util.*;


public class FightLandlord {
    public static void main(String[] args) {


        ArrayList<String> poker = new ArrayList<>();
        //数组的英语单词最好是复数。
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        poker.add("大王");
        poker.add("小王");
        // for(String number : numbers){
        //   System.out.print(numbers);
        // }
        for (String number : numbers) {
            for (String color : colors) {
                System.out.println(color + number);
                //把组装好的牌存储到poker集合中
                poker.add(color + number);
            }
        }
        //准备好牌后就要洗牌，洗牌要调用Collections中的shuttle方法；
        Collections.shuffle(poker);
        System.out.print(poker);
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> underPai = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            String pai = poker.get(i);
            if (i % 3 == 0) {
                play01.add(pai);
            }
            if (i % 3 == 1) {
                play02.add(pai);
            }
            if (i % 3 == 2) {
                play03.add(pai);
            }
            if (i >= 51) {
                underPai.add(pai);
            }
        }
        //明牌

        System.out.println("");
            System.out.println("刘德华"+play01);


            System.out.println("刘上荣"+play02);

            System.out.println("刘备"+play03);

            System.out.println("底牌"+underPai);
        }

    }


