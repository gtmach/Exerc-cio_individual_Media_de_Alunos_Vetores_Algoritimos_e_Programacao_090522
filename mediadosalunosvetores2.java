import java.util.Scanner; //importa o scanner

public class mediadosalunosvetores2 { //inicia uma classe
    public static void main(String[] args) { //inicia o metodo main
        int i = 0; //inicia a variavel i que sera usada como contador
        String texto = ""; //inicia uma string vazia
        Scanner sc = new Scanner(System.in); //inicia um scanner

        System.out.println("Quantas salas existem?"); //exibe instrucoes em formato de texto
        int n = sc.nextInt(); //cria a int n para receber entrada do scanner
        int[] turma = new int[n]; //cria um array de tamanho n

        for (int outroI = 0; outroI < turma.length; outroI++) //inicia um loop for
        {
            System.out.println("Digite a quantidade de alunos na sala " + (outroI+1)+":"); //exibe instrucoes na tela, com o numero da sala (n+1)
            turma[outroI] = sc.nextInt(); //recebe no array de tamanho n a quantidad de pessoas na sala, na posicao i
        }
        System.out.println(""); //pula uma linha
        System.out.println("Salas digitadas:"); //exibe texto

        do { //inicia loop do-while
                texto += "Sala " + (i+1) + " - " + turma[i] + " alunos" + "\n"; //armazena texto na string texto com o numero da sala e seus alunos
            i++; //adiciona 1 ao contador
        } while (i < turma.length); //regra do loop, roda enquanto o contador for menor que o tamanho do array

        System.out.println(texto); //exibe a string texto


        int soma = 0; //cria a int soma
        i = 0; //reseta a int i para valor 0
        do { //inicio do loop do-while
            soma += turma [i]; //adiciona o numero na posicao i do array a int soma
            i++; //adiciona 1 a i
        } while (i < turma.length); //regra do loop, roda enquanto i for menor que o tamanho do array soma

        int media = soma/turma.length; //fine a int media, com a soma de alunos dividido pelo tamanho do array (numero de salas)

        System.out.println("Media de alunos por sala: " + media + "\n"); //exibe texto com a media

        System.out.println("Salas com numero de alunos maior do que a media do conjunto de salas:"); //exibe texto
        i = 0; //reseta o contador i para zero
        texto = ""; //reseta a string texto para uma string vazia
        do { //inicia um loop do-while
            if (turma[i] > media) { //verifica a condicao se o item contido na i-nesima posicao do array e maior que a media
                texto += "Sala " + (i+1) + " - " + turma[i] + " alunos" + "\n"; //adiciona texto a string texto para listar quais salas tem mais alunos do que a media
            }
            i++; //adiciona 1 a0 contador i
        } while (i < turma.length); //regra do while, roda enquanto i for menor que o tamanho do array turma
        System.out.println(texto); //exibe os resultados armazenados na string texto

    }
}

