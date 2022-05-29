package com.example.buysell.repositories;


import com.example.buysell.models.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserLocationRepository extends JpaRepository<UserLocation,Long> {
    List<UserLocation> findByStreet(String street);
}
