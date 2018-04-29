class Programa {
    public static void main(String[] args) {
        
        int notas[] = new int[8]; //Array de Tamanho 8, que armazena somente inteiros
        notas[0] = 10;
        notas[1] = 9;
        notas[2] = 10;
        notas[3] = 8;
        notas[4] = 9;
        notas[5] = 6;
        notas[6] = 8;
        notas[7] = 10;

        for(int i = 0; i < 8; i++){
            System.out.println("Posicao::" + i + " Valor::" + notas[i]);
        }
    }
}