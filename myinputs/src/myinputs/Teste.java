package myinputs;

public class Teste {

	public static void main(String[] args) {
		int a;
		float f ;
		System.out.println("Introduza uma String:");
		String s = Ler.umaString();
		System.out.println("A String que introduziu foi: "+s);
		System.out.println("Introduza uma valor inteiro:");
		a = Ler.umInt();
		System.out.println("O seu valor inteiro é:\n"+a);
		System.out.println("insere uma valor float");
		f = Ler.umFloat();
		System.out.println("O seu valor float é:\n"+f);

	}

}
