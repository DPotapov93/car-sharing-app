package org.example.carsharingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.net.URL;
import lombok.Data;

@Data
@Table(name = "payments")
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
