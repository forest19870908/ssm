import bean.MyFirstBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by ZSL on 2017/8/1.
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        ClassPathResource res = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        MyFirstBean myFirstBean = factory.getBean("myFirstBean", MyFirstBean.class);
        myFirstBean.hello();
    }
    private static  void  method2(){
        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("bean.xml"));
        MyFirstBean myFirstBean = factory.getBean("myFirstBean", MyFirstBean.class);
        myFirstBean.hello();
    }
    private static  void method3(){
        ApplicationContext context=new FileSystemXmlApplicationContext("classpath:bean.xml");
        MyFirstBean myFirstBean = context.getBean("myFirstBean", MyFirstBean.class);
        myFirstBean.hello();
    }
    private static  void method4(){
        ApplicationContext context=new FileSystemXmlApplicationContext("classpath:bean.xml");
        MyFirstBean myFirstBean = context.getBean("myFirstBean", MyFirstBean.class);
        myFirstBean.hello2();
    }
}
