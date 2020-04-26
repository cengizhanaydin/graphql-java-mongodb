package com.cengizhan.basicgraphql.query;

import com.cengizhan.basicgraphql.dto.League;
import com.cengizhan.basicgraphql.service.LeagueService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LeagueQuery implements GraphQLQueryResolver {

    @Autowired
    LeagueService leagueService;

    public League league(String name){
        return leagueService.league(name);
    }

    public List<League> leagues(){
        return leagueService.leagues();
    }
}
