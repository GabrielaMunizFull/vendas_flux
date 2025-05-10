package com.vendasflux.dashboard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "sales")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Companies companies;

    @ManyToOne(optional = false)
    @JoinColumn(name = "plan_id")
    private Plans plans;

    @Column(name = "sale_date", nullable = false)
    private LocalDateTime saleDate;

    @Column(name = "status_schedule_b2b")
    private Integer statusScheduleB2b; // 1 = Agendado, 2 = Pendente, 3 = Concluído

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}
