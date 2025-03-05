package com.saj.mcip.gunplacollection.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class MemberDto {

    @JsonProperty("id")
    private final int id;

    @JsonProperty("first_name")
    private final String firstName;

    @JsonProperty("last_name")
    private final String lastName;

    @JsonProperty("user_name")
    private final String userName;

    @JsonProperty("email")
    private final String email;

    public MemberDto(@JsonProperty("id") final int pId,
                     @JsonProperty("first_name") final String pFirstName,
                     @JsonProperty("last_name") final String pLastName,
                     @JsonProperty("user_name") final String pUserName,
                     @JsonProperty("email") final String pEmail) {
        id = pId;
        firstName = pFirstName;
        lastName = pLastName;
        userName = pUserName;
        email = pEmail;

    }

}
