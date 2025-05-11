package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.service.FruitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    private final FruitService service;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/add")
    public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(fruitService.createFruit(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(fruitService.updateFruit(fruit));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable int id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable int id) {
        return ResponseEntity.ok(fruitService.getFruit(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        return ResponseEntity.ok(fruitService.getAllFruits());
    }
}