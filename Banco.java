public class Banco {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.codigo = 01;
        cliente1.nome = "Ana Maria Cardoso";
        cliente1.cpf = 012345;
        cliente1.telefone = "51999784532";

        Cliente cliente2 = new Cliente();
        cliente2.codigo = 02;
        cliente2.nome = "Luis Afonso";
        cliente2.cpf = 789456;
        cliente2.telefone = "5132659878";

        Conta/* classe */ conta1/* objeto */ = new Conta();
        conta1.numero = 50312;
        conta1.clienteConta = cliente1;
        conta1.saldo = 3000;
        conta1.limite = 500;

        Conta/* classe */ conta2/* objeto */ = new Conta();
        conta2.numero = 50312;
        conta2.clienteConta = cliente2;
        conta2.saldo = 0;
        conta2.limite = 0;

        // cliente2.ImprimeDadosClientes();
        // cliente1.ImprimeDadosClientes();

        conta1.ImprimeExtrato();
        conta2.ImprimeExtrato();

        conta1.deposita(300);
        conta1.ImprimeExtrato();

        conta1.saca(500);
        conta1.ImprimeExtrato();

        conta1.aumentaLimite(99);
        conta1.ImprimeExtrato();

        conta1.transferePara(conta2, 88);
        conta1.ImprimeExtrato();
        conta2.ImprimeExtrato();
    }
}
