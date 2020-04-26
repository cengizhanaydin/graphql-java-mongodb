package com.cengizhan.basicgraphql.repository;

import com.cengizhan.basicgraphql.dto.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends MongoRepository<Team,String> {

    Team findTeamByName(String name);
}
