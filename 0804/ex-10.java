import java.util.Scanner;

class math10 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Insira um numero: ");
    try {
        float i = Integer.parseInt(in.next());
        float result = ( i / 2 );
        System.out.println("Metade: " + result );
    } catch (NumberFormatException e) {
        System.out.println("Numero Invalido");
    }

  }

}
