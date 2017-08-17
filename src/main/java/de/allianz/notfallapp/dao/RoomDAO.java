package de.allianz.notfallapp.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import de.allianz.notfallapp.entity.Room;

@Transactional
public interface RoomDAO extends CrudRepository<Room, Integer> {

}
