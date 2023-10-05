// Imprima os primeiros números da série de Fibonacci até passar de 100.
public class exemploCinco {
    public static void main(String[] args) {
        int limite = 100;
        int anterior = 0;
        int atual = 1;

        System.out.println("Os primeiros numeros da serie de Fibonacci ate passar de 100 sao:");

        while (atual <= limite) {
            System.out.print(atual + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}

