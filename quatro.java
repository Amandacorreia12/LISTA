// Elabore um código que ao informar um número, imprima se este número é primo.
public class quatro {
    public static void main(String[] args) {
        int numero = 3; 

        if (primo(numero)) {
            System.out.println(numero + " eh um numero primo.");
        } else {
            System.out.println(numero + " nao eh um numero primo.");
        }
    }

    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false; 
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}

