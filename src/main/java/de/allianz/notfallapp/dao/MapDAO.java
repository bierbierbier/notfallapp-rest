package de.allianz.notfallapp.dao;

import javax.transaction.Transactional;
import de.allianz.notfallapp.entity.Map;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface MapDAO extends CrudRepository<Map, Long> {

}
