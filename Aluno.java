package Aluno;
import Pessoa.Pessoa;

import java.util.ArrayList;
import myinputs.Ler;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Aluno extends Pessoa {
		private static int ultimoId = 0;
		private int id;
		//adicionar atributo curso
        private int nif;
        private String email;
        private int anoescolar;
        private float media;
        
        public Aluno(Pessoa p, int nif, String email, int anoescolar, float media) {
        	super(p.getNome(), p.getApelido(), p.getNumescolar(), p.getNascimento(), p.getCargo());
        	this.id = ultimoId + 1;
			ultimoId++;
            //curso
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
						
	
	public static Aluno novoAluno() {
		Pessoa p = Pessoa.novaPessoa();
		
		System.out.println("Insira o ano escolar do aluno: ");
		int anoescolar = Ler.umInt();
		System.out.println("Insira o NIF do aluno: ");
		int nif = Ler.umInt();
		System.out.println("Insira o email do aluno: ");
		String email = Ler.umaString();
		System.out.println("Insira a média do aluno: ");
		float media = Ler.umFloat();
		
		return new Aluno(p, anoescolar, email, nif, media);
	}
	
		public String tostring(){
			return super.toString() + String.format("Curso: %s, NIF: %d, Email: %s, Média: %f", nif, email, media); 
			
		}
	} 
	
