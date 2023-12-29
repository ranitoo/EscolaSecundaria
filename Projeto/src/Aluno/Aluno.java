package Aluno;
import Pessoa.Pessoa;
import java.util.ArrayList;
import java.util.List;
import Curso.Curso;
import myinputs.Ler;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Aluno extends Pessoa implements Serializable {
		private static int ultimoId = 0;
		private int id;
		private Curso curso;
        private int nif;
        private String email;
        private int anoescolar;
        private float media;
        
        public Aluno(Pessoa p, int nif, String email, Curso curso, int anoescolar, float media) {
        	super(p.getNome(), p.getApelido(), p.getNumescolar(), p.getNascimento());
        	this.id = ultimoId + 1;
			ultimoId++;
            this.curso = curso;
			this.nif = nif;
			this.email = email;
            this.anoescolar= anoescolar; 
            this.media = media;
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
				
		public float getMedia() {
			return media;
		}
			
		public void setMedia(float media) {
			this.media = media;
		}
		
		public Curso getCurso() {
			return curso;
		}
		
	    public void setCurso(Curso curso) {
	    	this.curso = curso;
	    }
						
	
	public static Aluno novoAluno() {
		Pessoa p = Pessoa.novaPessoa();
		
		System.out.println("Insira o ano escolar do aluno: ");
		int anoescolar = Ler.umInt();
		System.out.println("Insira o NIF do aluno: ");
		int nif = Ler.umInt();
		System.out.println("Insira o email do aluno: ");
		String email = Ler.umaString();
		System.out.println("Insira o curso do aluno: ");
		String nomeCurso = Ler.umaString();
		Curso curso = new Curso(nomeCurso);
		System.out.println("Insira a média do aluno: ");
		float media = Ler.umFloat();
	
		
	  
	    return new Aluno(p, anoescolar, email, curso, nif, media);
		
	}
	
		public String toString(){
			return super.toString() + String.format("Curso: %s, NIF: %d, Email: %s, Média: %f",curso, nif, email, media); 
			
		}
	} 
		
