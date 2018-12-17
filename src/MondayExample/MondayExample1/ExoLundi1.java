package MondayExample.MondayExample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExoLundi1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"MondayExample/MondayExample1/lundi.xml"});

        FirstC1 firstC1 = (FirstC1) context.getBean("firstC1");

        System.out.println(firstC1.getSecondS1());
        System.out.println(firstC1.getSecondS1().getThirdD1());

    }
}
