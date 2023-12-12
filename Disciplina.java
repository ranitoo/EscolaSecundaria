import myinputs.Ler;

public enum Disciplina {
        Português(2000),
        Biologia_e_Geologia(2000),
        Matemática_A(2000),
        Matemática_B(2000),
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
    Especialidade(int salario) {
        this.salario = salario;
    }

    public static Especialidade getEspecialidade() {
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
                "\n#########################################################" +
                "\n                    Selecione uma opcao                  ");
        int opcao = Ler.umInt();
        switch (opcao)) {
            case 1:
                
                break;
            case 2:
                    
                break;
            case 3: 
                        
                    break;
            case 4:
                            
                break;
            case 5:
                                
                    break;
            case 6:
                                    
                break;
            case 7:
                                        
                    break;
            case 8:
                                            
                    break;
            case 9:
                                                
                break;
            case 10:
                                                    
                    break;
            case 11:
                                                        
                break;
            case 12:
                                                            
                    break;
            case 13:
                                                                
                break;
            case 14:
                                                                    
                 break;
            case 15:
                                                                        
                    break;
            default:
                break;
        }
    }
}