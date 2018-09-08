package testall;

import Resquest.Requests;
import org.junit.Test;

public class TestRequest {
    @Test
    public void test1(){
        Requests re=new Requests();
        System.out.println(re.getResponse("http://www.csdn.net"));
    }

    @Test
    public void test2(){
        Requests re=new Requests();
        System.out.println(re.getHttpResponse("http://www.csdn.net"));
    }
}
