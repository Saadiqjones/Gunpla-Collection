package com.saj.mcip.gunplacollection.service.impl;

import com.saj.mcip.gunplacollection.model.entity.MemberEntity;
import com.saj.mcip.gunplacollection.repository.MemberRepository;
import com.saj.mcip.gunplacollection.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    @Override
    public MemberEntity create(MemberEntity pEntity) {
        pEntity.setId(-1);
        return memberRepository.save(pEntity);
    }

    @Override
    public Optional<MemberEntity> read(int pId) {
        return memberRepository.findById(pId);
    }

    @Override
    public Optional<MemberEntity> update(int pId, MemberEntity pEntity) {
        if (!memberRepository.existsById(pId)) {
            return Optional.empty();
        }

        pEntity.setId(pId);
        return Optional.of(memberRepository.save(pEntity));
    }

    @Override
    public boolean delete(int pId) {
        if (!memberRepository.existsById(pId)) {
            return false;
        }

        memberRepository.deleteById(pId);
        return true;
    }
}
