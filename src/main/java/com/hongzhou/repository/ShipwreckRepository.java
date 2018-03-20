package com.hongzhou.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hongzhou.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
