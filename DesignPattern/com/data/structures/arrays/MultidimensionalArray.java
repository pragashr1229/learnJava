package com.data.structures.arrays;

import java.util.Arrays;

class MultidimensionalArray {
	public static void main(String[] args) {

		// create a 2d array
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 }, };

		// calculate the length of each row
		System.out.println("Length of row 1: " + a[0].length);
		System.out.println("Length of row 2: " + a[1].length);
		System.out.println("Length of row 3: " + a[2].length);

		int[][] b = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7 }, };

		for (int i = 0; i < b.length; ++i) {
			for (int j = 0; j < b[i].length; ++j) {
				System.out.println("2D array elements "+b[i][j]);
			}
		}

		// 3d array is an array of 2d arrays
		// test is a 3d array
		int[][][] test = { { { 1, -2, 3 }, { 2, 3, 4 } }, { { -4, -5, 6, 9 }, { 1 }, { 2, 3 } } };

		// for..each loop to iterate through elements of 3d array
		for (int[][] array2D : test) {
			for (int[] array1D : array2D) {
				for (int item : array1D) {
					System.out.println("3D array elements "+item);
				}
			}
		}
	}
}