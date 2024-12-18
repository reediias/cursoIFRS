public class Questao10 {
    public static void main(String[] args){
        float pe, jarda, polegada, milhas;

        System.out.print("digite a medida em pés: ");
        pe = Float.parseFloat(System.console().readLine());

        polegada = 12*pe;

        jarda = 3*pe;

        milhas = 1760*3*pe;

        System.out.print("em polegada: " + polegada + "\n" + "em jarda: " + jarda + "\n" + "em milhas: " + milhas);
    }
}