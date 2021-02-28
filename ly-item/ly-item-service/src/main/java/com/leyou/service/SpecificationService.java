package com.leyou.service;

import com.leyou.item.pojo.Specification;
import com.leyou.mapper.SpecificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Panjr
 * @create 2020-04-27 15:54
 */
@Service
public class SpecificationService {

    @Autowired(required = false)
    private SpecificationMapper specificationMapper;

    public Specification queryById(Long id){
        return  this.specificationMapper.selectByPrimaryKey(id);
    }
}
