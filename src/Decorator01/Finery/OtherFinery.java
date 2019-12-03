package Decorator01.Finery;

import Decorator01.People.People;

/**
 * @author chen
 * @date 2019/12/2 22:56
 * @Email chenyjgogo@aliyun.com
 */
public class OtherFinery extends Fineries {
    public OtherFinery(People people) {
        super(people);
    }

    @Override
    public void wearClothing() {
        System.out.println("穿秋衣");
        System.out.println("穿秋裤");
        System.out.println("穿长袜");
        System.out.println("穿棉袄");
    }


    @Override
    public void WearClothing() {

    }
}
