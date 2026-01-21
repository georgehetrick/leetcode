package leetcode051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<String>> solveNQueens(int n) {

		List<List<String>> solutions = new ArrayList<List<String>>();

		List<int[]> integerSolutions = placeNextQueen(new int[0], n);

		// We know n is less than 9, so
		//
		String template = "........Q........";

		// Convert to strings
		//
		if (false) {
			// Streams look elegant, but, at least in this case, are slower
			//
			solutions = integerSolutions.parallelStream()
					.map(integerSolution -> Arrays.stream(integerSolution).boxed().parallel()
						.map(column -> template.substring(8 - column, 8 - column + n))
						.toList())
					.toList();
		} else {
			for (int[] integerSolution : integerSolutions) {
				List<String> rowList = new ArrayList<String>(integerSolution.length);
				for (int column : integerSolution) {
					rowList.add(template.substring(8 - column, 8 - column + n));
				}
				solutions.add(rowList);
			}
		}

		return solutions;
	}

	/*
	 * Given the currently placed queens, place the next queen not in check
	 */
	private static List<int[]> placeNextQueen(int[] rows, int n) {
		List<int[]> childSolutions = new ArrayList<int[]>();

		// Place the next queen
		//
		int[] next = Arrays.copyOf(rows, rows.length + 1);
		int size = rows.length;
		for (int i = 0; i < n; i++) {
			if (isNotInCheck(rows, i)) {
				next[size] = i;
				// If we are the last column, add a solution,
				// otherwise call recursive
				//
				if (next.length == n) {
					childSolutions.add(next);
				} else {
					List<int[]> nextSolutions = placeNextQueen(next, n);
					childSolutions.addAll(nextSolutions);
				}
			}
		}
		return childSolutions;
	}

	private static boolean isNotInCheck(int[] rows, int column) {
		if (rows.length == 0)
			return true;
		for (int previous = 0; previous < rows.length; previous++) {
			if (rows[previous] == column)
				return false;
			int offset = rows.length - previous;
			if (offset == Math.abs(column - rows[previous]))
				return false;
		}
		return true;
	}
}
