package com.alura.reto.models;

public record Moneda(String result,
                     String base_code,
                     String target_code,
                     Double conversion_rate
) {}
