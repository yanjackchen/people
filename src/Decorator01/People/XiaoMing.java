package Decorator01.People;



/**
 * @author chen
 * @date 2019/12/2 22:40
 * @Email chenyjgogo@aliyun.com
 */
public class XiaoMing implements People {
    private String name;
    public XiaoMing(String name){
        this.name = name;
    }
    @Override
    public void WearClothing() {
        System.out.println(name+"开始穿衣服");
        System.out.println("T桖");
        System.out.println("长裤");
        System.out.println("球鞋");
    }
}
