package com.cengizhan.basicgraphql.mutation;

import com.cengizhan.basicgraphql.dto.Team;
import com.cengizhan.basicgraphql.dto.TeamInput;
import com.cengizhan.basicgraphql.service.TeamService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamMutation implements GraphQLMutationResolver {

    @Autowired
    TeamService teamService;

    public Team createTeam(TeamInput teamInput, String leagueName){
        return teamService.createTeam(teamInput, leagueName);
    }
}
