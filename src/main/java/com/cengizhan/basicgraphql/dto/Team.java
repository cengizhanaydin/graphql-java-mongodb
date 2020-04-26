package com.cengizhan.basicgraphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Teams")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id
    private String id;
    private String name;
    private int playerCount;
    private League league;
}
