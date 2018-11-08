package Exec_3_1;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ContextSemana cs = new ContextSemana();
		Semana seg = new Segunda();
		Semana ter = new Terça();
		Semana qua = new Quarta();
		Semana qui = new Quinta();
		Semana sex = new Sexta();
		Semana sab = new Sabado();
		Semana dom = new Domingo();
		
		seg.dia();
		ter.dia();
		qua.dia();
		qui.dia();
		sex.dia();
		sab.dia();
		dom.dia();

	}

}
