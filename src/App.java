import java.util.Scanner;

class Main {
  // Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // declaração da variáveis
    int cons2 = 58;
    float cons1 = (float) 72.7;
    

    // peça a altura
    String textoUm = "Insira a sua altura (m): ";
    System.out.print(textoUm);
    float altura = input.nextFloat();

    // fazer o calculo 
    float resultado = (cons1 * altura) - cons2;

    // mostrar o resultado do calculo
    System.out.println("O seu peso ideal é: " + resultado + " Kg.");

    input.close();
  }
}





