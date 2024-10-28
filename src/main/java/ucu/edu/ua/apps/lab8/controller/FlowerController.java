package ucu.edu.ua.apps.lab8.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.apps.lab8.flower.Flower;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {
    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of();
    }
}
