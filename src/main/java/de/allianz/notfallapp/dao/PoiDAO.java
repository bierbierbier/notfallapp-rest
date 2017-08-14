package de.allianz.notfallapp.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import de.allianz.notfallapp.entity.POI;

@Transactional
public interface PoiDAO extends CrudRepository<POI, Long>{

}
