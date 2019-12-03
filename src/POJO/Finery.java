package POJO;

/**
 * @author chen
 * @date 2019/11/28 19:35
 * @Email chenyjgogo@aliyun.com
 */

public class Finery {
    private String name;
    public Finery(String name)
    {
        this.name = name;
    }
    public void WearTShirt(){
        System.out.print("大T桖  ");
    }
    public void WearBigTrouser(){
        System.out.print("垮裤  ");
    }
    public void WearSneakers(){
        System.out.print("破球鞋  ");
    }
    public void WearSuit(){
        System.out.print("西装  ");
    }
    public void WearTie(){
        System.out.print("领带  ");
    }
    public void WearLeatherShoes(){
        System.out.print("皮鞋  ");
    }
    public void show(){
        System.out.println("装扮的"+name);
    }
}
