
package com.xmg.mall.product.service.impl;

import com.xmg.mall.product.service.BrandService;
import com.xmg.mall.product.service.CatalogPropertyService;
import com.xmg.mall.product.service.CatalogPropertyValueService;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.service.ImpressionService;
import com.xmg.mall.product.service.ProductAuditService;
import com.xmg.mall.product.service.ProductCatalogPropertyValueService;
import com.xmg.mall.product.service.ProductDescriptionService;
import com.xmg.mall.product.service.ProductFreightService;
import com.xmg.mall.product.service.ProductImageService;
import com.xmg.mall.product.service.ProductImpressionService;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.service.ProductService;
import com.xmg.mall.product.service.ProductSkuPropertySequenceService;
import com.xmg.mall.product.service.SkuPropertyRelationshipValueService;
import com.xmg.mall.product.service.SkuPropertyService;
import com.xmg.mall.product.service.SkuPropertyValueService;
import com.xmg.mall.product.service.SkuService;
import com.xmg.mall.product.service.TotalBrandService;
import com.xmg.mall.product.service.TotalCatalogPropertyService;
import com.xmg.mall.product.service.TotalCatalogPropertyValueService;
import com.xmg.mall.product.service.TotalCatalogService;
import com.xmg.mall.product.service.TotalImpressionService;
import com.xmg.mall.product.service.TotalProductAuditService;
import com.xmg.mall.product.service.TotalProductCatalogPropertyValueService;
import com.xmg.mall.product.service.TotalProductDescriptionService;
import com.xmg.mall.product.service.TotalProductFreightService;
import com.xmg.mall.product.service.TotalProductImageService;
import com.xmg.mall.product.service.TotalProductImpressionService;
import com.xmg.mall.product.service.TotalProductService;
import com.xmg.mall.product.service.TotalProductSkuPropertySequenceService;
import com.xmg.mall.product.service.TotalSkuPropertyRelationshipValueService;
import com.xmg.mall.product.service.TotalSkuPropertyService;
import com.xmg.mall.product.service.TotalSkuPropertyValueService;
import com.xmg.mall.product.service.TotalSkuService;
import org.springframework.stereotype.Service;

