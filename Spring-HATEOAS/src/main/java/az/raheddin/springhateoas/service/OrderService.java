package az.raheddin.springhateoas.service;

import az.raheddin.springhateoas.entity.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    public List<Order> getAllOrdersForCustomer(String customerId) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("test1",10.1,1));
        orders.add(new Order("test2",10.2,2));
        orders.add(new Order("test3",10.3,3));
        return orders;
    }
}
