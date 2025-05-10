package com.vendasflux.dashboard.dto;

import java.time.LocalDateTime;
import com.vendasflux.dashboard.model.Schedules;

public class ListSalesDashboardDto {

    private Long id;
    private String nome;
    private String email;
    private String status;
    private LocalDateTime scheduledDateTime;
    private Schedules.Status statusEnum;

    // Construtor
    public ListSalesDashboardDto(Long id, String nome, String email, String status, LocalDateTime scheduledDateTime, Schedules.Status statusEnum) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.status = status;
        this.scheduledDateTime = scheduledDateTime;
        this.statusEnum = statusEnum;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getScheduledDateTime() {
        return scheduledDateTime;
    }

    public void setScheduledDateTime(LocalDateTime scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }

    public Schedules.Status getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(Schedules.Status statusEnum) {
        this.statusEnum = statusEnum;
    }
}
