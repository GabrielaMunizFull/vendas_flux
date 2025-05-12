package com.vendasflux.dashboard.controller;

import com.vendasflux.dashboard.dto.ListSalesDashboardDto;
import com.vendasflux.dashboard.model.Schedules;
import com.vendasflux.dashboard.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("vendas_flux/v1/dashboard")
public class Dashboard {

    @Autowired
    private SalesService salesService;

    @GetMapping("/listSales")
    public List<ListSalesDashboardDto> listSales(
            @RequestParam(required = false) String status,
            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate
    ) {
        List<ListSalesDashboardDto> listSalesDashboard = salesService.getListSalesDashboard(status, startDate, endDate);

        return listSalesDashboard;
    }
}
