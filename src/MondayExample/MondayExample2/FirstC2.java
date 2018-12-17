package MondayExample.MondayExample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller ("firstC2")
@Scope("singleton")
public class FirstC2 {

    @Autowired
    private SecondS2 secondS2;

    public void setSecondS2(SecondS2 secondS2) {
        this.secondS2 = secondS2;
    }

    public SecondS2 getSecondS2(){
        return secondS2;
    }
}
