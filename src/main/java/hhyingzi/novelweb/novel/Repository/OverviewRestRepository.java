package hhyingzi.novelweb.novel.Repository;

import hhyingzi.novelweb.novel.Entity.Overview;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "overview", path="overview")
public interface OverviewRestRepository extends MongoRepository<Overview, String> {
    List<Overview> findAll();

    List<Overview> findAllOrderByTitle();

    List<Overview> findByTitle(@Param("title") String title);
}
