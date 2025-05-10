package com.vendasflux.dashboard.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "companies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Companies {

    public enum Classification {
        GOVERNAMENTAL, SMALL, LARGE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, unique = true, length = 20)
    private String cnpj;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Classification classification;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}
