package com.npdeworid.mymall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.npdeworid.mymall.mbg.model.PmsBrand;
import com.npdeworid.mymall.mbg.mapper.PmsBrandMapper;
import com.npdeworid.mymall.service.IPmsBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author npdeworid
 * @since 2023-05-08 10:30:55
 */
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements IPmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;
    @Override
    public PmsBrand getBrandById(Long id) {
        return pmsBrandMapper.getBrandById(id);
    }

    @Override
    public List<PmsBrand> getAllBrand() {
        return pmsBrandMapper.selectList(null);
    }

}
