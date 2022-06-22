package com.example.imperialapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImperialApiApplicationTests {





    @Test
    void cmTest(){
        double a = 5;
        double expected = 12.7;

        double result = cm(a);

        assertEquals(expected,result);
    }
  
     @Test
    void mTest(){
        double a = 2;
        double expected = 1.8288;

        double result = m(a);

        assertEquals(expected,result);
    }

}
