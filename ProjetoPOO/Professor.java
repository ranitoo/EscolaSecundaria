import myinputs.Ler;
import java.time.LocalDateTime;

	public class Professor extends Pessoa {
		private Disciplina disciplina; //mudar para array
		private float salario; 
		private int numturmas;
		private int nif;
		private String email;
		
		public Professor(String nome, String apelido, int numescolar,LocalDateTime nascimento, String cargo, String Disciplina, float salario, int numturmas, int nif, String email) {
			super(nome, apelido, numescolar, nascimento, cargo);
			this.disciplina = disciplina;
			this.salario = salario;
			this.numturmas = numturmas;
			this.nif = nif;
			this.email = email;
		}
		
		public Disciplina getDisciplina() {
			return disciplina;
		}
		
		public void setDisciplina(Disciplina disciplina) {
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
			return nif;
		}
		
		public void setNif(int nif) {
			this.nif=nif;
		}

		public String getEmail(){
			return email;
		}

		public void setEmail(String email){
			this.email=email;
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
			int nif = Ler.umInt();
			System.out.println("Insira o email do professor: ");
			String email = Ler.umaString();
			
			return new Professor(pessoa.getNome(), pessoa.getApelido(), pessoa.getNumescolar(), pessoa.getNascimento(), pessoa.getCargo(), disciplina, salario, numturmas, nif, email);
		}
		
		public String tostring(){
			return super.toString() + String.format("Disciplina %s:, salario %f:, numturmas %d:, NIF: %d:, Email: %s ", disciplina, salario, numturmas, nif, email); 
			
		}
