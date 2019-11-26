package code_wars.ex01_sum_of_3_and_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author n2god on 26/11/2019
 * @project PrivateProjects
 */
class SolutionTest {
    @Test
    public void test(){
        assertEquals(23, new Solution().solution(10));
    }
}