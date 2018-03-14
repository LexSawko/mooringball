package com.iba.mooringball.service;

import com.iba.mooringball.entity.Harbor;

import java.util.List;

public interface HarborService {

    List<Harbor> getHarbors();
    Harbor getHarborById(Long id);
    Harbor addHarbor(Harbor harbor);
    Harbor updateHarbor(Harbor harbor);
    void deleteHarbor(Long id);

}
