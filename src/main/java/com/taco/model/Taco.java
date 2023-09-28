package com.taco.model;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "name must be at least 5 characters")
    private String name;
    @NotNull
    @Size(min = 1, message = "you must choose 1 ingredient at least")
    private List<Ingredient> ingredients;
}
