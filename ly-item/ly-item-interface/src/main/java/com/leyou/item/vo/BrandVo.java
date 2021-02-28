package com.leyou.item.vo;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.List;

/**
 * @author Panjr
 * @create 2020-04-21 9:49
 */
public class BrandVo {

    private Long id;
    private String name;
    private String image;
    private List<Long> cids;
    private Character letter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Long> getCids() {
        return cids;
    }

    public void setCids(List<Long> cids) {
        this.cids = cids;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }
}
