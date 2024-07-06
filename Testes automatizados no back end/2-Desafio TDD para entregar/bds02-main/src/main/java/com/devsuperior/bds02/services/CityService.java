package com.devsuperior.bds02.services;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    @Transactional(readOnly = true)
    public List<CityDTO> findAll() {
        List<City> cityList = cityRepository.findAll(Sort.by("name"));
        return cityList.stream().map(x -> new CityDTO(x)).collect(Collectors.toList());
    }

}
