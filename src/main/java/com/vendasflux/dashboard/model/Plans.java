package com.vendasflux.dashboard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "plans")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private char category; // 'I' para Internet, 'T' para Telefonia

    @Column(name = "exclusive_b2b")
    private boolean exclusiveB2b = false;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
}
