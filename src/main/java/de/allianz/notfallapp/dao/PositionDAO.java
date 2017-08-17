package de.allianz.notfallapp.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import de.allianz.notfallapp.entity.Position;

@Transactional
public interface PositionDAO extends CrudRepository<Position, Integer>{

}
