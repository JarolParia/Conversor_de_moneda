package com.alura.reto.models;

import java.time.LocalDateTime;

public record Conversiones(String base,
                           String destino,
                           double cantidad,
                           double resultado,
                           LocalDateTime fecha
) {}
