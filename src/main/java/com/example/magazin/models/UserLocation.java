package com.example.magazin.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "location")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "houseNumber")
    private int houseNumber;
    @Column(name = "entrance")
    private int entrance;
    @Column(name = "intercomCode")
    private int intercomCode;
    @Column(name = "city")
    private String city;
}
