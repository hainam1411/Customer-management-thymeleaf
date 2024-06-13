package org.example.customermanagementthymeleaf.service;

import org.example.customermanagementthymeleaf.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Trung", "trung@codegym.vn", "Ha Noi"));
        customers.put(2, new Customer(2, "Hai", "hai@codegym.vn", "Hai Phong"));
        customers.put(3, new Customer(3, "Duy", "duy@codegym.vn", "Lang Son"));
        customers.put(4, new Customer(4, "nam", "nam@codegym.vn", "Ha Nam"));
        customers.put(5, new Customer(5, "Hoang", "hoang@codegym.vn", "Bac Ninh"));
        customers.put(6, new Customer(6, "Tien", "tien@codegym.vn", "Nam Dinh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}