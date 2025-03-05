package com.saj.mcip.gunplacollection.service;

import com.saj.mcip.gunplacollection.model.entity.MemberEntity;

import java.util.Optional;

public interface MemberService {

    MemberEntity create(final MemberEntity pEntity);

    Optional<MemberEntity> read(final int pId);

    Optional<MemberEntity> update(final int pId, final MemberEntity pEntity);

    boolean delete(final int pId);
}
