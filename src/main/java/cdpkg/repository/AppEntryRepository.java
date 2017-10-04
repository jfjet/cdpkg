package cdpkg.repository;

import cdpkg.model.AppEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AppEntryRepository extends CrudRepository<AppEntry, Long> {
    // TO-DO: Search by predicates
    // public List<AppEntry> findAll(Predicate predicate);
}
