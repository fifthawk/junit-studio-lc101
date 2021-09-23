package test;

import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void shouldReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("g]]"));
    }

    @Test
    public void returnTrueIfDoubleBracketsClosed(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[g]]"));
    }

    @Test
    public void returnTrueIfTripleBracketsClosed(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[g]]]"));
    }

    @Test
    public void returnFalseForUnbalancedPairs(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[g]"));
    }

    @Test
    public void returnTrueForBracketsOutOfOrderButStillPaired(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][[g]]"));
    }

    @Test
    public void returnFalseForNull(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void returnTrueForVeryLongTest(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]this is a really long string with spaces[[]][[[[]]]]hahahahahahahah[][][[]]"));
    }
}





