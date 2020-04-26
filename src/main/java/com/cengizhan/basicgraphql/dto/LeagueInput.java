package com.cengizhan.basicgraphql.dto;

import lombok.Data;

@Data
public class LeagueInput {

    private String name;
    private String foundYear;
    private int teamCount;
}
