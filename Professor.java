package Professor;
import Pessoa.Pessoa;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import myinputs.Ler;

	public class Professor extends Pessoa implements Serializable{
		private static int ultimoId = 0;
		private int id;
		private List<Disciplina> disciplinas; 
		private float salario; 
		private int numturmas;
		private int nif;
		private String email;
		
		
		public Professor(Pessoa p, List<Disciplina> disciplinas, float salario, int numturmas, int nif, String email) {
			super(p.getNome(), p.getApelido(), p.getNumescolar(), p.getNascimento());
			this.id = ultimoId + 1;
			ultimoId++;
			this.disciplinas = disciplinas;
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
	    
		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}
		
		public void setDisciplina(List<Disciplina> disciplina) {
			this.disciplinas = disciplinas;
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
		
			 List<Disciplina> disciplinas = new ArrayList<>();
			    int opcao;
			    do {
			        System.out.println("Escolha uma disciplina que leciona:");
			        List<Disciplina> disciplinaList = Disciplina.getDisciplinas();
			        System.out.println("Disciplinas disponíveis:");
			        for (int i = 0; i < disciplinaList.size(); i++) {
			            System.out.println((i + 1) + " - " + disciplinaList.get(i));
			        }
			        opcao = Ler.umInt();
			        
			        if (opcao > 0 && opcao <= disciplinaList.size()) {
			            disciplinas.add(disciplinaList.get(opcao - 1));
			            System.out.println("Disciplina adicionada: " + disciplinaList.get(opcao - 1));
			            
			            System.out.println("Deseja adicionar mais uma disciplina? (1 - Sim / 2 - Não)");
				        opcao = Ler.umInt();
				        
			        } else {
			            System.out.println("Opção inválida.");
			        }

			    } while (opcao == 1);
			
			System.out.println("Insira o salário do professor: ");
			float salario = Ler.umFloat();
			System.out.println("Insira o número de turmas que o professor leciona: ");
			int numturmas = Ler.umInt();
			System.out.println("Insira o NIF do professor: ");
			int nif = Ler.umInt();
			System.out.println("Insira o email do professor: ");
			String email = Ler.umaString();
			
			return new Professor(p, disciplinas, salario, numturmas, nif, email);
		}
		
		public String toString() {
		    return String.format("Nome: %s %s, Salário: %.2f, NumTurmas: %d, NIF: %d, Email: %s, Disciplinas: %s",
		            getNome(), getApelido(), salario, numturmas, nif, email, disciplinas);
		}
	}
