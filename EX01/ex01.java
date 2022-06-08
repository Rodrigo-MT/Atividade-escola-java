import java.util.Scanner;

public class ex01 {
    public static void main (String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            float altura,base_maior,base_menor,area;
            System.out.println("Digite a altura:");
            altura = ler.nextFloat();
            System.out.println("Digite a base maior:");
            base_maior = ler.nextFloat();
            System.out.println("Digite a base menor:");
            base_menor = ler.nextFloat();
            area = (altura*(base_menor + base_maior))/2;
            System.out.println("A área do trapezio é " + area);
        } 
        
    }
}