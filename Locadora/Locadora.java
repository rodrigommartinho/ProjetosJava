class Filme {
    //Atributos da Classe Filmes
    int codigo;
    String nome;
    double valor;
    boolean estaDisponivel;
}

class Programa {
    public static void main(String[] args){
        
        Filme filme = new Filme();
        filme.codigo = 123;
        filme.nome = "A Ero do Gelo";
        filme.valor = 2.50;
        
        System.out.println(filme);
        System.out.println(filme.codigo);
        System.out.println(filme.nome);
        System.out.println(filme.valor);
        System.out.println(filme.estaDisponivel);
        
        Filme filme2 = new Filme();
        filme2.codigo = 321;
        filme2.nome = "A Ero do Gelo 2";
        filme2.valor = 3.50;

        System.out.println(filme2);
        System.out.println(filme2.codigo);
        System.out.println(filme2.nome);
        System.out.println(filme2.valor);
        
        if(filme == filme2){
            System.out.println("Objetos sao Iguais");
        } else{
            System.out.println("Objetos sao Diferentes");
        }
    }
}