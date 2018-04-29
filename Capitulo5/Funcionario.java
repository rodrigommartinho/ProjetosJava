class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public void calculaSalario(double salario){
        this.salario = salario - (salario * 0.06);
    }

    //Sobrecarga de Método
    public void calculaSalario(double salario, double horaExtra){
        double valorHoraExtra = (salario/30) / 8 * horaExtra;
        this.salario = salario - (salario * 0.06) + valorHoraExtra;
    }

    public void bonifica (double valor){
        System.out.println("--------------");
        System.out.println("Parabens. Salario Atual::" + salario + " Bonificacao de::" + valor);
        salario += valor;
        System.out.println("SalarioAtual::" + salario);
    }

    public void demite(){
        estaNaEmpresa = false;
    }

    public double calculaGanhoAnual(){
        return salario * 12;
    }
}

class Programa{
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Joao");
        f1.setDepartamento("Almoxarifado");
        f1.setSalario(1000.00);
        
        System.out.println("Nome::" + f1.getNome());
        System.out.println("Departamento::" + f1.getDepartamento());
        System.out.println("Salario::" + f1.getSalario());
    }
}