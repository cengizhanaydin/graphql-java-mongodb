package com.cengizhan.basicgraphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Players")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    private String id;
    private String licenseID;
    private String name;
    private String surname;
    private Team team;
    private League league;
}
