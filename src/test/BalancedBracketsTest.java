package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    //Test 1
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test 2
    @Test
    public void emptyBackwardsBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //Test 3
    @Test
    public void oneOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //Test 4
    @Test
    public void oneClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

//Test 5
    @Test
    public void oddNumberOfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]["));
    }
//Test 6
    @Test
    public void unbalancedBracketsReturnFalse() {
    assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
}
//Test 7
    @Test
    public void multipleNestingBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]] [[[[]]]]"));
    }

//Test 8
    @Test
    public void emptyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

//Test 9
    @Test
    public void multipleClosingBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Lau[n]chc[ode]"));
    }

//Test 10
@Test
public void multipleOpenBracketsReturnFalse() {
    assertFalse(BalancedBrackets.hasBalancedBrackets("][Lau]n[chc]ode["));
}

//Test 11
@Test
    public void openBracketsFlankingClosingBracketsReturnFalse() {
    assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
}
//Test 12

    @Test
    public void openBracketsWithinOnePairOfClosedBracketsReturnsTrue() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]]]]][[[[[]"));
}
}