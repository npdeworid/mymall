package com.npdeworid.mymall.mbg.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.npdeworid.mymall.mbg.model.PmsBrand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 品牌表 Mapper 接口
 * </p>
 *
 * @author npdeworid
 * @since 2023-05-08 10:30:55
 */
@Mapper
public interface PmsBrandMapper extends BaseMapper<PmsBrand> {

    PmsBrand getBrandById(@Param("id") Long id);

    List<PmsBrand> getAllBrand();

}
