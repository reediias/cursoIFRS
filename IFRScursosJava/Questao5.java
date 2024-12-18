public class Questao5 {
    public static void main(String[] args){
        float salario, novoSalario;

        System.out.print("digite o valor do salário: ");
        salario = Float.parseFloat(System.console().readLine());

        novoSalario = salario + ((salario*5)/100) - ((salario*7)/100);

        System.out.print(novoSalario);
    }
}
