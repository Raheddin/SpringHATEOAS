package az.raheddin.springhateoas.service;

import az.raheddin.springhateoas.controler.CustomerController;
import az.raheddin.springhateoas.entity.Customer;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Service
public class CustomerService {

    public Customer getCustomerDetail(String customerId) {
        //Link link = Link.of("http://localhost:8080/spring-security-rest/api/customers/10A");
        Customer customer= new Customer("10A", "Jane", "ABC Company");
        Link link = linkTo(CustomerController.class).slash(customer.getCustomerId()).withSelfRel();
        return customer.add(link);
    }

    public List<Customer> allCustomers() {
        List<Customer> customers=new ArrayList<>();
        Customer customer1= new Customer("10A", "Jane", "ABC Company");
        Customer customer2= new Customer("10A", "Jane", "ABC Company");
        Customer customer3= new Customer("10A", "Jane", "ABC Company");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        return customers;
    }
}
