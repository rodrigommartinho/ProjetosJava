class Filme {
    //Atributos da Classe Filmes
    int codigo;
    String nome;
    double valor;
    boolean estaDisponivel;

    void retirar(){
        estaDisponivel = false;
    }

    void devolver(){
        estaDisponivel = true;
    }
}

class Programa {
    public static void main(String[] args){
        
        Filme filme = new Filme();
        filme.codigo = 1;
        filme.nome = "A Ero do Gelo";
        filme.valor = 1.50;
                
        Filme filme2 = new Filme();
        filme2.codigo = 2;
        filme2.nome = "A Ero do Gelo 2";
        filme2.valor = 2.50;

        Filme filme3 = new Filme();
        filme3.codigo = 3;
        filme3.nome = "A Ero do Gelo 3";
        filme3.valor = 3.50;
        
        Filme filme4 = new Filme();
        filme4.codigo = 4;
        filme4.nome = "A Ero do Gelo 4";
        filme4.valor = 4.50;

        Filme filme5 = new Filme();
        filme5.codigo = 5;
        filme5.nome = "A Ero do Gelo 5";
        filme5.valor = 5.50;

        Filme arrayFilmes[] = new Filme[5];
        arrayFilmes[0] = filme;
        arrayFilmes[1] = filme2;
        arrayFilmes[2] = filme3;
        arrayFilmes[3] = filme4;
        arrayFilmes[4] = filme5;

        for (int i = 0; i < 5; i++) {
            System.out.println("Objeto::" + arrayFilmes[i]);
            System.out.println("Codigo::" + arrayFilmes[i].codigo);
            System.out.println("Nome::" + arrayFilmes[i].nome);
            System.out.println("Valor::" + arrayFilmes[i].valor);
            System.out.println("----------------");
        }

    }
}