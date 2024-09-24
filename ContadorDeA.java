import java.util.Scanner;

public class ContadorDeA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar que o usuário insira uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // Chamada do método para contar a quantidade de 'a' e 'A'
        int count = contarLetraA(input);
        
        // Exibir resultado
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    // Método para contar quantas vezes 'a' ou 'A' aparecem na string
    public static int contarLetraA(String str) {
        int contador = 0;
        // Percorrer cada caractere da string
        for (int i = 0; i < str.length(); i++) {
            char letra = str.charAt(i);
            // Verificar se o caractere é 'a' ou 'A'
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
