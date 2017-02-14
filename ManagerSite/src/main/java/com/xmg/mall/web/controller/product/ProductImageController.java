package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.upload.FileUploader;
import com.xmg.mall.product.domain.ProductImage;
import com.xmg.mall.product.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.IOException;

/**
 * Created by lony on 2017/2/11.
 */
@Controller("productImageController")
@RequestMapping("/productImage")
public class ProductImageController {

    private FileUploader fileUploader;
    private ProductImageService productImageService;

    @Autowired
    public void setProductImageService(ProductImageService productImageService) {
        this.productImageService = productImageService;
    }

    @Autowired
    public void setFileUploader(FileUploader fileUploader) {
        this.fileUploader = fileUploader;
    }

    @RequestMapping("/upload")
    @ResponseBody
    public ProductImage upload(@RequestParam("file") MultipartFile file, Integer sequence, Boolean cover) {
        ProductImage productImage = new ProductImage();
        try {
            String filePath = fileUploader.upload("product_image", null, file);
            System.out.println(filePath);
            productImage.setImage(filePath)
                    .setSequence(sequence)
                    .setCover(cover);
            productImageService.save(productImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productImage;
    }

}
