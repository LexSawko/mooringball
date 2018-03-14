package com.iba.mooringball.service.impl;

import com.iba.mooringball.entity.Harbor;
import com.iba.mooringball.repository.HarborRepository;
import com.iba.mooringball.service.HarborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HarborServiceImpl implements HarborService {
    @Autowired
    HarborRepository harborRepository;

    @Override
    public List<Harbor> getHarbors() {
        return harborRepository.findAll();
    }

    @Override
    public Harbor getHarborById(Long id) {
        return harborRepository.getOne(id);
    }

    @Override
    public Harbor addHarbor(Harbor harbor) {
        return harborRepository.save(harbor);
    }

    @Override
    public Harbor updateHarbor(Harbor harbor) {
        return harborRepository.save(harbor);
    }

    @Override
    public void deleteHarbor(Long id) {
        harborRepository.deleteById(id);
    }
}
