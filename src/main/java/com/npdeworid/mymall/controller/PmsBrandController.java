package com.npdeworid.mymall.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.npdeworid.mymall.common.api.CommonResult;
import com.npdeworid.mymall.mbg.model.PmsBrand;
import com.npdeworid.mymall.service.IPmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author npdeworid
 * @since 2023-05-08 10:30:55
 */
@Api(tags = "PmsBrandController",description = "商品品牌管理")
@RestController
@RequestMapping("/pmsBrand")
public class PmsBrandController {
    @Autowired
    private IPmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @ApiOperation("获取指定id的品牌详情")
    @GetMapping("/get/{id}")
    public CommonResult<PmsBrand> getBrandById(@PathVariable Long id){
        return CommonResult.success(pmsBrandService.getBrandById(id));
    }

    @ApiOperation("获取所有的品牌详情信息")
    @GetMapping("/get/all")
    public CommonResult<List<PmsBrand>> getAllBrand(){
        return CommonResult.success(pmsBrandService.getAllBrand());
    }

}

