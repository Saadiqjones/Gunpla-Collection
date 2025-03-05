package com.saj.mcip.gunplacollection.repository;

import com.saj.mcip.gunplacollection.model.entity.MemberEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<MemberEntity, Integer> {
}
