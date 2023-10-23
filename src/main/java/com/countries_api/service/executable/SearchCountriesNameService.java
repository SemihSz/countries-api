package com.countries_api.service.executable;

import com.countries_api.mapper.country.CountryMapper;
import com.countries_api.model.Country;
import com.countries_api.repository.CountryEntityRepository;
import com.countries_api.task.SimpleTask;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class SearchCountriesNameService implements SimpleTask<String, List<Country>> {

  private final CountryEntityRepository countryEntityRepository;

  @Override
  public List<Country> apply(String name) {
    return CountryMapper.INSTANCE.convert(countryEntityRepository.findCountryEntitiesByNameContaining(name));
  }
}
