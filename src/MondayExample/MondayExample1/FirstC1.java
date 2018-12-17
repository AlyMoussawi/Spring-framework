package MondayExample.MondayExample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller ("firstC1")
@Scope("singleton")
public class FirstC1 {

    @Autowired
    private SecondS1 secondS1;

    public void setSecondS1(SecondS1 secondS1) {
        this.secondS1 = secondS1;
    }

    public SecondS1 getSecondS1(){
        return secondS1;
    }
}
