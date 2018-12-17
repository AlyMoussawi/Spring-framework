package MondayExample.JUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("secondS3")
@Scope("singleton")
public class SecondS3 {

    @Autowired
    private ThirdD3 thirdD3;

    public void setThirdD1(ThirdD3 thirdD1) {
        this.thirdD3 = thirdD3;
    }

    public ThirdD3 getThirdD3(){
        return thirdD3;
    }
}
