public class Questao7 {
    public static void main(String[] args){
        float n1, n2, n3;

        System.out.print("1 nota: ");
        n1 = Float.parseFloat(System.console().readLine());

        n1 = n1 * 3;

        System.out.print("1 nota: ");
        n2 = Float.parseFloat(System.console().readLine());

        n2 = n2 * 2;

        System.out.print("1 nota: ");
        n3 = Float.parseFloat(System.console().readLine());

        n3 = n3 * 4;

        float media = (n1+n2+n3)/7;

        System.out.print("media: " + media);
    }
}
