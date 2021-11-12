package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean inOrder = false;
		int trueCount = array.length - 1;
		Random rand = new Random();
		int save = 0;
		int num1 = 0;
		int num2 = 0;
		while (!inOrder) {
			if (!inOrder) {
				num1 = rand.nextInt(array.length);
				num2 = rand.nextInt(array.length);
				save = array[num1];
				array[num1] = array[num2];
				array[num2] = save;
				display.updateDisplay();
			}
			trueCount = array.length-1;
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j + 1]) {
					inOrder = false;
					break;
				} else {
					trueCount--;
				}

			}
			if (trueCount == 0) {
				inOrder = true;
			}

		}
	}
}
