package com.npdeworid.mymall.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.npdeworid.mymall.mbg.model.PmsBrand;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author npdeworid
 * @since 2023-05-08 10:30:55
 */
public interface IPmsBrandService extends IService<PmsBrand> {

    PmsBrand getBrandById(Long id);

    List<PmsBrand> getAllBrand();

}
