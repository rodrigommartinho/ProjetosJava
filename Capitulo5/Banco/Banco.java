class Conta {
    private int numeroConta;
    private Cliente titular;
    private double saldo;
    private static int contador;
    
    
    public static int getContador(){
        return contador;
    }
    
    /*
        Construtor => default sem parametros
        Deixando o construtor explicito posso passar parametros, conforme abaixo
    */
    public Conta(Cliente titular){
        this.titular = titular;
        this.numeroConta = contador ++;
    }

    //Sobrecarga de Construtor
    public Conta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    //Sobrecarga de Construtor
    public Conta(Cliente titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        //this.contador += 1;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setSaldo (double saldo){
        if(saldo > 0) {
            this.saldo = saldo;
        }        
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean sacar (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
            //System.out.println("Saldo Insuficiente para Saque");
        }        
    }

    public void depositar (double valor){
        this.saldo += valor;
    }

    public boolean transferir (Conta contaDestino, double valor){

        System.out.println("---------------------------");
        System.out.println("--------------Transferencia");
        System.out.println("Saldo da ContaOriginal::" + this.saldo);
        System.out.println("Saldo da ContaDestino::" + contaDestino.saldo);

        if(valor <= this.saldo){
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("--------------Transferencia de::" + valor + " realizada");
            System.out.println("SaldoAtual da ContaOriginal::" + this.saldo);
            System.out.println("SaldoAtual da ContaDestino::" + contaDestino.saldo);
            return true;
        }else {
            System.out.println("--------------Transferencia de::" + valor + " nao realizada. Saldo de::" + this.saldo + " insuficiente");
            System.out.println("SaldoAtual da ContaOriginal::" + this.saldo);
            System.out.println("SaldoAtual da ContaDestino::" + contaDestino.saldo);
            return false;
        }
        
    }
}

class Cliente {
    private String nome;
    private String cpf;

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

}

class Programa {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.setNome("Joao");
        cliente.setCpf("000.000.000-00");

        Conta contaOriginal = new Conta(cliente);
        //contaOriginal.setNumeroConta(1);
        //contaOriginal.setTitular(cliente);
        contaOriginal.setSaldo(1000.0);
  
        System.out.println("Nome do Titular::" + contaOriginal.getTitular().getNome());
        System.out.println("CPF do Titular::" + contaOriginal.getTitular().getCpf());
        System.out.println("Numero da ContaOriginal::" + contaOriginal.getNumeroConta());
        System.out.println("Saldo da ContaOriginal::" + contaOriginal.getSaldo());
        //System.out.println("Contador Conta::" + contaOriginal.getContador());
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setCpf("000.000.000-00");

        Conta contaDestino = new Conta(cliente2);
        //contaOriginal.setNumeroConta(1);
        //contaOriginal.setTitular(cliente);
        contaDestino.setSaldo(2000.0);

        System.out.println("---------------------");
        System.out.println("Nome do Titular::" + contaDestino.getTitular().getNome());
        System.out.println("CPF do Titular::" + contaDestino.getTitular().getCpf());
        System.out.println("Numero da ContaDestino::" + contaDestino.getNumeroConta());
        System.out.println("Saldo da ContaDestino::" + contaDestino.getSaldo());
        //System.out.println("Contador Conta::" + Conta.getContador());
    }
}