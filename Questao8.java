public class Questao8 {
    public static void main(String[] args){
        float base, altura, area;

        System.out.print("digite a base: ");
        base = Float.parseFloat(System.console().readLine());

        System.out.print("digite a altura: ");
        altura = Float.parseFloat(System.console().readLine());

        area = (base*altura)/2;

        System.out.print("a area equivale a: " + area);
    } 
}
