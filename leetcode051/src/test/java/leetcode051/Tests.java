package leetcode051;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Tests {
	private boolean compareArraysOfArrays(List<List<String>> a, List<List<String>> b) {
		for (int i=0; i<a.size(); i++) {
			for (int j=0; j<a.get(i).size(); j++) {
				if (!a.get(i).get(j).equals(b.get(i).get(j)))
					return false;
			}
		}
		return true;
	}
	
	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();
		List<List<String>> expected = Arrays.asList(				
				Arrays.asList(".Q..","...Q","Q...","..Q."),
				Arrays.asList("..Q.","Q...","...Q",".Q..")
		);
		
		List<List<String>> testOutput = solution.solveNQueens(4);
		assertTrue(compareArraysOfArrays(testOutput, expected),  "Expected 2 Solutions");
	}
	
	@Test
	public void basicTestCase2() {
		Solution solution = new Solution();
		List<List<String>> expected = Arrays.asList(				
				Arrays.asList("Q")
		);
		
		List<List<String>> testOutput = solution.solveNQueens(1);
		assertTrue(compareArraysOfArrays(testOutput, expected),  "Expected 1 Solution");
	}
}
