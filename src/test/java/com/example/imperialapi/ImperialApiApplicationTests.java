package com.example.imperialapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImperialApiApplicationTests {





    @Test
    void mTest(){
        double a = 2;
        double expected = 1.8288;

        double result = m(a);

        assertEquals(expected,result);
    }

}
