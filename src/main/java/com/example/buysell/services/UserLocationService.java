package com.example.buysell.services;

import com.example.buysell.models.UserLocation;
import com.example.buysell.repositories.UserLocationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserLocationService{
    private final UserLocationRepository userLocationRepository;

    public List<UserLocation> listUserLocation(String street) {
        List<UserLocation> products = userLocationRepository.findAll();
        if(street != null) userLocationRepository.findByStreet(street);
        return products;
    }

    public void saveUserLocation(UserLocation street) {
        log.info("Saving new {}",street);
        userLocationRepository.save(street);
    }

    public void deleteUserLocation(Long id) {
        userLocationRepository.deleteById(id);
    }

    public UserLocation getUserLocationById(Long id) {
        return userLocationRepository.findById(id).orElse(null);
    }
}