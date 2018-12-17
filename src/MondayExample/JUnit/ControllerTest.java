package MondayExample.JUnit;


import MondayExample.JUnit.FirstC3;
import MondayExample.JUnit.SecondS3;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/MondayExample/JUnit/lundiTest.xml"})
public class ControllerTest {

    @Autowired
    private FirstC3 firstC3;

    @Autowired
    private SecondS3 secondS3Dummy;

    @Test
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
        Assert.assertNotNull(firstC3);
    }

//    @Test
//    public void test03(){
//        Assert.assertNotNull(firstC3);
//        firstC3.getSecondS3(secondS3Dummy);
//        try{
//            Assert.assertTrue(false);
//        }catch ()
//    }


}
