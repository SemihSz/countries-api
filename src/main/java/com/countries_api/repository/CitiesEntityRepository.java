package com.countries_api.repository;

import com.countries_api.entity.CitiesEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesEntityRepository extends JpaRepository<CitiesEntity, Long> {

//  @Query(value = "SELECT * FROM cities c WHERE c.city LIKE %:city%", nativeQuery = true)
//  List<CitiesEntity> findCitiesByPartialCityName(@Param("city") String city);

  List<CitiesEntity> findCitiesEntitiesByCityContaining(String city);
}