package MondayExample.JUnit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExoLundi3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"MondayExample/MondayExample2/lundi.xml"});

        FirstC3 firstC3 = (FirstC3) context.getBean("firstC3");

        System.out.println(firstC3.getSecondS3());
        System.out.println(firstC3.getSecondS3().getThirdD3());

    }
}
