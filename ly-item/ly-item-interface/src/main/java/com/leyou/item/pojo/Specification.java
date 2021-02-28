package com.leyou.item.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Panjr
 * @create 2020-04-27 15:45
 */
@Table(name = "tb_specification")
public class Specification {
    @Id
    private Long categoryId;
    private String specifications;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }
}
