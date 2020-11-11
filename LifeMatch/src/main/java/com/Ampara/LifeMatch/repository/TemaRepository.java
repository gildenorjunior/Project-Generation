package com.Ampara.LifeMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ampara.LifeMatch.model.TemaModel;
@Repository
public interface TemaRepository extends JpaRepository<TemaModel, Long> {

}
