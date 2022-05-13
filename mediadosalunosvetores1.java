public class mediadosalunosvetores1 { //inicia classe
    public static void main(String[] args) { //inicia metodo main
        int[] turma = {35, 4, 22, 20, 36, 30}; //define um array com o numero de pessoas em cada sala
        int i = 0; //define int i
        String texto = ""; //define uma string vazia para ser usada como buffer
        int soma = 0; //inicia a variavel soma

        do { //inicia o loop do-while
                texto += "Sala " + (i+1) + " - " + turma[i] + " alunos" + "\n"; //adiciona a string a variavel texto, para ser usada como lista de salas com seus respectivos alunos
            i++; //adiciona 1 ao contador 1
        } while (i < turma.length); //regra do loop, roda enquanto i for menor que o tamanho do array turma

        System.out.println(texto); //exibe o que foi armazenado na variavel texto

        i = 0; //reseta o contador i
        do { //inicia outro loop do-while
            soma += turma [i]; //soma o i-nesimo menbro do array turma a variavel soma
            i++; //adiciona 1 ao contador 1
        } while (i < turma.length); //regra do loop, roda enquanto i for menor que o tamanho do array turma

        int media = soma/turma.length; //inicia a variavel media atribuindo seu valor como a divisao da soma pelo tamanho do array

        System.out.println("Media de alunos por sala: " + media + "\n"); //exibe na tela o valor da media de alunos por sala

        System.out.println("Salas com numero de alunos maior do que a media do conjunto de salas:"); //exibe o texto
        i = 0; //reseta o valor do contador
        texto = ""; //reseta o que foi escrito na variavel texto
        do { //inicia outro loop do-while
            if (turma[i] > media) { //verifica a condição se o i-nesimo menbro do array possui quantidade de alunos maior do que a media
                texto += "Sala " + (i+1) + " - " + turma[i] + " alunos" + "\n"; //adiciona linha a string texto com o numero da sala e sua quantidade de alunos, desde que este seja acima da media
            } //finaliza if
            i++; //adiciona 1 ao contador i
        } while (i < turma.length); //regra do loop, roda enquanto i for menor que o tamanho do array turma
        System.out.println(texto); //exibe a string texto, no qual foram adicionadas quais salas possuem mais alunos do que a media

    }
}

