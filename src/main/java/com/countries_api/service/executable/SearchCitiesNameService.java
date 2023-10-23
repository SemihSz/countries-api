package com.countries_api.service.executable;

import com.countries_api.mapper.cities.CityMapper;
import com.countries_api.model.city.CityModel;
import com.countries_api.repository.CitiesEntityRepository;
import com.countries_api.task.SimpleTask;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class SearchCitiesNameService implements SimpleTask<String, List<CityModel>> {

  private final CitiesEntityRepository citiesEntityRepository;

  @Override
  public List<CityModel> apply(String name) {

    return CityMapper.INSTANCE.getAllCities(citiesEntityRepository.findCitiesEntitiesByCityContaining(name));
  }
}
