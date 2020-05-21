/**
 * 编程实现斗地主游戏
 * @author: 陈杨
 */

package homework3;

import java.util.*;

public class CardGame {

    // 自定义比较器
    Comparator<Card> comparator = new Comparator<Card>() {
        @Override
        public int compare(Card o1, Card o2) {
            String colororder = "大王,小王,spade,heart,club,diamond";
            int c1 = colororder.indexOf(o1.getColor());
            int c2 = colororder.indexOf(o2.getColor());
            int index1 = o1.getIndex();
            int index2 = o2.getIndex();
            if (index1 == index2) {
                if (c1 > c2) return 1;
                if (c1 < c2) return -1;
                else return 0;
            } else if (index1 < index2) {
                return  -1;
            } else if (index1 > index2) {
                return 1;
            }
            return 0;
        }
    };

    // 自定义成员变量
    private ArrayList<Card> Deck = new ArrayList<>(54); // 存储整幅牌
    private Set<Card> player1 = new TreeSet<>(comparator); // 玩家一的手牌
    private Set<Card> player2 = new TreeSet<>(comparator); // 玩家二的手牌
    private Set<Card> player3 = new TreeSet<>(comparator); // 玩家三的手牌
    private ArrayList<Card> reminder = new ArrayList<>(3); // 底牌
    private String[] colors = {"spade", "heart", "club", "diamond"};
    private String[] values = {"Joker", "joker", "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};


    public void play() {

        // 实现游戏发牌的过程
        // 实现牌堆生成的过程
        System.out.println("游戏开始！");
        Deck.add(new Card("大王", "Joker", 0));
        Deck.add(new Card("小王", "joker", 1));
        for (String color : colors) {
            for (int i = 2; i < values.length; i++) {
                Deck.add(new Card(color, values[i], i));
            }
        }

        // 洗牌
        Collections.shuffle(Deck);

        // 每个玩家摸牌
        System.out.println("玩家摸牌中...");
        int size = Deck.size();
        for (int i = size - 1; i > 2; i--) {
            if (0 == i % 3) {
                player1.add(Deck.get(i));
                Deck.remove(i);
            } else if (1 == i % 3) {
                player2.add(Deck.get(i));
                Deck.remove(i);
            } else {
                player3.add(Deck.get(i));
                Deck.remove(i);
            }
        }

        // 剩下的牌就是底牌，其实就是前面三张
        reminder = Deck;
        System.out.println("摸牌结束！");
    }

    public void show() {
        System.out.println("明牌");
        System.out.println(player1.size());
        System.out.println(player2.size());
        System.out.println(player3.size());
        System.out.println("一号玩家的手牌是：" + player1.toString());
        System.out.println("二号玩家的手牌是：" + player2.toString());
        System.out.println("三号玩家的手牌是：" + player3.toString());
        System.out.println("底牌是：" + reminder.toString());
    }

}


