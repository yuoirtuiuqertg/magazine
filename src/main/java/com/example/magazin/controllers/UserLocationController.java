package com.example.magazin.controllers;


import com.example.magazin.models.UserLocation;
import com.example.magazin.services.UserLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserLocationController {
    private final UserLocationService userLocationService;

    @GetMapping("/userLocation")
    public String location(@RequestParam(name ="street",required = false)String street , Model model){
        model.addAttribute("locations",userLocationService.listUserLocation(street));
        return "location";
    }

    @GetMapping("/userLocation/{id}")// получает информацию о странице
    public String userLocationInfo(@PathVariable Long id, Model model) {
        model.addAttribute("location", userLocationService.getUserLocationById(id));
        return "userLocation-info";
    }

    @PostMapping("/userLocation/create")//создает товар
    public String createProduct(UserLocation street) {
        userLocationService.saveUserLocation(street);
        return "redirect:/userLocation";
    }

    @PostMapping("/userLocation/delete/{id}")//удаляет товар
    public String deleteProduct(@PathVariable Long id) {
        userLocationService.deleteUserLocation(id);
        return "redirect:/userLocation";
    }


}
