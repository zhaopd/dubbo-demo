package com.wish.dubboservice.service.impl;

import com.wish.house.api.HouseService;
import com.wish.model.House;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service(group = "chenmy")
public class HouseTmpServiceImpl implements HouseService {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<House> getAll() {
        log.info("访问getALL接口");
        return null;
    }

    @Override
    public House getById(Integer id) {
        log.info("访问getById接口");
        return null;
    }
}
