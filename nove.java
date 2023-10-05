public class nove {
    public static void main(String[] args) {
        double salario = 280.0 ; 
        double aumento;
        double novoSalario;
        int porcentagem;

        if (salario <= 280) {
            aumento = salario * 0.20;
            novoSalario = salario + aumento;
            porcentagem = 20;
        } else if (salario > 280 && salario < 700) {
            aumento = salario * 0.15;
            novoSalario = salario + aumento;
            porcentagem = 15;
        } else if (salario >= 700 && salario < 1500) {
            aumento = salario * 0.10;
            novoSalario = salario + aumento;
            porcentagem = 10;
        } else {
            aumento = salario * 0.05;
            novoSalario = salario + aumento;
            porcentagem = 5;
        }

        System.out.println("O novo Salario eh: " + novoSalario);
        System.out.println("O salario antes do reajuste: " + salario);
        System.out.println("O percentual de aumento aplicado: " + porcentagem + "%");
        System.out.println("O valor do aumento: " + aumento);
    }
}
