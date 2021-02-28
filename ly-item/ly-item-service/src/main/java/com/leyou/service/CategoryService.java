package com.leyou.service;

import com.leyou.item.pojo.Category;

import com.leyou.mapper.CategoryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Panjr
 * @create 2020-03-02 17:59
 */
@Service
public class CategoryService {

    @Autowired(required = false)
    private CategoryMapper categoryMapper;

    public List<Category> queryListByParent(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        return this.categoryMapper.select(category);
    }

    public List<Category> queryByBrandId(Long bid) {
        return this.categoryMapper.queryByBrandId(bid);
    }
}
