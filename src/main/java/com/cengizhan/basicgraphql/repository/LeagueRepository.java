package com.cengizhan.basicgraphql.repository;

import com.cengizhan.basicgraphql.dto.League;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends MongoRepository<League, String> {

    League findLeagueByName(String name);
}
