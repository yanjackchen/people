package Client;

import POJO.Finery;
import POJO.NewFinery;

/**
 * @author chen
 * @date 2019/12/2 22:01
 * @Email chenyjgogo@aliyun.com
 */
public class Client {
    public static void main(String[] args) {
            Finery p1 = new Finery("小强");
            System.out.println("第一种装扮: ");
            p1.WearBigTrouser();
            p1.WearTShirt();
            p1.WearSneakers();
            p1.show();
            System.out.println("第二种装扮: ");
            p1.WearSuit();
            p1.WearTie();
            p1.WearLeatherShoes();
            p1.show();
            System.out.println("第三种装扮: ");
            //编译期实例化
            NewFinery p2 = new NewFinery("小强");
            p2.WearAutumnPants();
            p2.WearStockings();
            p2.WearSweater();
            p2.show();
    }
}
