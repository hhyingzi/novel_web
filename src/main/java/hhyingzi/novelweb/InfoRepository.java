package hhyingzi.novelweb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "info", path = "info")
public interface InfoRepository extends MongoRepository<Info, String> {
    List<Info> findAll();
    List<Info> findByAuthor(@Param("author") String author);
}
