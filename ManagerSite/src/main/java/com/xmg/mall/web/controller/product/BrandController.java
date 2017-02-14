package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.base.upload.FileUploader;
import com.xmg.mall.product.domain.Brand;
import com.xmg.mall.product.qo.BrandQuery;
import com.xmg.mall.product.service.BrandService;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.vo.ExtendedBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("brandController")
@RequestMapping("/brand")
public class BrandController {

    private BrandService brandService;
    private FileUploader fileUploader;

    @Autowired
    public void setFileUploader(FileUploader fileUploader) {
        this.fileUploader = fileUploader;
    }

    @Autowired
    public void setBrandService(BrandService brandService) {
        this.brandService = brandService;
    }

    @RequestMapping("/page")
    public String page() {
        return "product/brand";
    }

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")BrandQuery qo, Model model) {
        Pagination<ExtendedBrand> pagination = brandService.queryBrands(qo);
        model.addAttribute("pagination", pagination);
        model.addAttribute("pages", PaginationUtil.getPages(pagination.getRows(), qo.getPageSize()));
        return "product/brand_list";
    }

    @RequestMapping("/toSaveOrUpdate")
    public String toSaveOrUpdate(Model model, Long id) {
        if(id != null){
            Brand brand = brandService.getBrand(id);
            model.addAttribute("brand", brand);
        }
        return "product/brand_add_or_update";
    }

    @RequestMapping("/toSave")
    public String toSave() {
        return "product/brand_save";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, Long id) {
        Brand brand = brandService.getBrand(id);
        model.addAttribute("brand", brand);
        return "product/brand_update";
    }

    @RequestMapping("/save")
    public String save(Model model, Brand brand, @RequestParam("file")CommonsMultipartFile file) { // 不想 SpringMVC 自动封装实体对象 brand 中的 logo 属性，传参数的时候避免出入与属性名一样的参数，再另外用一个参数接收
        try{
            String filePath = fileUploader.upload(file);
            brand.setLogo(filePath);
            brandService.save(brand);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/brand/page";
    }

    @RequestMapping("/update")
    public String update(Brand brand, @RequestParam("file")CommonsMultipartFile file) {
        try{
            String filePath = fileUploader.upload("brand", null, file);
            brand.setLogo(filePath);
            brandService.update(brand);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/brand/page";
    }

    @RequestMapping("/delete")
    public String delete(Model model, Long id) {
        try{
           brandService.delete(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/brand/page";
    }

}
