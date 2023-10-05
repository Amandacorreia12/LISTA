public class sete {
    public static void main(String[] args) {
        int x = 13; 

        System.out.println("Sequência de numeros gerada para x = " + x + ":");

        while (x != 1) {
            System.out.print(x + " -> ");
            
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
        }

        System.out.println(x); 
    }
}
