package com.vendasflux.dashboard.repository;

import com.vendasflux.dashboard.dto.ListSalesDashboardDto;
import com.vendasflux.dashboard.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {

    @Query("SELECT new com.vendasflux.dashboard.dto.ListSalesDashboardDto(s.id, c.name, p.name, u.name, s.saleDate, sc.status) "
            + "FROM Sales s "
            + "JOIN s.companies c "
            + "JOIN s.plans p "
            + "JOIN s.users u "
            + "LEFT JOIN s.schedules sc")
    List<ListSalesDashboardDto> findSalesDashboardData();







}
