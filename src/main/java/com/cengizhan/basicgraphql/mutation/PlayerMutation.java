package com.cengizhan.basicgraphql.mutation;

import com.cengizhan.basicgraphql.dto.Player;
import com.cengizhan.basicgraphql.dto.PlayerInput;
import com.cengizhan.basicgraphql.service.PlayerService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerMutation implements GraphQLMutationResolver {

    @Autowired
    PlayerService playerService;

    public Player createPlayer(PlayerInput playerInput, String teamName, String leagueName){
        return playerService.createPlayer(playerInput,teamName,leagueName);
    }
}
