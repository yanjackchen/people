package AbstractPeople;

/**
 * @author chen
 * @date 2019/12/2 22:10
 * @Email chenyjgogo@aliyun.com
 */
public class People {
    private String name;
    public People(String name){
        this.name  = name;
    }
    public void show(){
        System.out.println("装扮的"+name);
    }
}
