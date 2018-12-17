package MondayExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExoLundi {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"MondayExample/lundi.xml"});

        FirstC firstC = (FirstC) context.getBean("firstConstructor");

        System.out.println(firstC.getSecondS());
        System.out.println(firstC.getSecondS().getThirdD());



        SecondS secondS = (SecondS) context.getBean("secondService");
        ThirdD thirdD = (ThirdD) context.getBean("thirdDao");

        firstC.setSecondS(secondS);
        secondS.setThirdD(thirdD);

        System.out.println(firstC.getSecondS());
        System.out.println(firstC.getSecondS().getThirdD());
    }
}
