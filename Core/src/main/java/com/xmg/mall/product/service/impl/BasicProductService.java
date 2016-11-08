
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.mapper.ProductMapper;
import com.xmg.mall.product.qo.ProductQuery;
import com.xmg.mall.product.service.ProductService;
import com.xmg.mall.product.vo.ExtendedProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class BasicProductService
    implements ProductService
{

    private ProductMapper productMapper;

    @Autowired
    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public Product getProduct(Long id) {
        return productMapper.get(id);
    }

    protected void updateProduct(Product product) {
        int affected = productMapper.update(product);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        product.increaseVersion();
    }

    protected Product addProduct(Product product) {
        product.setCreatedDate(new Date());
        productMapper.add(product);
        return product;
    }

    @Override
    public List<ExtendedProduct> listProducts(ProductQuery qo) {
        return productMapper.query(qo);
    }

    @Override
    public ExtendedProduct queryOneProduct(ProductQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProduct> datas = productMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProduct> queryProducts(ProductQuery qo) {
        int rows = productMapper.count(qo);
        List<ExtendedProduct> datas = ((rows == 0)?new ArrayList<ExtendedProduct>():productMapper.query(qo));
        return new Pagination<ExtendedProduct>(rows, datas);
    }

    @Override
    public int countProducts(ProductQuery qo) {
        return productMapper.count(qo);
    }

}
