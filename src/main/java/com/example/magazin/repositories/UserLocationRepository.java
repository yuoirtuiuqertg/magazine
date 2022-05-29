package com.example.magazin.repositories;


import com.example.magazin.models.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserLocationRepository extends JpaRepository<UserLocation,Long> {
    List<UserLocation> findByStreet(String street);
}
