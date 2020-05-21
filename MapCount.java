/**
 *  编程实现数字字符串出现的次数
 *  @author: 陈杨
 */

package homework3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCount {

    // 自定以方法使用HashMap统计相应数字字符串出现的次数，并返回结果
    private static HashMap<String, Integer> mapcount(String str) {

        // 对String进行相应的处理
        String[] strs = str.split(",");

        // 准备一个map container
        HashMap<String, Integer> map = new HashMap<>();

        // 遍历strs进行统计
        for (int i = 0; i < strs.length; i++) {
            if (!map.containsKey(strs[i])) {
                map.put(strs[i], 1);
            } else {
                map.put(strs[i], map.get(strs[i])+1);
            }
        }

        return map;
    }

    public static void main(String[] args) {

        // 测试
        System.out.println("请输入一个数字字符串，数字之间用逗号隔开：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<String, Integer> res = mapcount(str);
        System.out.println("最后的结果是：" + res.toString());
    }
}
