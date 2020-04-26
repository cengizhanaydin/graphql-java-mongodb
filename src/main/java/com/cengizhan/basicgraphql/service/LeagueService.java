package com.cengizhan.basicgraphql.service;

import com.cengizhan.basicgraphql.dto.League;
import com.cengizhan.basicgraphql.dto.LeagueInput;
import com.cengizhan.basicgraphql.repository.LeagueRepository;
import com.cengizhan.basicgraphql.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {

    @Autowired
    LeagueRepository leagueRepository;

    public League createLeague(LeagueInput leagueInput){
        League league = new League();
        league.setName(leagueInput.getName());
        league.setFoundYear(leagueInput.getFoundYear());
        league.setTeamCount(leagueInput.getTeamCount());

        return leagueRepository.save(league);
    }

    public League league(String name){
        return leagueRepository.findLeagueByName(name);
    }

    public List<League> leagues(){
        return leagueRepository.findAll();
    }
}
