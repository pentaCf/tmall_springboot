package com.pentac.tmall_springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;


/**
 * <p>
 *
 * @author pentaC
 * @TableName 表名-类名
 * @TableId 主键
 * // 对实体类的编写，对主键以及外键进行注解
 * // 如果既没有指明 关联到哪个Column,又没有明确要用@Transient忽略，那么就会自动关联到表对应的同名字段
 *
 * // 前后端交互时，Category 对象就会被转换为 json 数据。
 * // 并添加 handler 和 hibernateLazyInitializer 这两个无须json化的属性，所以这里需要用JsonIgnoreProperties把这两个属性忽略掉。
 * </p>
 * @since 2021-08-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Category对象", description = "")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    //主键，id自增
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    //首页中，为了查询分类下的产品。因而需要这几个字段，但是本身数据库是不存储的
/*    @Transient
    List<Product> products;
    @Transient
    List<List<Product>> productsByRow;*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<List<Product>> getProductsByRow() {
        return productsByRow;
    }

    public void setProductsByRow(List<List<Product>> productsByRow) {
        this.productsByRow = productsByRow;
    }*/
}
