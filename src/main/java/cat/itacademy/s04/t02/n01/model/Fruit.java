package cat.itacademy.s04.t02.n01.model;

import jakarta.persistence.*;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int quantityKilos;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityKilos() {
        return quantityKilos;
    }

    public void setQuantityKilos(int quantityKilos) {
        this.quantityKilos = quantityKilos;
    }
}