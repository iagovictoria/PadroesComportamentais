package Exec_3_2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double[] vet = {8,5,7,4,6,1,};
		double[] vet2 = {8,18,12,11,17,14,15,10,13};
		double[] vet3 = {8,5,7,4,6,1,2,9,3,18,12,11,17,14,15,19,15,10,0,13};
		ContextSort cs = new ContextSort();
		Sort bs = new BubbleSort(vet, 6);
		Sort is = new InsertionSort(vet2);
		Sort qs = new QuickSort(vet3);
		
		
		cs.ordenar(bs);
		for(int cont = 0; cont < vet.length; cont++ ) {
			System.out.println(vet[cont]);
		}
		
		System.out.println("-------------------------");
		
		cs.ordenar(is);
		for(int cont = 0; cont < vet2.length; cont++ ) {
			System.out.println(vet2[cont]);
		}
		System.out.println("-------------------------");
		cs.ordenar(qs);
		for(int cont = 0; cont < vet3.length; cont++ ) {
			System.out.println(vet3[cont]);
		}
		System.out.println("-------------------------");
	}

}
