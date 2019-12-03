package Decorator01.Finery;

import Decorator01.People.People;

/**
 * @author chen
 * @date 2019/12/2 22:43
 * @Email chenyjgogo@aliyun.com
 */
public  abstract class Fineries implements People {
    protected People people;
    public Fineries(People people){
        this.people = people;
    }
    public abstract void wearClothing();
}
