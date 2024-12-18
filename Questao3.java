public class Questao3 {
    public static void main(String[] args){
        float n1, n2, n3, media;

        System.out.print("digite a 1 nota ");
        n1 = Float.parseFloat(System.console().readLine());

        System.out.print("digite a 2 nota ");
        n2 = Float.parseFloat(System.console().readLine());

        System.out.print("digite a 3 nota ");
        n3 = Float.parseFloat(System.console().readLine());

        media = (n1 + n2 + n3)/3;

        System.out.print(media);
    }
}
