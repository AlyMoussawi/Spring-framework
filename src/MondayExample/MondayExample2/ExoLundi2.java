package MondayExample.MondayExample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExoLundi2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"MondayExample/MondayExample2/lundi.xml"});

        FirstC2 firstC2 = (FirstC2) context.getBean("firstC2");

        System.out.println(firstC2.getSecondS2());
        System.out.println(firstC2.getSecondS2().getThirdD2());

    }
}
