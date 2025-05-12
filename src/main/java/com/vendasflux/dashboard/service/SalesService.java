package com.vendasflux.dashboard.service;

import com.vendasflux.dashboard.dto.ListSalesDashboardDto;
import com.vendasflux.dashboard.model.Schedules;
import com.vendasflux.dashboard.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepository repository;

    public List <ListSalesDashboardDto>  getListSalesDashboard ( String status,
                                                                 LocalDateTime startDate,
                                                                 LocalDateTime endDate){

        List <ListSalesDashboardDto> listSalesDashboardDto = repository.findSalesDashboardData(status,startDate,endDate);
        return listSalesDashboardDto;
    }
}
