import java.util.Scanner;
import java.util.Scanner;
import java.net.*;
import java.io.*;

public class ticket {

    static int count = 0;
    static int number = 0, money = 0, price = 0;//count票数,price票价，number总价值,money输入金额


    public static void price() {
        System.out.println("输入设定票价");
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();           //修改票价
    }

    public static void pay() {

        System.out.println("输入缴纳金额");
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        if (money > 0) {
            ++count;                    //购买票数量
            number = number + money;
            System.out.println("购票成功！");//输入购票金额并统计
        } else
            System.out.println("输入错误");
    }


    public static void totalincome() {
        System.out.println("总收入为 " + number);      //输出总金额
        if (number == count * price)                    //判断总金额是否等于票数*票价
            System.out.println("正好等于应收金额");
        else if (number > count * price)
            System.out.println("投多了");
        else
            System.out.println("投少了");
    }
    public static void main() {

        System.out.println("请输入操作（1-购票；2-查询总收入；3-设置票价；4-退出");
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        switch (i) {                    //////可以快捷切换switch和if；idea牛逼！！！！
            case 1:
                ticket ticket = new ticket();//创建对象
                ticket.pay();//调用pay函数购买票

                break;
            case 2:
                ticket ticket2 = new ticket();
                ticket2.totalincome();//调用totalincome统计收入


                break;
            case 3:
                ticket ticket3 = new ticket();
                ticket3.price();//调用price修改票价

                break;
            case 4:
                //什么都不做

                break;
        }


    }

}
