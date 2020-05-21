/**
 * 编程实现牌类型
 * @author: 陈杨
 */

package homework3;

public class Card {

    private String color;
    private String value;
    private int index;

    public Card() {
    }

    public Card(String color, String value, int index) {
        this.color = color;
        this.value = value;
        this.index = index;
    }

    public String getColor() {
        return color;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color='" + color + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
