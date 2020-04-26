package com.cengizhan.basicgraphql.query;

import com.cengizhan.basicgraphql.dto.Player;
import com.cengizhan.basicgraphql.service.PlayerService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerQuery implements GraphQLQueryResolver {

    @Autowired
    PlayerService playerService;

    public Player player(String licenseID){
        return playerService.getPlayer(licenseID);
    }

    public List<Player> players(){
        return playerService.getPlayers();
    }
}
