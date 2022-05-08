package com.example.viladevinhouse.security.repository;

import com.example.viladevinhouse.security.model.Vila;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilaRepository extends JpaRepository <Vila, Long> {
}
