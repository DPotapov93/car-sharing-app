package org.example.carsharingapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Table(name = "rentals")
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private LocalDate actualReturnDate;
    private Long carId;
    private Long userId;
}
