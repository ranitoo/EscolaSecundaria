import myinputs.Ler;

public class GerirProfessor {
    public static int menu() {
        int opcao;
        System.out.println("#########################################################");
        System.out.println("|                    Menu Professor                      |");
        System.out.println("|________________________________________________________|");
        System.out.println("|                    1 - Adicionar Professor              |");
        System.out.println("|                    2 - Remover professor               |");
        System.out.println("|                    3 - Listar professores              |");
        System.out.println("|                    4 - Atualizar professor             |");
        System.out.println("|                    7 - Sair                            |");
        System.out.println("#########################################################");
        System.out.println("                    Selecione uma opcao                  ");
        opcao = Ler.umInt();
        return opcao;
    }
}
