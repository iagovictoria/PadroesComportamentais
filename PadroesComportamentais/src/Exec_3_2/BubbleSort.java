package Exec_3_2;

/**
 * BubbleSort.
 * 
 * @author http://www.cs.dartmouth.edu/~farid/teaching/cs15/cs5/lectures/0519/BubbleSort.java
 */
public class BubbleSort extends Sort{
	private double[] a;
	private int n;
	
	public BubbleSort(double[]a, int n) {
		this.a = a;
		this.n = n;
	}
	
	public void sort()
	// Precondition: a is array to be sorted of length n
	// Postcondition: The list a[0], a[1], ..., a[n-1] is sorted in increasing order.
	// This version sorts using bubble sort.
	{
		int n = this.n;
		double[]a = this.a;
		
		for (int i = n - 1; i > 0; i--) {
			// The next two lines are just for demonstration purposes.
			// Remove them in a real bubble sort implementation.
			// System.out.println("Before iteration for i = " + i + ":");
			// IntIO.writeInts(a, n);

			// Bubble the largest element to the end of a[0], ..., a[i].

			for (int j = 0; j < i; j++)
				if (a[j] > a[j + 1]) {
					double temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		}
	}

}