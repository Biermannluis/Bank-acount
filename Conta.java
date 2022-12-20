public class Conta {
    int numero;
    Cliente clienteConta;
    double saldo;
    double limite;

   

    void ImprimeExtrato() {

        this.clienteConta.ImprimeDadosClientes();
        System.out.println("Numero: " + this.numero);

        System.out.println("saldo: " + this.saldo);

        System.out.println("limite: " + this.limite);
    }

    void deposita(double valor){

        System.out.println("Houve um DEPOSITO DE: "+ valor);
        this.saldo+=valor;
        this.ConfirmaOperacao();
    }

    void saca(double valor){

        
        System.out.println("Houve um SAQUE DE: "+ valor);

        this.saldo-=valor;
        this.ConfirmaOperacao();

    }

    void aumentaLimite(double valor){         
    
    System.out.println("Houve mudança no LIMITE de: "+ valor);
     this.limite+=valor;
     this.ConfirmaOperacao();

    }

    void transferePara( Conta contaDestino, double valor){
        this.saca(valor);
        contaDestino.saldo+=valor;

    }

    void ConfirmaOperacao() {
        System.out.println("=======================================");

        System.out.println("Operacao realizada.");
    }
    
    

}
