import myinputs.Ler;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.DateTimeException;
import java.io.Serializable;

   public class Pessoa implements Serializable{
	   String nome;
	   String apelido;
	   int numescolar;
	   LocalDateTime nascimento;
	   String cargo;	

	
	public Pessoa(String nome, String apelido, int numescolar,LocalDateTime nascimento, String cargo) {
		this.nome=nome;
		this.apelido=apelido;
		this.numescolar=numescolar;
		this.nascimento=nascimento;
		this.cargo=cargo;
	}

	public static Pessoa novaPessoa() {
	    System.out.print("O primeiro nome da pessoa: ");
	    String nome = Ler.umaString();
	    System.out.print("O apelido da pessoa: ");
	    String apelido = Ler.umaString();
	    System.out.println("Insira o seu numero escolar");
        int numescolar = Ler.umInt();
        System.out.println("Insira o cargo: ");
        String cargo = Ler.umaString();

    LocalDateTime nascimento;
    while (true) {
        System.out.print("Data de nascimento\n");
        System.out.print("Dia: ");
        int dd = Ler.umInt();

        System.out.print("\nMes: ");
        int mm = Ler.umInt();
        Month month;
        try {
            month = Month.of(mm);
        } catch (DateTimeException e) {
            System.out.println("Mes invalido");
            continue;
        }
        System.out.print("\nAno: ");
        int yyyy = Ler.umInt();

        try {
            nascimento = LocalDateTime.of(yyyy, month, dd, 0, 0);
            break;
        } catch (DateTimeException e) {
            System.out.println("Data invalida!");
        }
    }
    return new Pessoa(nome, apelido ,numescolar, nascimento, cargo);
}

	public String getNome() {
	return nome;
	}
	public void setNome() {
	this.nome=nome;
	}
	public String getApelido() {
	return apelido;
	}
	public void setApelido() {
	this.apelido=apelido;
	}
	
	public int getNumescolar() {
	return numescolar;
	}
	public void setNumescolar(int numescolar) {
	this.numescolar=numescolar;
	}
	public int getIdade() {
	    Year nascimento = Year.of(this.nascimento.getYear());
	    Year now = Year.now();
	    return now.getValue() - nascimento.getValue();
	}
	
	public LocalDateTime getNascimento() {
	 return nascimento;
	}
	
	public void setNascimento(LocalDateTime nascimento) {
	    this.nascimento = nascimento;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String tostring() {
	String s = String.format("Nome: %s, Apelido: %s, Numeroescolar: %d, Idade: %d, Cargo: %d", nome, apelido, numescolar, getIdade(), cargo);
	return s;
	}
}
