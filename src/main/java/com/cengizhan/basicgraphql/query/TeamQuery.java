package com.cengizhan.basicgraphql.query;

import com.cengizhan.basicgraphql.dto.Team;
import com.cengizhan.basicgraphql.service.TeamService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamQuery implements GraphQLQueryResolver {

    @Autowired
    TeamService teamService;

    public Team team(String name){
        return teamService.team(name);
    }

    public List<Team> teams(){
        return teamService.teams();
    }
}
