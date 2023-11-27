package kezia.br.notation;

public class Main {
    public static void main(String[] args) {
        Class<?> classe = MinhaTabela.class;

        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = classe.getAnnotation(Tabela.class);

            System.out.println("Nome da Tabela: " + tabelaAnnotation.nome());
            System.out.println("Colunas:");

            for (String coluna : tabelaAnnotation.colunas()) {
                System.out.println("- " + coluna);
            }
        } else {
            System.out.println("A anotação Tabela não está presente na classe.");
        }
    }
}
