package com.ipi.nosql;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<Address,String> {

    @Query("{nom_commune : ?0}")
    public Page<Address> trouveParVille(Pageable p,String nom);
}
