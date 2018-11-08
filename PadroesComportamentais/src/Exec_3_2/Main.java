package Exec_3_2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ContextSort cs = new ContextSort();
		Sort bs = new BubbleSort();
		Sort is = new InsertionSort();
		Sort qs = new QuickSort();
		
		double[] vet = {8,5,7,4,6,1,2,9,3,18,12,11,17,14,15,19,15,10,0,13};
		cs.imprimeBubble((BubbleSort) bs, vet, 20);
		
		for(int cont = 0; cont < vet.length; cont++ ) {
			System.out.println(vet[cont]);
		}
		
		double[] vet2 = {8,5,7,4,6,1,2,9,3,18,12,11,17,14,15,19,15,10,0,13};
		cs.imprimeInsertion((InsertionSort) is, vet2);
		
		for(int cont = 0; cont < vet2.length; cont++ ) {
			System.out.println(vet2[cont]);
		}
		
		double[] vet3 = {8,5,7,4,6,1,2,9,3,18,12,11,17,14,15,19,15,10,0,13};
		cs.imprimeQuick((QuickSort) qs, vet3);
		
		for(int cont = 0; cont < vet3.length; cont++ ) {
			System.out.println(vet3[cont]);
		}

	}

}
