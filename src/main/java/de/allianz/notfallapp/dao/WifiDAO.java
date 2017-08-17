package de.allianz.notfallapp.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import de.allianz.notfallapp.entity.Wifi;

@Transactional
public interface WifiDAO extends CrudRepository<Wifi, Integer> {

}
