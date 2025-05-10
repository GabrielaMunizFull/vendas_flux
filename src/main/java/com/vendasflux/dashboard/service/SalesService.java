package com.vendasflux.dashboard.service;

import com.vendasflux.dashboard.dto.ListSalesDashboardDto;
import com.vendasflux.dashboard.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepository repository;

    public List <ListSalesDashboardDto>  getListSalesDashboard (){

        List <ListSalesDashboardDto> listSalesDashboardDto = repository.findSalesDashboardData();
        return listSalesDashboardDto;
    }
}
