import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      
      int A, B, C, D, resultado;
      
      A = sc.nextInt();
      B = sc.nextInt();
      C = sc.nextInt();
      D = sc.nextInt();
      resultado = A * B - C * D;
      
      System.out.printf("O resultado é: " + resultado);
      
      sc.close();
  }
}