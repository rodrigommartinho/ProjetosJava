class Conta {
    int numeroConta;
    Cliente titular;
    double saldo;

    boolean sacar (double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            return false;
            //System.out.println("Saldo Insuficiente para Saque");
        }        
    }

    void depositar (double valor){
        saldo += valor;
    }

    boolean transferir (Conta contaDestino, double valor){

        System.out.println("---------------------------");
        System.out.println("--------------Transferencia");
        System.out.println("Saldo da ContaOriginal::" + saldo);
        System.out.println("Saldo da ContaDestino::" + contaDestino.saldo);

        if(valor <= saldo){
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("--------------Transferencia de::" + valor + " realizada");
            System.out.println("SaldoAtual da ContaOriginal::" + saldo);
            System.out.println("SaldoAtual da ContaDestino::" + contaDestino.saldo);
            return true;
        }else {
            System.out.println("--------------Transferencia de::" + valor + " nao realizada. Saldo de::" + saldo + " insuficiente");
            System.out.println("SaldoAtual da ContaOriginal::" + saldo);
            System.out.println("SaldoAtual da ContaDestino::" + contaDestino.saldo);
            return false;
        }
        
    }
}

class Cliente {
    String nome;
    String cpf;
}

class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;

    void bonifica (double valor){
        System.out.println("--------------");
        System.out.println("Parabens. Salario Atual::" + salario + " Bonificacao de::" + valor);
        salario += valor;
        System.out.println("SalarioAtual::" + salario);
    }

    void demite(){
        estaNaEmpresa = false;
    }

    double calculaGanhoAnual(){
        return salario * 12;
    }
}

class Programa {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Joao";
        cliente.cpf = "000.000.000-00";

        Conta contaOriginal = new Conta();
        contaOriginal.numeroConta = 1;
        contaOriginal.titular = cliente;
        contaOriginal.saldo = 1000.0;
        
        System.out.println("Numero da ContaOriginal::" + contaOriginal.numeroConta);
        System.out.println("Nome do Titular::" + contaOriginal.titular.nome);
        System.out.println("CPF do Titular::" + contaOriginal.titular.cpf);
        System.out.println("Saldo da ContaOriginal::" + contaOriginal.saldo);
        
        if(contaOriginal.sacar(500.0) == true){
            System.out.println("Operacao Saque realizada com Sucesso");
        }else {
            System.out.println("Operacao Saque nao realizada. Saldo de::" + contaOriginal.saldo);
        }        

        contaOriginal.depositar(100.0);

        System.out.println("SaldoAtual da ContaOriginal::" + contaOriginal.saldo);

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Maria";
        cliente2.cpf = "000.000.000-00";

        Conta contaDestino = new Conta();
        contaDestino.numeroConta = 2;
        contaDestino.titular = cliente2;
        contaDestino.saldo = 700.0;

        System.out.println("--------------");
        System.out.println("Numero da ContaDestino::" + contaDestino.numeroConta);
        System.out.println("Nome do Titular::" + contaDestino.titular.nome);
        System.out.println("CPF do Titular::" + contaDestino.titular.cpf);
        System.out.println("Saldo da ContaDestino::" + contaDestino.saldo);

        if(contaOriginal.transferir(contaDestino, 1000.0) == true){
            System.out.println("Operacao Transferencia realizada com Sucesso");
        }else {
            System.out.println("Operacao Transferencia nao realizada");
        }

        Funcionario func1 = new Funcionario();
        func1.nome = "Joao";
        func1.departamento = "Almoxarifado";
        func1.dataEntrada = "01/01/2000";
        func1.salario = 1000.0;
        func1.rg = "00.000.000-00";
        func1.estaNaEmpresa = true;
        double ganhoAnual;

        System.out.println("--------------");
        System.out.println("Funcionario:: " + func1.nome);
        System.out.println("Departamento:: " + func1.departamento);
        System.out.println("Data Entrada:: " + func1.dataEntrada);
        System.out.println("Salario:: " + func1.salario);
        System.out.println("RG:: " + func1.rg);
        System.out.println("Esta na Empresa:: " + func1.estaNaEmpresa);

        func1.bonifica(500.0);

        ganhoAnual = func1.calculaGanhoAnual();

        System.out.println("Ganho Anual de Salario::" + ganhoAnual);

    }
}