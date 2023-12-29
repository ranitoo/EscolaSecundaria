package Horarios;
import java.io.Serializable;
import myinputs.Ler;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Horarios implements Serializable{
	private static int ultimoId = 0;
	private int id;
	private String diasemana;
	private String turma;
	private String disciplina;
	LocalTime horas;
	
	
	public Horarios(String diasemana,LocalTime horas,String disciplina, String turma) {
		this.id = ultimoId + 1;
		ultimoId++;
		this.diasemana=diasemana;
		this.disciplina = disciplina;
		this.horas=horas;
		this.turma= turma;
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
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public LocalTime getHoras() {
		return horas;
	}
	
    public String getTurma() {
        return turma;
    }
    
    public void setTurma(String turma) {
    	this.turma = turma; 
    }
	public void setHoras(LocalTime horas) {
        this.horas = horas;
    }
	
	
	public static Horarios NovoHorario() {
        System.out.println("\nAdicionar Disciplina ao Horario");
        String dia;
        do {
            System.out.print("Dia da semana: ");
            dia = Ler.umaString();
        } while(!dia.equals("Segunda") && !dia.equals("Terça") && !dia.equals("Quarta") && !dia.equals("Quinta") && !dia.equals("Sexta"));

        System.out.print("Turma: ");
        String turma = Ler.umaString();

        System.out.print("Hora de inicio: ");
        int horaInicio = Ler.umInt();

        System.out.print("Hora de termino: ");
        int horaFim = Ler.umInt();

        System.out.print("Disciplina: ");
        String disciplina = Ler.umaString();

        return new Horarios(dia, LocalTime.of(horaInicio, horaFim), disciplina, turma);
    }
	
	
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        return String.format("Horario [Turma: " + turma +
               ", Dia: " + diasemana +
               ", Disciplina: " + disciplina +
               ", Turma: " + turma +
               ", Horas: " + horas.format(formatter) +             
               "]");
    }
}
