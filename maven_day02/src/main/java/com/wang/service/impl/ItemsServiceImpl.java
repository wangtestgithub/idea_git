package com.wang.service.impl;

import com.wang.dao.ItemsDao;
import com.wang.domain.Items;
import com.wang.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
