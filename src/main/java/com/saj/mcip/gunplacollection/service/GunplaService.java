package com.saj.mcip.gunplacollection.service;

import com.saj.mcip.gunplacollection.model.entity.GunplaEntity;

import java.util.Optional;

public interface GunplaService {

    GunplaEntity create(final GunplaEntity pEntity);

    Optional<GunplaEntity> read(final int pId);

    Optional<GunplaEntity> update(final int pId, final GunplaEntity pEntity);

    boolean delete(final int pId);
}
