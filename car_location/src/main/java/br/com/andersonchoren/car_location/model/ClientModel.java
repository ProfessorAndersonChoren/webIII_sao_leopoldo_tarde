package br.com.andersonchoren.car_location.model;

import java.util.UUID;
import java.util.List;
import java.time.LocalDate;

public class ClientModel {
    private UUID id;
    private String name;
    private String cpf;
    private String phone;
    private String email;
    private LocalDate birthday;
    private List<LocationModel> locations;
}
