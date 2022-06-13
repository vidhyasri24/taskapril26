package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySorter {
	int[] temp;
	DataStorage oDataStorage = new DataStorage();
	Scanner scan = new Scanner(System.in);

	void getTheArrayElements() {

		System.out.println("Enter the length of the array");
		oDataStorage.setLengthOfTheArray(scan.nextInt());

		System.out.println("Enter the elements of unsorted Array");

		int[] temp = new int[oDataStorage.getLengthOfTheArray()];
		try {
		for (int index = 0; index < temp.length; index++) {

		temp[index] = scan.nextInt();
		System.out.println("unsorted array:"+temp[index]);

		}
		

		} catch (InputMismatchException e) {
		System.err.println("Enter the integer Input");
		System.exit(0);
		}

		oDataStorage.setUnsortedArray(temp);
		scan.close();
		}

	void sortTheArrayInAscendingOrder() {

		temp = oDataStorage.getUnsortedArray();
		for (int i = 0; i < temp.length; i++) {

			int tempvalue;
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] > temp[j]) {
					tempvalue = temp[i];
					temp[i] = temp[j];
					temp[j] = tempvalue;
				}

			}
		}
		oDataStorage.setArraySortedInAscendingOrder(temp);
	}

	void displayTheArraySortedInAscendingOrder() {

		System.out.print("Sorted array AscendingOrder  : ");
		temp = oDataStorage.getArraySortedInAscendingOrder();
		for (int charIndex = 0; charIndex < temp.length; charIndex++) {

			System.out.print(temp[charIndex] + " ");
		}

	}

	void sortTheArrayInDescendingOrder() {

		temp = oDataStorage.getUnsortedArray();
		for (int i = 0; i < temp.length; i++) {

			int tempValue;
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] < temp[j]) {
					tempValue = temp[i];
					temp[i] = temp[j];
					temp[j] = tempValue;
				}

			}
		}
		oDataStorage.setArraySortedInDescendingOrder(temp);
	}

	void displayTheArraySortedInDescendingOrder() {
		System.out.println();
		System.out.print("Sorted array DescendingOrder  : ");
		temp = oDataStorage.getArraySortedInDescendingOrder();
		for (int charIndex = 0; charIndex < temp.length; charIndex++) {

			System.out.print(temp[charIndex] + " ");
		}
	}
}