package com.cengizhan.basicgraphql.repository;

import com.cengizhan.basicgraphql.dto.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {

    Player getPlayerByLicenseID(String licenseID);
}
