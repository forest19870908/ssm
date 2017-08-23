package bean;

/**
 * Created by ZSL on 2017/8/1.
 */
public class MyFirstBean {
    public  MyFirstBean(){
        System.out.println("MyFirstBean be created");
    }
    private HelloWorldBean helloWorldBean;

    public void setHelloWorldBean(HelloWorldBean helloWorldBean) {
        this.helloWorldBean = helloWorldBean;
    }

    public void hello(){
        System.out.println("MyFirstBean: hello");
    }
    public void hello2(){
        helloWorldBean.hello();
    }
}
