package com.saj.mcip.gunplacollection.util;

import com.saj.mcip.gunplacollection.model.dto.GunplaDto;
import com.saj.mcip.gunplacollection.model.dto.MemberDto;
import com.saj.mcip.gunplacollection.model.entity.GunplaEntity;
import com.saj.mcip.gunplacollection.model.entity.MemberEntity;

public class Util {
    public static GunplaDto toDto(final GunplaEntity pEntity) {
        return new GunplaDto(   pEntity.getId(),
                                pEntity.getLine(),
                                pEntity.getModel(),
                                pEntity.getSeries(),
                                pEntity.getReleaseDate(),
                                pEntity.getGrade(),
                                pEntity.getDescription()
        );
    }

    public static MemberDto toDto(final MemberEntity pEntity) {
        return new MemberDto(   pEntity.getId(),
                pEntity.getFirstName(),
                pEntity.getLastName(),
                pEntity.getUserName(),
                pEntity.getEmail()
        );
    }

    public static GunplaEntity toEntity(final GunplaDto pDto) {
        return GunplaEntity.of( pDto.getId(),
                                pDto.getLine(),
                                pDto.getModel(),
                                pDto.getSeries(),
                                pDto.getReleaseDate(),
                                pDto.getGrade(),
                                pDto.getDescription()
        );
    }

    public static MemberEntity toEntity(final MemberDto pDto) {
        return MemberEntity.of( pDto.getId(),
                pDto.getFirstName(),
                pDto.getLastName(),
                pDto.getUserName(),
                pDto.getEmail()
        );
    }
}
