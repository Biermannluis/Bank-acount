public class Cliente {
    int codigo;
    String nome;
    int cpf;
    String telefone;

    void ImprimeDadosClientes() {
        System.out.println("Dados do Cliente ");

        System.out.println("codigo: " + this.codigo);

        System.out.println("nome: " + this.nome);

        System.out.println("cpf: " + this.cpf);

        System.out.println("telefone: " + this.telefone);

        System.out.println("=======================================");

    }
}