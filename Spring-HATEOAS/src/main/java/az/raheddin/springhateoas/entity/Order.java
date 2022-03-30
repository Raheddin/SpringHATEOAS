package az.raheddin.springhateoas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends RepresentationModel<Order> {
    private String orderId;
    private double price;
    private int quantity;
}