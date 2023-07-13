package br.com.andersonchoren.repository;

import br.com.andersonchoren.model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EmployeeRepository implements IRepository<EmployeeModel>{
    private List<EmployeeModel> tEmployees = new ArrayList<>();
    @Override
    public boolean insert(EmployeeModel object) {
        return tEmployees.add(object);
    }

    @Override
    public List<EmployeeModel> findAll() {
        return tEmployees;
    }

    @Override
    public Optional<EmployeeModel> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public boolean update(EmployeeModel object) {
        return false;
    }

    @Override
    public void delete(int position) {
        tEmployees.remove(position);
    }

    public EmployeeModel findByCpf(String cpf){
        return null;
    }
}
