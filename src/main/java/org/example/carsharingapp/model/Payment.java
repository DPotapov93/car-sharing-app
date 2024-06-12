package org.example.carsharingapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.net.URL;

@Data
@Table(name = "payents")
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Status status;
    private Type type;
    private Long rentalId;
    private URL sessionUrl;
    private String sessionId;
    private BigDecimal amountToPay;


    public enum Status {
        PENDING,
        PAID
    }

    public enum Type {
        PAYMENT,
        FINE
    }
}
