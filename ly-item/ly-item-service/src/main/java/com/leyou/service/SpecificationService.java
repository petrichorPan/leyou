package com.leyou.service;

import com.leyou.item.pojo.Brand;
import com.leyou.item.pojo.Specification;
import com.leyou.mapper.SpecificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void saveSpecification(Specification specification) {
        // 新增品牌信息
        this.specificationMapper.insert(specification);
    }
}
