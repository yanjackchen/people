package Client;

import AbstractPeople.*;

/**
 * @author chen
 * @date 2019/12/2 22:05
 * @Email chenyjgogo@aliyun.com
 */
public class Client02 {
    public static void main(String[] args) {
        People p1 = new People("小强");
        AbstractFinery WearAutumnPants = new WearAutumnPants();
        AbstractFinery WearStockings = new WearStockings();
        AbstractFinery WearSweater = new WearSweater();
        p1.show();
        WearAutumnPants.Show();
        WearStockings.Show();
        WearSweater.Show();
        People p2 = new People("小王");
        AbstractFinery wearTshirt = new WearTshirt();
        AbstractFinery wearAutumnPants = new WearAutumnPants();
        AbstractFinery WearSneakers = new WearSneakers();
        p2.show();
        wearTshirt.Show();
        wearAutumnPants.Show();
        WearSneakers.Show();
    }

}


