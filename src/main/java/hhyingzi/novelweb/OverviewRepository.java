package hhyingzi.novelweb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "overview", path="overview")
public interface OverviewRepository extends MongoRepository<Overview, String> {
    List<Overview> findAll();

    List<Overview> findByTitle(@Param("title") String title);
}
