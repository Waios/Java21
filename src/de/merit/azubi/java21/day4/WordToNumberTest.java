package de.merit.azubi.java21.day4;

import static org.junit.jupiter.api.Assertions.*;

class WordToNumberTest {

    @org.junit.jupiter.api.Test
    void initTest() {


        WordToNumber word = new WordToNumber();
        assertNotNull(word);

        long result= word.transform("one");
        assertEquals(1L, result);
    }

    @org.junit.jupiter.api.Test
    void nullBisZehnTest() {
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        WordToNumber word = new WordToNumber();

        for(int x =0; x < numbers.length; x++ ){
            long result= word.transform(numbers[x]);
            assertEquals(x+1,result);
        }



    }

    @org.junit.jupiter.api.Test
    void falscherParameterTest() {

        WordToNumber word = new WordToNumber();


            long result= word.transform("Otto");
            assertEquals(0,result);




    }


}