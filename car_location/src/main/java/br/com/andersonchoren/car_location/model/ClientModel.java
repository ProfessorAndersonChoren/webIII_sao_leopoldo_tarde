package br.com.andersonchoren.car_location.model;

// Importações
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

public class ClientModel {
    private UUID id;
    private String name;
    private String cpf;
    private String phone;
    private String email;
    private LocalDate birthday;
    private List<LocationModel> locations;
}
