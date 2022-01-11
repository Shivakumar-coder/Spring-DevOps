package com.thbs.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.thbs.entity.Jewels;


public interface JewelRepository extends JpaRepository<Jewels, Integer> {
	

}
