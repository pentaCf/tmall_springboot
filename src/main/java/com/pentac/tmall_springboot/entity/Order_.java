package com.pentac.tmall_springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author pentaC
 * @since 2021-08-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Order_对象", description="")
public class Order_ implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("orderCode")
    private String ordercode;

    private String address;

    private String post;

    private String receiver;

    private String mobile;

    @TableField("userMessage")
    private String usermessage;

    @TableField("createDate")
    private Date createdate;

    @TableField("payDate")
    private Date paydate;

    @TableField("deliveryDate")
    private Date deliverydate;

    @TableField("confirmDate")
    private Date confirmdate;

    private Integer uid;

    private String status;

    private Date gmtCreate;

    private Date gmtModified;


}
