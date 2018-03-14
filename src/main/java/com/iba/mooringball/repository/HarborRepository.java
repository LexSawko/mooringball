package com.iba.mooringball.repository;

import com.iba.mooringball.entity.Harbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarborRepository extends JpaRepository<Harbor,Long> {
}
