package MondayExample.MondayExample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("secondS2")
@Scope("singleton")
public class SecondS2 {

    @Autowired
    private ThirdD2 thirdD2;

    public void setThirdD1(ThirdD2 thirdD1) {
        this.thirdD2 = thirdD2;
    }

    public ThirdD2 getThirdD2(){
        return thirdD2;
    }
}
