class Empresa {
    String razaoSocial;
    String cnpj;
    Funcionario arrayFuncionarios[];

	void adicionaFuncionario(Funcionario funcionario) {
		for(int i = 0 ; i < arrayFuncionarios.length ; i++) {
			if(arrayFuncionarios[i] == null) {
				arrayFuncionarios[i] = funcionario;
				break;
			}
		}
	}
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
        Empresa abc = new Empresa();
        abc.razaoSocial = "Empresa Logistica";
        abc.cnpj = "123.456.789/0001-00";
        abc.arrayFuncionarios = new Funcionario[2];
        
        Funcionario func1 = new Funcionario();
        func1.nome = "Joao";
        func1.departamento = "Almoxarifado";
        func1.dataEntrada = "00/00/0000";
        func1.rg = "00.000.000-0";
        func1.salario = 1500.00;
        func1.estaNaEmpresa = true;
        abc.adicionaFuncionario(func1);

        Funcionario func2 = new Funcionario();
        func2.nome = "Maria";
        func2.departamento = "Almoxarifado";
        func2.dataEntrada = "00/00/0000";
        func2.rg = "00.000.000-0";
        func2.salario = 2500.00;
        func2.estaNaEmpresa = true;
        abc.adicionaFuncionario(func2);
        
        for(Funcionario arrayFuncs : abc.arrayFuncionarios) {
            System.out.println("Funcionario::" + arrayFuncs);
            System.out.println("Nome::" + arrayFuncs.nome);
            System.out.println("Departamento::" + arrayFuncs.departamento);
            System.out.println("Data de Entrada::" + arrayFuncs.dataEntrada);
            System.out.println("RG::" + arrayFuncs.rg);
            System.out.println("Salario::" + arrayFuncs.salario);
            System.out.println("Ativo::" + arrayFuncs.estaNaEmpresa);
            System.out.println("----------------");
        }
        
    }
}