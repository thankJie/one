package com.github.thankjie.one.service;

import com.github.thankjie.one.mapper.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IndexService {

    @Resource
    IndexDao dao;

    public String one() {
        return dao.one();
    }
}
