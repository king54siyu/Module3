/**
 *  编程实现相同字符串的比较
 *  @author: 陈杨
 */
package homework3;

import java.util.Scanner;

public class Same {

    // 自定义方法去比较两个字符串
    private static String same(String str1, String str2) {

        // 比较两个字符串的长度
        String s = str1.length() > str2.length() ? str2 : str1;
        String l = s.equals(str1) ? str2 : str1;

        // 遍历进行比较
        for (int i = 0; i < s.length(); i++) {
            String test = s.substring(i);
            if (l.contains(test)) {
                return test;
            }
        }
        return "两者之间没有相同的部分";
    }

    public static void main(String[] args) {

        // 测试
        System.out.println("请输入两个字符串并且用空格隔开：");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String res = same(str1, str2);
        System.out.println("最终的结果是：" + res);
    }
}
