package javaclase6;

    import java.util.Scanner;

public class miCalculadora {
    
    public static void main(String[] args) {
        CalculadoraClase6 miCalculadora = new CalculadoraClase6();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.println("El resultado de la suma es: " + miCalculadora.sumar(numero1, numero2));
        System.out.println("El resultado de la resta es: " + miCalculadora.restar(numero1, numero2));
        System.out.println("El resultado de la multiplicación es: " + miCalculadora.multiplicar(numero1, numero2));
        System.out.println("El resultado de la división es: " + miCalculadora.dividir(numero1, numero2));
        }
    }

