package com.cengizhan.basicgraphql.service;

import com.cengizhan.basicgraphql.dto.League;
import com.cengizhan.basicgraphql.dto.Team;
import com.cengizhan.basicgraphql.dto.TeamInput;
import com.cengizhan.basicgraphql.repository.LeagueRepository;
import com.cengizhan.basicgraphql.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    LeagueRepository leagueRepository;

    public Team createTeam(TeamInput teamInput,String leagueName){
        Team team = new Team();
        team.setName(teamInput.getName());
        team.setPlayerCount(teamInput.getPlayerCount());
        team.setLeague(getPlayerLeague(leagueName));
        return teamRepository.save(team);
    }

    public Team team(String name){
        return teamRepository.findTeamByName(name);
    }

    public List<Team> teams(){
        return teamRepository.findAll();
    }

    private League getPlayerLeague(String leagueName){
        return leagueRepository.findLeagueByName(leagueName);
    }

}
