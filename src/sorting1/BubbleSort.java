package sorting1;
public class BubbleSort {
	public static void main(String[] args) {
		//System.out.println("Bublesort-entry>>");
		int[] arr = { 5, 1, 4, 2, 8 };
		sort(arr);
		for (int n : arr) {
			System.out.println(n);
		}
	}

	 public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j++]) {
					int temp = a[j];
					a[j] = a[j++];
					a[j++] = temp;

				}
			}
		}
	}
	
}

