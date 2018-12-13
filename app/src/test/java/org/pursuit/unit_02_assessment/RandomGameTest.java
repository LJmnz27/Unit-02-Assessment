package org.pursuit.unit_02_assessment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RandomGameTest {
    private RandomGame randomGame;

    //Set up before
    @Before
    public void setUp() {
        randomGame = new RandomGame();
    }

    //Test for random number
    @Test
    public void test_get_random_number_method() {

        double resultRandom = randomGame.getRandomNumber();
        //Do not understand Junit testing
    }
    @Test
    public void test_check_guess_method() {

    }

    @Test
    public void test_get_string_result(){

    }
    @Test
    public void test_string_to_int(){

    }

        // TODO: Initialize any test variables with object values in a "setUp()" method that runs before any of the unit tests.

        // TODO: Create a test method called "test_get_random_number_method()". Add logic to confirm that the number returned from the getRandomNumber() method is between 1 and 100, including both 1 and 100.

        // TODO: Create a test method called "test_check_guess_method()". Add logic to confirm that the boolean value returned is true if the numbers passed to the checkGuess() method are equal, and false if they are not equal.

        // TODO: Create a test method called "test_get_string_result()". Add logic to confirm that the String value returned from the getStringResult() method matches expected output based on what boolean value is passed to the parameter.

        // TODO: Create a test method called "test_string_to_int()". Add logic to confirm that the method stringToInt() returns a valid integer value based on the String input provided.

}