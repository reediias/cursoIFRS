public class Questao9{
    public static void main(String[]args){
        float lado, area;

        System.out.print("digite o tamanho do lado");
        lado = Float.parseFloat(System.console().readLine());

        area = lado*lado;

        System.out.print("area: " + area);
    }
}