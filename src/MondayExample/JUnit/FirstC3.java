package MondayExample.JUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller ("firstC3")
@Scope("singleton")
public class FirstC3 {

    @Autowired
    private SecondS3 secondS3;

    public void setSecondS3(SecondS3 secondS3) {
        this.secondS3 = secondS3;
    }

    public SecondS3 getSecondS3(){
        return secondS3;
    }
}
