package com.saj.mcip.gunplacollection.service.impl;

import com.saj.mcip.gunplacollection.model.entity.GunplaEntity;
import com.saj.mcip.gunplacollection.repository.GunplaRepository;
import com.saj.mcip.gunplacollection.service.GunplaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GunplaServiceImpl implements GunplaService {

    private final GunplaRepository gunplaRepository;

    @Override
    public GunplaEntity create(GunplaEntity pEntity) {
        pEntity.setId(-1);
        return gunplaRepository.save(pEntity);
    }

    @Override
    public Optional<GunplaEntity> read(int pId) {
        return gunplaRepository.findById(pId);
    }

    @Override
    public Optional<GunplaEntity> update(int pId, GunplaEntity pEntity) {
        if (!gunplaRepository.existsById(pId)) {
            return Optional.empty();
        }

        pEntity.setId(pId);
        return Optional.of(gunplaRepository.save(pEntity));
    }

    @Override
    public boolean delete(int pId) {
        if (!gunplaRepository.existsById(pId)) {
            return false;
        }

        gunplaRepository.deleteById(pId);
        return true;
    }
}
