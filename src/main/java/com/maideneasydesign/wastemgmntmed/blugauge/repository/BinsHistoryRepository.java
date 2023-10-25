package com.maideneasydesign.wastemgmntmed.blugauge.repository;

import com.maideneasydesign.wastemgmntmed.blugauge.model.Bins;
import com.maideneasydesign.wastemgmntmed.blugauge.model.BinsHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public interface BinsHistoryRepository extends PagingAndSortingRepository<BinsHistory,Integer> {

    @Override
    List<BinsHistory> findAll();

    @Query("Select u from bins_history u where u.bin_id=?1")
    List<BinsHistory> findBidId(String id);

    @Query("SELECT u FROM bins_history u WHERE u.last_updated between :startDate and :endDate")
    List<BinsHistory> getData(@Param("startDate")Timestamp startDate, @Param("endDate") Timestamp endDate);

    @Query("SELECT u FROM bins_history u WHERE u.last_updated between :startDate and :endDate" )
    List<BinsHistory> getDateData(@Param("startDate")Date startDate , @Param("endDate") Date endDate);
}
