package Horario;
import myinputs.Ler;
import java.util.ArrayList;
import java.time.LocalTime	;

public class Horarios {
	private static int ultimoId = 0;
	private int id;
	private String diasemana;
	LocalTime horas;
	private ArrayList<Horarios>horarios;
	
	
	public Horarios(String diasemana,LocalTime horas,int id) {
		this.diasemana=diasemana;
		this.id=id;	
		this.horas=horas;
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
	public void setId(int id) {
		this.id=id;
	}
	public String getdiasemana() {
		return diasemana;
	}
	public void setdiasemana(String diasemana) {
		this.diasemana=diasemana;
	}
	public LocalTime getHoras() {
		return horas;
	}
	public void setHoras(LocalTime horas) {
        this.horas = horas;
    }
	
	

	 private static void criarNovoHorario() {
	        System.out.println("\nAdicionar Disciplina ao Horario");
	        String dia;
			// Solicitar informações do usuário
	        do {
	            System.out.print("Dia da semana: ");
	            dia = Ler.umaString();
	        } while (!dia.equals("Segunda") && !dia.equals("Terça") && !dia.equals("Quarta") && !dia.equals("Quinta") && !dia.equals("Sexta"));
	        
	        System.out.print("Hora de inicio: ");
	        int horaInicio = Ler.umInt();

	        System.out.print("Hora de termino: ");
	        int horaFim = Ler.umInt();

	        System.out.print("Disciplina: ");
	        String disciplina = Ler.umaString();

	        // Criar uma representação do horário e adicioná-lo à lista
	        String novoHorario;
	        novoHorario = dia + ": " + disciplina + "(" + horaInicio + " - " + horaFim + ")";
	          
	        //Horarios.add(novoHorario);

	        System.out.println("Nova disciplina adicionada");
	    }

	    private static void visualizarHorarios() {
	        
	    }
}

