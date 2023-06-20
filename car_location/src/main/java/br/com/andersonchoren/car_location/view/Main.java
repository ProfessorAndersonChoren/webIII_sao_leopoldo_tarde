package br.com.andersonchoren.car_location.view;

import br.com.andersonchoren.car_location.model.VehicleModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        VehicleModel vehicle = new VehicleModel();

        // Entrada
        System.out.println("Digite o modelo do veículo:");
        vehicle.model = teclado.nextLine();
        System.out.println("Digite a marca do veículo:");
        vehicle.brand = teclado.nextLine();
        System.out.println("Digite a cor do veículo:");
        vehicle.color = teclado.nextLine();
        System.out.println("Digite o ano de fabricação:");
        vehicle.ageProduction = teclado.nextShort();
        System.out.println("Digite o ano modelo:");
        vehicle.ageModel = teclado.nextShort();
        System.out.println("Digite a kilometragem:");
        vehicle.mileage = teclado.nextInt();
        System.out.println("Digite a placa do veículo:");
        vehicle.plate = teclado.next();

        // Saída
        System.out.printf("Marca: %s\nModelo: %s\nAno de fabricação: %d\nAno modelo: %d",vehicle.brand,vehicle.model,vehicle.ageProduction,vehicle.ageModel);
    }
}
