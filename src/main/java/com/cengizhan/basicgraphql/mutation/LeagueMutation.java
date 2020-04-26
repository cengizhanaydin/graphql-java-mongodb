package com.cengizhan.basicgraphql.mutation;

import com.cengizhan.basicgraphql.dto.League;
import com.cengizhan.basicgraphql.dto.LeagueInput;
import com.cengizhan.basicgraphql.service.LeagueService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeagueMutation implements GraphQLMutationResolver {

    @Autowired
    LeagueService leagueService;

    public League createLeague(LeagueInput leagueInput){
        return leagueService.createLeague(leagueInput);
    }
}
