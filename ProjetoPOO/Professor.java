import myinputs.Ler;
import java.time.LocalDateTime;

public class Professor extends Pessoa {
	private String disciplina; //mudar para array
	private float salario; 
	private int numturmas;
	private int NIF;
	
	public Professor(String nome, String apelido, int numescolar,LocalDateTime nascimento, String cargo, String Disciplina, float salario, int numturmas, int NIF) {
		super(nome, apelido, numescolar, nascimento, cargo);
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina=disciplina;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario=salario;
	}
	
	public int getNumturmas() {
		return numturmas;
	}
	
	public void setNumturmas(int numturmas) {
		this.numturmas=numturmas;
	}
	
	public int getNif() {
		return NIF;
	}
	
	public void setNif(int NIF) {
		this.NIF=NIF;
	}
	
	
	public static Professor novoProfessor() {
		Pessoa pessoa = novaPessoa();
		
		System.out.println("Insira a disciplina que leciona: ");
		String disciplina = Ler.umaString();
		System.out.println("Insira o salário do professor: ");
		float salario = Ler.umFloat();
		System.out.println("Insira o número de turmas que o professor leciona: ");
		int numturmas = Ler.umInt();
		System.out.println("Insira o NIF do professor: ");
		int NIF = Ler.umInt();
		
		return new Professor(pessoa.getNome(), pessoa.getApelido(), pessoa.getNumescolar(), pessoa.getNascimento(), pessoa.getCargo(), disciplina, salario, numturmas, NIF);
	}
	
	public String tostring(){
		return super.toString() + String.format("Disciplina %s:, salario %f:, numturmas %d:, NIF: %d: ", disciplina, salario, numturmas, NIF); 
		
	}
} 
