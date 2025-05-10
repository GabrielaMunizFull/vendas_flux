package com.vendasflux.dashboard.controller;

import com.vendasflux.dashboard.dto.ListSalesDashboardDto;
import com.vendasflux.dashboard.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("vendas_flux/v1/dashboard")
public class Dashboard {

    @Autowired
    private SalesService salesService;

    @GetMapping("/listSales")
    public List<ListSalesDashboardDto> getListSalesDashboard() {
        List<ListSalesDashboardDto> listSalesDashboard = salesService.getListSalesDashboard();

        return listSalesDashboard;
    }
}
