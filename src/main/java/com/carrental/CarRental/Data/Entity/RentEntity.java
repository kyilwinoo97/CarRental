package com.carrental.CarRental.Data.Entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "RentVehicle")
@ToString
public class RentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int vehicleId;
    int userId;
    String status;
    String startDate;
    String endDate;
    double fee;  // fee_per_hr = 20000 , fee_per_day = 100000
    String uom;    //hr/day

    int qty;      //3 hr/ 3 days

    double totalAmount;

}
