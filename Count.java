/**
 *  编程实现统计字符串的功能
 * @author: 陈杨
 */

package homework3;

import java.util.Arrays;

public class Count {

    public static void main(String[] args) {

        // 生成相应的String，可以根据ASCII码来进行统计
        String test = "ABCD123!@#$%ab";

        // 使用一个数组来进行统计各个类别：index 0 = 数字，index 1 = 大写字母， 2 = 小写字母，3 = 其他符号
        int[] count = new int[4];

        // 遍历字符串进行统计
        for (int i = 0; i < test.length(); i++) {
            int code = (int)test.charAt(i);
            if (48 <= code && code <= 57) { // 统计数字
                count[0]++;
            } else if (65 <= code && code <= 90) { // 统计大写
                count[1]++;
            } else if (97 <= code && code <= 122) { // 统计小写
                count[2]++;
            } else { // 统计其他
                count[3]++;
            }
        }

        // 打印最终统计的结果
        System.out.println("统计的结果是：" + Arrays.toString(count));
    }
}
