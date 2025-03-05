package com.saj.mcip.gunplacollection.repository;

import com.saj.mcip.gunplacollection.model.entity.GunplaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GunplaRepository extends CrudRepository<GunplaEntity, Integer> {
}
