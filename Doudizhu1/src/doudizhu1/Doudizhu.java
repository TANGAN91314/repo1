package doudizhu1;

import java.sql.ClientInfoStatus;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Doudizhu {
    private static Object Integer;
    private static Object ArrayList;

    public static void main(String[] args) {
        //准备牌
        HashMap<Integer,String>  poker = new HashMap<>();
        //定义一个ArrayList 来存poker的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> color = List.of("♠","♥","♣","♦");
        List<String> number = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //存大王小王，并把索引导入HashMap\
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //存那52张牌   嵌套遍历
        for(String color1:color){
            for (String num: number){
                poker.put(index,num+color1);
                pokerIndex.add(index);
                index++;
            }
        }
        //洗牌
        Collections.shuffle(pokerIndex);
        //发牌
        ArrayList<Integer> player01 =new ArrayList<>();

        ArrayList<Integer> player02 =new ArrayList<>();

        ArrayList<Integer> player03 =new ArrayList<>();

        ArrayList<Integer> underPai =new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            Integer in = pokerIndex.get(i);
            if(i>=51){
                 underPai.add(in);
            }
            if(i%3==0){
                player01.add(in);
            }
            if (i%3==1){
                player02.add(in);
            }
            if(i%3==2){
                player03.add(in);
            }
        }
        //排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(underPai);
        //看牌
        lookPoker("劉德華",poker,player01);
        lookPoker("周星馳",poker,player02);
        lookPoker("周潤發",poker,player03);
        lookPoker("底牌",poker,underPai);



    }
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.println("name:"+name);
        for (Integer key:list){
            String value = poker.get(key);
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}
