package com.Ampara.LifeMatch.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ampara.LifeMatch.model.TemaModel;
@Repository
public interface TemaRepository extends JpaRepository<TemaModel, Long>{

	Optional<TemaModel> findByCategoriaAjuda(String categoriaAjuda);

}
