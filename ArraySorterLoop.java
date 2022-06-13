package array;


import java.util.Scanner;
public class ArraySorterLoop {
	
		int[] temp;
		DataStorage oDataStorage = new DataStorage();
		Scanner scan = new Scanner(System.in);

		void getTheArrayElements() {

		System.out.println("Enter the length of the array");
		oDataStorage.setLengthOfTheArray(scan.nextInt());


		System.out.println("Enter the elements of unsorted Array");

		int[] temp = new int[oDataStorage.getLengthOfTheArray()];
		
		for (int index = 0; index < temp.length; index++) {

		temp[index] = scan.nextInt();

		}
		oDataStorage.setUnsortedArray(temp);
		scan.close();
		}


		
		void sortTheArrayInAscendingOrder() {

			temp = oDataStorage.getUnsortedArray();
			for (int i = 0; i < temp.length; i++) {

				int tempStore;
				for (int j = i + 1; j < temp.length; j++) {
					if (temp[i] > temp[j]) {
						tempStore = temp[i];
						temp[i] = temp[j];
						temp[j] = tempStore;
					}

				}
			}
			oDataStorage.setArraySortedInAscendingOrder(temp);
		}

		void displayTheArraySortedInAscendingOrder() {

			System.out.print("Sorted array AscendingOrder  : ");
			temp = oDataStorage.getArraySortedInAscendingOrder();
			for (int index = 0; index < temp.length; index++) {

				System.out.print(temp[index] + " ");
			}

		}

		void sortTheArrayInDescendingOrder() {

			temp = oDataStorage.getUnsortedArray();
			for (int i = 0; i < temp.length; i++) {

				int tempStore;
				for (int j = i + 1; j < temp.length; j++) {
					if (temp[i] < temp[j]) {
						tempStore = temp[i];
						temp[i] = temp[j];
						temp[j] = tempStore;
					}

				}
			}
			oDataStorage.setArraySortedInDescendingOrder(temp);
		}

		void displayTheArraySortedInDescendingOrder() {
			System.out.println();
			System.out.print("Sorted array DescendingOrder  : ");
			temp = oDataStorage.getArraySortedInDescendingOrder();
			for (int index = 0; index < temp.length; index++) {

				System.out.print(temp[index] + " ");
			}
		}
	}

