public class Questao6 {
    public static void main(String[] args){
        float salario, vendas;

        System.out.print("digite o valor total das vendas realizadas: ");
        vendas = Float.parseFloat(System.console().readLine());

        vendas = (vendas*4)/100;

        salario = 1412 + vendas;

        System.out.print("o salario sera de " + salario);
    }
    
}
