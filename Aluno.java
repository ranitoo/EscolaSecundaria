import java.util.ArrayList;
import myinputs.Ler;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Aluno extends Pessoa {
	private Disciplina disciplina;
        private int nif;
        private String email;
        private int anoescolar;
        
        public Aluno(String nome, String apelido, int numescolar, LocalDateTime nascimento, String disciplina, int nif, String email, int anoescolar) {
            super(nome, apelido, numescolar, nascimento);
            this.nif = nif;
            this.disciplina = new Disciplina(disciplina);
            this.anoescolar= anoescolar;
            
    
    }
	    public Disciplina getDisciplina() {
		return disciplina;
	    }
	    public void setDisciplina () {
	    this.Disciplina=disciplina;	
	    }
		public int getNif() {
			return nif;
		}
		public void setNif(int nif) {
			this.nif=nif;
		}
		public String getEmail() {
		     return email;
		}
		public void setEmail(String email) {
			this.email=email; 
		}
		public int getAnoescolar() {
			return anoescolar;
		}
		public void setAnoescolar(int anoescolar) {
				this.anoescolar=anoescolar;
			}
				
			
						
	
	public static aluno novoAluno() {
		Pessoa pessoa = novaPessoa();
		
		System.out.println("Insira a disciplina que frequenta: ");
		String disciplina = Ler.umaString();

		System.out.println("Insira o NIF do aluno: ");
		int nif = Ler.umInt();

		System.out.println("Insira o email do aluno: ");
		String email = Ler.umString();
		
		return new Aluno (pessoa.getNome(), pessoa.getApelido(), pessoa.getNumescolar(), pessoa.getNascimento(), disciplina , nif, email);
	}
	
		public String tostring(){
			return super.toString() + String.format("Disciplina: %s, NIF: %d, Email: %s", disciplina, nif, email); 
			
		}
	} 
		
