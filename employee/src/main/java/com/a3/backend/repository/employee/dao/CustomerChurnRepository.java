package com.a3.backend.repository.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a3.backend.repository.employee.model.Churn;

@Repository
public interface CustomerChurnRepository extends JpaRepository<Churn, Long> {

}
