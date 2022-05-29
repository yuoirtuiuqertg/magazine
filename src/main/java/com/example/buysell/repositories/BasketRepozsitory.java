package com.example.buysell.repositories;

import com.example.buysell.models.Basket;
import com.example.buysell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasketRepozsitory extends JpaRepository<Basket,Long> {
    List<Basket> findByTitle(String title);

}
