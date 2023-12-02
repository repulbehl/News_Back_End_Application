package com.newsCorp.newsServices.repository;

import com.newsCorp.newsServices.entity.ExternalApiCoverage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalApiRepo extends JpaRepository<ExternalApiCoverage,Long> {
}
