package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by emarsiw on 2018-02-20.
 */

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{
}
