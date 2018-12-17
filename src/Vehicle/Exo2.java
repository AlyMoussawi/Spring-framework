package Vehicle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Exo2 {
    public static void main(String[] args) {

        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("C:/vide.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Vehicle/car.xml"});
        Car c1 = (Car) context.getBean("weDontCareWhatName");
        Car c2 = (Car) context.getBean("weDontCareWhatName1");
        Car c3 = (Car) context.getBean("weDontCareWhatName2");
        Car blabla = (Car) context.getBean("weDontCareWhatName2");
        Car c4 = (Car) context.getBean("weDontCareWhatName3");


        if (c1 != null) {
            System.out.println("pas null");
        }
        if (c2 != null) {
            System.out.println("ouiiii");
        }
        if (c3 != null) {
            System.out.println("noooo");
        }
        if (c4 != null) {
            System.out.println("maybe");
        }
        if (blabla != null) {
            System.out.println("new instance of the same blabla");
        }

        //c1 = null;

        //if (c1.equals(null)) {
          //  System.out.println("mon bean est null");
//        }
    }
}
