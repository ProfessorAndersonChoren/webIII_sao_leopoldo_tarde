import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do lado A:");
        byte ladoA = teclado.nextByte();
        System.out.println("Digite o valor do lado B:");
        byte ladoB = teclado.nextByte();
        System.out.println("Digite o valor do lado C");
        byte ladoC = teclado.nextByte();

        if(ladoA >= ladoB + ladoC){
            System.out.println("NÃO FORMA UM TRIÂNGULO!!!");
        }else{
            double hipotenusa = ladoA * ladoA;
            double cateto_um = ladoB * ladoB;
            double cateto_dois = ladoC * ladoC;

            // Qual o tipo de triângulo
            if(hipotenusa > cateto_um + cateto_dois){
                System.out.println("TRIÂNGULO OBTUSÂNGULO");
            }else if(hipotenusa < cateto_um + cateto_dois){
                System.out.println("TRIÂNGULO ACUTÂNGULO");
            }

            if(hipotenusa == cateto_um + cateto_dois){
                System.out.println("TRIÂNGULO RETÂNGULO");
            }else if(hipotenusa == cateto_um && cateto_um == cateto_dois){
                System.out.println("TRIÂNGULO EQUILÁTERO");
            }else{
                System.out.println("TRIÂNGULO ISÓCELES");
            }
        }
    }
}
