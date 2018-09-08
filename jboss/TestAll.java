package jboss;

import org.junit.Test;

public class TestAll {

    @Test
    public void test1(){

       System.out.println( HttpGet.get("www.baidu.com"));;
    }
}
