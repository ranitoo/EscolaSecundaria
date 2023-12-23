import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import myinputs.Ler;

	public class Professor extends Pessoa implements Serializable{
		private static int ultimoId = 0;
		private int id;
		private List<Especialidade> especialidades; 
		private float salario; 
		private int numturmas;
		private int nif;
		private String email;
		
		
		public Professor(Pessoa p, List<Especialidade> especialidades, float salario, int numturmas, int nif, String email) {
			super(p.getNome(), p.getApelido(), p.getNumescolar(), p.getNascimento(), p.getCargo());
			this.id = ultimoId + 1;
			ultimoId++;
			this.especialidades = especialidades;
			this.salario = salario;
			this.numturmas = numturmas;
			this.nif = nif;
			this.email = email;
		}
		
	    public static int getUltimo() {
	        return ultimoId;
	    }

	    public static void setUltimo(int i) {
	        ultimoId = i;
	    }
		
	    public int getId() {
	        return id;
	    }
	    
		public List<Especialidade> getEspecialidades() {
			return especialidades;
		}
		
		public void setDisciplina(List<Especialidade> especialidade) {
			this.especialidades = especialidades;
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
			Pessoa p = Pessoa.novaPessoa();
		
		List<Especialidade> especialidades = new ArrayList<>();
        int opcao;
        do {
            System.out.println("Escolha a especialidade que leciona:");
            List<Especialidade> especialidade = Especialidade.getEspecialidades();
            especialidades.add(especialidade);

            System.out.println("Deseja adicionar mais uma especialidade? (1 - Sim / 2 - Não)");
            opcao = Ler.umInt();
        } while (opcao == 1);
			
			System.out.println("Insira o salário do professor: ");
			float salario = Ler.umFloat();
			System.out.println("Insira o número de turmas que o professor leciona: ");
			int numturmas = Ler.umInt();
			System.out.println("Insira o NIF do professor: ");
			int nif = Ler.umInt();
			System.out.println("Insira o email do professor: ");
			String email = Ler.umaString();
			
			return new Professor(p, especialidades, salario, numturmas, nif, email);
		}
		
		public String tostring(){
			return super.toString() + String.format("Disciplinas que leciona: [%s]:, salario %f:, numturmas %d:, NIF: %d:, Email: %s ", especialidades, salario, numturmas, nif, email); 
			
		}
	}
