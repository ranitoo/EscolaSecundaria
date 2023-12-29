package Professor;

import myinputs.Ler;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public enum Disciplina implements Serializable {
        Biologia_e_Geologia(2000),
        Matemática_A(2000),
        Matemática_B(2000),
        Português(2000),
        Filosofia(2000),
        Economia(2000),
        Geografia(2000),
        Historia(2000),
        Inglês(2000),
        Espanhol(2000), 
        Francês(2000),
        Educação_Física(2000),
        Oficina_de_Artes(2000),
        TIC(2000),
        Fisica_e_Quimica(2000);

	private int salario;
    
    Disciplina(int salario) {
        this.salario = salario;
    }

    public static List<Disciplina> getDisciplinas() {
    	List<Disciplina> disciplinasSelecionadas = new ArrayList<>();
    	
    	System.out.println("Selecione as disciplinas que o professor leciona: ");
    	int opcao;
    	do {
        System.out.println("         1 - Biologia e Geologia" +
                "\n         2 -Matematica A " +
                "\n         3 -Matematica B " +
                "\n         4 - Portugues " +
                "\n         5 - Filosofia" +
                "\n         6 - Economia" +
                "\n         7 - Geografia" +
                "\n         8 - Historia" +
                "\n         9 - Inglês" +
                "\n         10 - Espanhol" +
                "\n         11 - Francês" +
                "\n         12 - Educação Fisica" +
                "\n         13 - Oficina das Artes" +
                "\n         14 - TIC" +
                "\n         15 - Fisica e Quimica" +
                "\n         0 - Finalizar seleção" +
                "\n#########################################################" +
                "\n                    Selecione uma opcao                  ");
        opcao = Ler.umInt();
        
        if(opcao > 0 && opcao <= values().length) {
        	disciplinasSelecionadas.add(values()[opcao - 1]);
        } else if(opcao != 0) {
        	System.out.println("Opção inválida.");
        }
    	}while (opcao != 0);
        
    	return disciplinasSelecionadas;
    }}
