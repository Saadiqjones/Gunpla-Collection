package com.saj.mcip.gunplacollection.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.saj.mcip.gunplacollection.util.Grade;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GunplaDto {

    @JsonProperty("id")
    private final int id;

    @JsonProperty("line")
    private final String line;

    @JsonProperty("model")
    private final String model;

    @JsonProperty("series")
    private final String series;

    @JsonProperty("release_date")
    private final LocalDateTime releaseDate;

    @JsonProperty("grade")
    private final Grade grade;

    @JsonProperty("description")
    private final String description;

    public GunplaDto(@JsonProperty("id") final int pID,
                     @JsonProperty("line") final String pLine,
                     @JsonProperty("model") final String pModel,
                     @JsonProperty("series") final String pSeries,
                     @JsonProperty("release_date") final LocalDateTime pReleaseDate,
                     @JsonProperty("grade") final Grade pGrade,
                     @JsonProperty("description") final String pDescription) {
        id = pID;
        line = pLine;
        model = pModel;
        series = pSeries;
        releaseDate = pReleaseDate;
        grade = pGrade;
        description = pDescription;
    }
}
