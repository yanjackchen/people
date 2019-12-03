package POJO;

/**
 * @author chen
 * @date 2019/11/30 10:02
 * @Email chenyjgogo@aliyun.com
 */
public class NewFinery extends Finery {

    public NewFinery(String name) {
        super(name);
    }
    public void WearSweater(){
        System.out.print("毛衣  ");
    }
    public void WearAutumnPants(){
        System.out.print("秋裤  ");
    }
    public void WearStockings(){
        System.out.print("长袜  ");
    }

}
