package com.example.magazin.services;

import com.example.magazin.models.Basket;
import com.example.magazin.repositories.BasketRepozsitory;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Data
public class BasketService {
    private final BasketRepozsitory basketRepozsitory;

    public List<Basket> listBasket(String title) {
        List<Basket> products = basketRepozsitory.findAll();
        if(title != null) basketRepozsitory.findByTitle(title);
        return products;
    }


    public void saveBasket(Basket product) {
        log.info("Saving ne {}",product);
        basketRepozsitory.save(product);
    }

    public void deleteBasket() {
        basketRepozsitory.deleteAll();
    }


}
