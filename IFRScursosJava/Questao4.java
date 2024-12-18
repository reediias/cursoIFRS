public class Questao4 {
    public static void main(String[] args){
        float preco, novoPreco, desconto;

        System.out.print("preço do produto: ");
        preco = Float.parseFloat(System.console().readLine());
        
        desconto = (preco*10)/100;

        novoPreco = preco - desconto;

        System.out.print("o novo preço é: " + novoPreco);

    }
}
