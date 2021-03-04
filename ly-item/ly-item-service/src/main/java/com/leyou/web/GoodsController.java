package com.leyou.web;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.SpuBo;
import com.leyou.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panjr
 * @create 2021-03-03 17:31
 */
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("spu/page")
    public ResponseEntity<PageResult<SpuBo>> querySpuByPage(@RequestParam(value = "page",defaultValue = "1") Integer page,@RequestParam(value = "rows", defaultValue = "5") Integer rows,
                                                            @RequestParam(value = "key", required = false) String key, @RequestParam Boolean saleable){
        PageResult<SpuBo> result = this.goodsService.querySpuByPageAndSort(page,rows,saleable,key);
        if(null == result || result.getItems().size() == 0){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
}
