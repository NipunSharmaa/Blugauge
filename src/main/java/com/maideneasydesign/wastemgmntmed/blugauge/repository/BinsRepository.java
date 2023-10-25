package com.maideneasydesign.wastemgmntmed.blugauge.repository;

import com.maideneasydesign.wastemgmntmed.blugauge.model.Bins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BinsRepository extends JpaRepository<Bins, Integer> {

    @Query("SELECT u FROM bins WHERE u.user_name=:username")
    List<Bins> getAllBins(@Param(value="username") String userName);

    @Query("SELECT u FROM bins u WHERE u.user_name=:username AND u.bin_id = :id")
    Bins getBinById(@Param(value="username") String userName, @Param(value="id") String id);
}
