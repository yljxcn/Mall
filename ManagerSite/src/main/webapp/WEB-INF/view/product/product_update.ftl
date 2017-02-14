<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            修改商品
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cube""></i> 商品</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 修改商品</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form action="/product/save" method="post">
    <input type="hidden" id="oId" name="id" value="${(product.id)!""}">
    <h2>基本信息</h2>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品名称</label>
                <input class="form-control" name="product.name" value="${(product.name)!""}">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品编号</label>
                <input class="form-control" name="product.code" value="${(product.code)!""}">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属品牌</label>
                <select class="form-control" name="product.brandId">
                    <option value="" <#if !(product.brandId??)>selected</#if>>请选择</option>
                    <#list brands as brand>
                        <option value="${brand.id}" <#if (product.brandId)?? && product.brandId== brand.id>selected</#if>>${brand.chineseName}</option>
                    </#list>
                </select>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属分类</label>
                <select class="form-control" id="catalogId" name="product.catalogId">
                    <option value="" <#if !(product.catalogId??)>selected</#if>>请选择</option>
                    <#list catalogs as catalog>
                        <option value="${catalog.id}" <#if (product.catalogId)?? && product.catalogId== catalog.id>selected</#if>>${catalog.name}</option>
                    </#list>
                </select>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>市场售价</label>
                <input class="form-control" name="product.marketPrice" value="${(product.marketPrice)!""}">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>基础售价</label>
                <input class="form-control" name="product.basePrice" value="${(product.basePrice)!""}">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>是否上架</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="product.shelves" value="true" <#if product?? && product.hasShelves()>checked</#if>>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="product.shelves" value="false" <#if product?? && !(product.hasShelves())>checked</#if>>否
                    </label>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>是否推荐</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="product.recommended" value="true" <#if product?? && product.hasRecommended()>checked</#if>>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="product.recommended" value="false" <#if product?? && !(product.hasRecommended())>checked</#if>>否
                    </label>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <label>商品关键字</label>
                <input class="form-control" placeholder="以逗号分隔" name="product.keyword" value="${(product.keyword)!""}">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <label>商品标签</label>
                <textarea class="form-control" rows="3" placeholder="以逗号分隔" name="impressions">${impressions!""}</textarea>
            </div>
        </div>
    </div>
    <h2>商品分类属性</h2>
    <table class="table table-bordered catalog-property-table">
        <thead>
        <tr>
            <th>名称</th>
            <th>值</th>
        </tr>
        </thead>
        <tbody id="catalogPropertiesAndValues_tody">
        </tbody>
    </table>
    <h2>商品详情</h2>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <textarea name="desc" class="form-control" rows="3" placeholder="以逗号分隔">${productDescription.description?html}</textarea>
            </div>
        </div>
    </div>
    <h2>商品相册</h2>
    <div class="row">
        <#list productImages as productImage >
            <div class="col-lg-3 col-md-6">
                <div class="image-div">
                    <div>
                        <a href="javascript:;" id="uploadImage-btn${productImage_index}" class="js-upload">上传</a>
                    </div>
                    <img class="uploadImg" src="${(productImage.image)!""}">
                    <input type="hidden" name="productImages[${productImage_index}].id" value="${(productImage.id)!""}">
                    <input type="hidden" name="productImages[${productImage_index}].image" value="${(productImage.image)!""}">
                </div>
                <div class="input-group">
                    <select class="form-control" name="productImages[${productImage_index}].sequence">
                        <option value="1" <#if (productImage.sequence)?? && productImage.sequence == 1>selected</#if>>1</option>
                        <option value="2" <#if (productImage.sequence)?? && productImage.sequence == 2>selected</#if>>2</option>
                        <option value="3" <#if (productImage.sequence)?? && productImage.sequence == 3>selected</#if>>3</option>
                        <option value="4" <#if (productImage.sequence)?? && productImage.sequence == 4>selected</#if>>4</option>
                        <option value="5" <#if (productImage.sequence)?? && productImage.sequence == 5>selected</#if>>5</option>
                        <option value="6" <#if (productImage.sequence)?? && productImage.sequence == 6>selected</#if>>6</option>
                        <option value="7" <#if (productImage.sequence)?? && productImage.sequence == 7>selected</#if>>7</option>
                        <option value="8" <#if (productImage.sequence)?? && productImage.sequence == 8>selected</#if>>8</option>
                    </select>
                    <span class="input-group-addon">
                        <label>
                            <input type="radio" class="productImageCover" name="productImages[${productImage_index}].cover" value="${(productImage?? && productImage.hasCover())?string('true','false')}" <#if productImage?? && productImage.hasCover()>checked</#if>>
                            <span>封面</span>
                        </label>
                    </span>
                </div>
            </div>
        </#list>
    </div>
    <p class="text-center" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script>
    var editor = CKEDITOR.replace('desc');

    var pio = {'sequence' : 1, 'cover' : true};

    $(".image-div .js-upload").uploadify({
        'height'            : 30,
        'width'             : 120,
        'fileTypeExts'      : '*.gif; *.jpg; *.png',
        'buttonText'        :'上传',
        'swf'               : '/js/plugins/uploadify/uploadify.swf',
        'uploader'          : '/productImage/upload',
        'fileObjName'       : 'file',
        'formData'          : pio,
        'overrideEvents'    : ['onUploadSuccess','onUploadProgress','onSelect'],
        'onUploadStart'     : function(file) {
            // 获取到上传包装过后的 jQuey 对象
            var $wrapper = this.wrapper;
            var $div = $wrapper.parent('div').parent('div').next('div');
            var sequence = $div.find('select').val();
            var cover = $div.find('input').prop('checked');
            pio.sequence = sequence;
            pio.cover = cover;
        },
        'onUploadSuccess'   : function(file, data) {
            var $wrapper = this.wrapper;
            var $div = $wrapper.parent('div').parent('div');
            data = JSON.parse(data);
            $div.find('img').attr('src', data.image);
            $div.find('input').val(data.id);
        }

    });

    // 第一次加载时回显，以后选择分类就不回显
    var flag = true;
    $('#catalogId').change(function(){
        var catalogId = $(this).val();
        var $catalogPropertiesAndValuesTody = $('#catalogPropertiesAndValues_tody');
        if(catalogId){
            var accessUrl = '/catalog/catalogPropertiesValues?catalogId=' + catalogId;
            if(flag){
                accessUrl = accessUrl + '&productId=' + ${product.id};
                flag = false;
            }
            $catalogPropertiesAndValuesTody.load(accessUrl);
        }
        else{
            $catalogPropertiesAndValuesTody.empty();
        }
    });

    $("form").submit(function(){
        editor.updateElement();
    });

    $('.productImageCover').click(function(){
        var $this = $(this);
        $this.val($this.prop('checked'));
    })

    initRefresh({toSaveUrl: '/product/toSave',toUpdateUrl: '/product/toUpdate'});

    <#if (product.catalogId)??>
        // 让页面加载分类属性及其值
        $('#catalogId').change();
    </#if>
</script>
