package MondayExample.MondayExample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("secondS1")
@Scope("singleton")
public class SecondS1 {

    @Autowired
    private ThirdD1 thirdD1;

    public void setThirdD1(ThirdD1 thirdD1) {
        this.thirdD1 = thirdD1;
    }

    public ThirdD1 getThirdD1(){
        return thirdD1;
    }
}