@Service("productModuleService")
public class BasicProductModuleService
    implements ProductModuleService
{

    protected BrandService brandService;
    protected TotalBrandService totalBrandService;
    protected CatalogService catalogService;
    protected TotalCatalogService totalCatalogService;
    protected CatalogPropertyService catalogPropertyService;
    protected TotalCatalogPropertyService totalCatalogPropertyService;
    protected CatalogPropertyValueService catalogPropertyValueService;
    protected TotalCatalogPropertyValueService totalCatalogPropertyValueService;
    protected ImpressionService impressionService;
    protected TotalImpressionService totalImpressionService;
    protected ProductService productService;
    protected TotalProductService totalProductService;
    protected ProductDescriptionService productDescriptionService;
    protected TotalProductDescriptionService totalProductDescriptionService;
    protected ProductImageService productImageService;
    protected TotalProductImageService totalProductImageService;
    protected ProductImpressionService productImpressionService;
    protected TotalProductImpressionService totalProductImpressionService;
    protected ProductFreightService productFreightService;
    protected TotalProductFreightService totalProductFreightService;
    protected ProductAuditService productAuditService;
    protected TotalProductAuditService totalProductAuditService;
    protected ProductCatalogPropertyValueService productCatalogPropertyValueService;
    protected TotalProductCatalogPropertyValueService totalProductCatalogPropertyValueService;
    protected SkuService skuService;
    protected TotalSkuService totalSkuService;
    protected SkuPropertyService skuPropertyService;
    protected TotalSkuPropertyService totalSkuPropertyService;
    protected SkuPropertyRelationshipValueService skuPropertyRelationshipValueService;
    protected TotalSkuPropertyRelationshipValueService totalSkuPropertyRelationshipValueService;
    protected ProductSkuPropertySequenceService productSkuPropertySequenceService;
    protected TotalProductSkuPropertySequenceService totalProductSkuPropertySequenceService;
    protected SkuPropertyValueService skuPropertyValueService;
    protected TotalSkuPropertyValueService totalSkuPropertyValueService;

    public BrandService getBrandService() {
        return this.brandService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setBrandService(BrandService brandService) {
        this.brandService = brandService;
        return this;
    }

    public TotalBrandService getTotalBrandService() {
        return this.totalBrandService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalBrandService(TotalBrandService totalBrandService) {
        this.totalBrandService = totalBrandService;
        return this;
    }

    public CatalogService getCatalogService() {
        return this.catalogService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
        return this;
    }

    public TotalCatalogService getTotalCatalogService() {
        return this.totalCatalogService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalCatalogService(TotalCatalogService totalCatalogService) {
        this.totalCatalogService = totalCatalogService;
        return this;
    }

    public CatalogPropertyService getCatalogPropertyService() {
        return this.catalogPropertyService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setCatalogPropertyService(CatalogPropertyService catalogPropertyService) {
        this.catalogPropertyService = catalogPropertyService;
        return this;
    }

    public TotalCatalogPropertyService getTotalCatalogPropertyService() {
        return this.totalCatalogPropertyService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalCatalogPropertyService(TotalCatalogPropertyService totalCatalogPropertyService) {
        this.totalCatalogPropertyService = totalCatalogPropertyService;
        return this;
    }

    public CatalogPropertyValueService getCatalogPropertyValueService() {
        return this.catalogPropertyValueService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setCatalogPropertyValueService(CatalogPropertyValueService catalogPropertyValueService) {
        this.catalogPropertyValueService = catalogPropertyValueService;
        return this;
    }

    public TotalCatalogPropertyValueService getTotalCatalogPropertyValueService() {
        return this.totalCatalogPropertyValueService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalCatalogPropertyValueService(TotalCatalogPropertyValueService totalCatalogPropertyValueService) {
        this.totalCatalogPropertyValueService = totalCatalogPropertyValueService;
        return this;
    }

    public ImpressionService getImpressionService() {
        return this.impressionService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setImpressionService(ImpressionService impressionService) {
        this.impressionService = impressionService;
        return this;
    }

    public TotalImpressionService getTotalImpressionService() {
        return this.totalImpressionService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalImpressionService(TotalImpressionService totalImpressionService) {
        this.totalImpressionService = totalImpressionService;
        return this;
    }

    public ProductService getProductService() {
        return this.productService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setProductService(ProductService productService) {
        this.productService = productService;
        return this;
    }

    public TotalProductService getTotalProductService() {
        return this.totalProductService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalProductService(TotalProductService totalProductService) {
        this.totalProductService = totalProductService;
        return this;
    }

    public ProductDescriptionService getProductDescriptionService() {
        return this.productDescriptionService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setProductDescriptionService(ProductDescriptionService productDescriptionService) {
        this.productDescriptionService = productDescriptionService;
        return this;
    }

    public TotalProductDescriptionService getTotalProductDescriptionService() {
        return this.totalProductDescriptionService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalProductDescriptionService(TotalProductDescriptionService totalProductDescriptionService) {
        this.totalProductDescriptionService = totalProductDescriptionService;
        return this;
    }

    public ProductImageService getProductImageService() {
        return this.productImageService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setProductImageService(ProductImageService productImageService) {
        this.productImageService = productImageService;
        return this;
    }

    public TotalProductImageService getTotalProductImageService() {
        return this.totalProductImageService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalProductImageService(TotalProductImageService totalProductImageService) {
        this.totalProductImageService = totalProductImageService;
        return this;
    }

    public ProductImpressionService getProductImpressionService() {
        return this.productImpressionService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setProductImpressionService(ProductImpressionService productImpressionService) {
        this.productImpressionService = productImpressionService;
        return this;
    }

    public TotalProductImpressionService getTotalProductImpressionService() {
        return this.totalProductImpressionService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalProductImpressionService(TotalProductImpressionService totalProductImpressionService) {
        this.totalProductImpressionService = totalProductImpressionService;
        return this;
    }

    public ProductFreightService getProductFreightService() {
        return this.productFreightService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setProductFreightService(ProductFreightService productFreightService) {
        this.productFreightService = productFreightService;
        return this;
    }

    public TotalProductFreightService getTotalProductFreightService() {
        return this.totalProductFreightService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalProductFreightService(TotalProductFreightService totalProductFreightService) {
        this.totalProductFreightService = totalProductFreightService;
        return this;
    }

    public ProductAuditService getProductAuditService() {
        return this.productAuditService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setProductAuditService(ProductAuditService productAuditService) {
        this.productAuditService = productAuditService;
        return this;
    }

    public TotalProductAuditService getTotalProductAuditService() {
        return this.totalProductAuditService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalProductAuditService(TotalProductAuditService totalProductAuditService) {
        this.totalProductAuditService = totalProductAuditService;
        return this;
    }

    public ProductCatalogPropertyValueService getProductCatalogPropertyValueService() {
        return this.productCatalogPropertyValueService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setProductCatalogPropertyValueService(ProductCatalogPropertyValueService productCatalogPropertyValueService) {
        this.productCatalogPropertyValueService = productCatalogPropertyValueService;
        return this;
    }

    public TotalProductCatalogPropertyValueService getTotalProductCatalogPropertyValueService() {
        return this.totalProductCatalogPropertyValueService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalProductCatalogPropertyValueService(TotalProductCatalogPropertyValueService totalProductCatalogPropertyValueService) {
        this.totalProductCatalogPropertyValueService = totalProductCatalogPropertyValueService;
        return this;
    }

    public SkuService getSkuService() {
        return this.skuService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setSkuService(SkuService skuService) {
        this.skuService = skuService;
        return this;
    }

    public TotalSkuService getTotalSkuService() {
        return this.totalSkuService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalSkuService(TotalSkuService totalSkuService) {
        this.totalSkuService = totalSkuService;
        return this;
    }

    public SkuPropertyService getSkuPropertyService() {
        return this.skuPropertyService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setSkuPropertyService(SkuPropertyService skuPropertyService) {
        this.skuPropertyService = skuPropertyService;
        return this;
    }

    public TotalSkuPropertyService getTotalSkuPropertyService() {
        return this.totalSkuPropertyService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalSkuPropertyService(TotalSkuPropertyService totalSkuPropertyService) {
        this.totalSkuPropertyService = totalSkuPropertyService;
        return this;
    }

    public SkuPropertyRelationshipValueService getSkuPropertyRelationshipValueService() {
        return this.skuPropertyRelationshipValueService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setSkuPropertyRelationshipValueService(SkuPropertyRelationshipValueService skuPropertyRelationshipValueService) {
        this.skuPropertyRelationshipValueService = skuPropertyRelationshipValueService;
        return this;
    }

    public TotalSkuPropertyRelationshipValueService getTotalSkuPropertyRelationshipValueService() {
        return this.totalSkuPropertyRelationshipValueService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalSkuPropertyRelationshipValueService(TotalSkuPropertyRelationshipValueService totalSkuPropertyRelationshipValueService) {
        this.totalSkuPropertyRelationshipValueService = totalSkuPropertyRelationshipValueService;
        return this;
    }

    public ProductSkuPropertySequenceService getProductSkuPropertySequenceService() {
        return this.productSkuPropertySequenceService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setProductSkuPropertySequenceService(ProductSkuPropertySequenceService productSkuPropertySequenceService) {
        this.productSkuPropertySequenceService = productSkuPropertySequenceService;
        return this;
    }

    public TotalProductSkuPropertySequenceService getTotalProductSkuPropertySequenceService() {
        return this.totalProductSkuPropertySequenceService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalProductSkuPropertySequenceService(TotalProductSkuPropertySequenceService totalProductSkuPropertySequenceService) {
        this.totalProductSkuPropertySequenceService = totalProductSkuPropertySequenceService;
        return this;
    }

    public SkuPropertyValueService getSkuPropertyValueService() {
        return this.skuPropertyValueService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setSkuPropertyValueService(SkuPropertyValueService skuPropertyValueService) {
        this.skuPropertyValueService = skuPropertyValueService;
        return this;
    }

    public TotalSkuPropertyValueService getTotalSkuPropertyValueService() {
        return this.totalSkuPropertyValueService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicProductModuleService setTotalSkuPropertyValueService(TotalSkuPropertyValueService totalSkuPropertyValueService) {
        this.totalSkuPropertyValueService = totalSkuPropertyValueService;
        return this;
    }

}
