package com.npdeworid.mymall.mbg.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author npdeworid
 * @since 2023-05-08 10:30:55
 */
@Getter
@Setter
@TableName("pms_brand")
@ApiModel(value = "PmsBrand对象", description = "品牌表")
public class PmsBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty("首字母")
    @TableField("first_letter")
    private String firstLetter;

    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("是否为品牌制造商：0->不是；1->是")
    @TableField("factory_status")
    private Integer factoryStatus;

    @TableField("show_status")
    private Integer showStatus;

    @ApiModelProperty("产品数量")
    @TableField("product_count")
    private Integer productCount;

    @ApiModelProperty("产品评论数量")
    @TableField("product_comment_count")
    private Integer productCommentCount;

    @ApiModelProperty("品牌logo")
    @TableField("logo")
    private String logo;

    @ApiModelProperty("专区大图")
    @TableField("big_pic")
    private String bigPic;

    @ApiModelProperty("品牌故事")
    @TableField("brand_story")
    private String brandStory;


}
