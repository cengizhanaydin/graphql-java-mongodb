package com.cengizhan.basicgraphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Leagues")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class League {

    @Id
    private String id;
    private String name;
    private String foundYear;
    private int teamCount;
}
