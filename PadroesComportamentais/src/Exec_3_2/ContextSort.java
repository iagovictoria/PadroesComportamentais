package Exec_3_2;

public class ContextSort {
	
	public ContextSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void imprimeBubble(BubbleSort bub, double[] vet, int n) {
		bub.sort(vet, n);
	}
	
	public void imprimeInsertion(InsertionSort is, double[] vet) {
		is.sort(vet);
	}
	
	public void imprimeQuick(QuickSort qs, double[] vet) {
		qs.sort(vet);
	}

}
