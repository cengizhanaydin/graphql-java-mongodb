package com.cengizhan.basicgraphql.service;

import com.cengizhan.basicgraphql.dto.League;
import com.cengizhan.basicgraphql.dto.Player;
import com.cengizhan.basicgraphql.dto.PlayerInput;
import com.cengizhan.basicgraphql.dto.Team;
import com.cengizhan.basicgraphql.repository.LeagueRepository;
import com.cengizhan.basicgraphql.repository.PlayerRepository;
import com.cengizhan.basicgraphql.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    LeagueRepository leagueRepository;

    public Player createPlayer(PlayerInput playerInput, String teamName, String leagueName){
        Player player = new Player();
        player.setName(playerInput.getName());
        player.setSurname(playerInput.getSurname());
        player.setLicenseID(playerInput.getLicenseID());
        player.setTeam(getPlayerTeam(teamName));
        player.setLeague(getPlayerLeague(leagueName));
        return playerRepository.save(player);
    }

    public Player getPlayer(String licenseID){
        return playerRepository.getPlayerByLicenseID(licenseID);
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

    private Team getPlayerTeam(String teamName){
        return teamRepository.findTeamByName(teamName);
    }

    private League getPlayerLeague(String leagueName){
        return leagueRepository.findLeagueByName(leagueName);
    }
}
