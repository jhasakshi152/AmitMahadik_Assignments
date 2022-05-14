package com.Question1;

import java.util.Arrays;

public class MinMaxFinder {
	
	public int[] findMinMax(int[] arr) {
		int[] minMax= new int[2];
		Arrays.sort(arr);
		minMax[0]=arr[0];
		minMax[1]=arr[(arr.length)-1];
		return minMax;
	}
}
