package com.example.buysell.controllers;

import com.example.buysell.models.Basket;
import com.example.buysell.services.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;
    @PostMapping("/basket/create")
    public String createbacket(Basket basket) {
        basketService.saveBasket(basket);
        return "redirect:/";
    }
    @PostMapping("/basket/delete")//удаляет товар
    public String deleteBasket() {
        basketService.deleteBasket();
        return "redirect:/";
    }

    @GetMapping("/basket")
    public String basket(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("baskets", basketService.listBasket(title));
        List<Basket> baskets = new ArrayList<>();
        baskets = basketService.listBasket(title);
        int temp = 0;
        for (int i = 0; i<baskets.size(); i++){
            temp += baskets.get(i).getPrice();
        }
        model.addAttribute("price",temp);

        return "basket";
    }
}
