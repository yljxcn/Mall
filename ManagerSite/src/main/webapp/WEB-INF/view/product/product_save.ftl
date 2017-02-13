<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            添加商品
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cube""></i> 商品</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 添加商品</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form action="/product/save" method="post">
    <h2>基本信息</h2>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品名称</label>
                <input class="form-control" name="product.name">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品编号</label>
                <input class="form-control" name="product.code">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属品牌</label>
                <select class="form-control" name="product.brandId">
                    <option>请选择</option>
                    <#list brands as brand>
                        <option value="${brand.id}">${brand.chineseName}</option>
                    </#list>
                </select>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属分类</label>
                <select class="form-control" id="catalogId" name="product.catalogId">
                    <option value="">请选择</option>
                    <#list catalogs as catalog>
                        <option value="${catalog.id}">${catalog.name}</option>
                    </#list>
                </select>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>市场售价</label>
                <input class="form-control" name="product.marketPrice">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>基础售价</label>
                <input class="form-control" name="product.basePrice">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>是否上架</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="product.shelves" value="true" checked>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="product.shelves" value="false">否
                    </label>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>是否推荐</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="product.recommended" value="true" checked>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="product.recommended" value="false">否
                    </label>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <label>商品关键字</label>
                <input class="form-control" placeholder="以逗号分隔" name="product.keyword">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <label>商品标签</label>
                <textarea class="form-control" rows="3" placeholder="以逗号分隔" name="impressions"></textarea>
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
                <textarea name="desc" class="form-control" rows="3" placeholder="以逗号分隔"></textarea>
            </div>
        </div>
    </div>
    <h2>商品相册</h2>
    <#macro productImage number>
        <div class="col-lg-3 col-md-6">
            <div class="image-div">
                <div>
                    <a href="javascript:;" id="uploadImage-btn${number}" class="js-upload">上传</a>
                </div>
                <img class="uploadImg">
                <input type="hidden" name="productImages[${number}].id">
            </div>
            <div class="input-group">
                <select class="form-control" name="productImages[${number}].sequence">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                </select>
                <span class="input-group-addon">
                    <label>
                        <input type="radio" class="productImageCover" name="productImages[${number}].cover" value="false">
                        <span>封面</span>
                    </label>
                </span>
            </div>
        </div>
    </#macro>
    <div class="row">
        <#list 0..7 as number>
            <@productImage number/>
        </#list>
    </div>
    <#--<div class="row">
        <#list 4..7 as number>
            <@productImage number/>
        </#list>
    </div>-->
    <p class="text-center" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script>
    var editor = CKEDITOR.replace('desc');
    // editor.setData("XXX");
    // console.info(editor.getData());

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

    $('#catalogId').change(function(){
        var catalogId = $(this).val();
        if(catalogId)
            $('#catalogPropertiesAndValues_tody').load('/catalog/catalogPropertiesValues?catalogId=' + catalogId);
        else{
            $('#catalogPropertiesAndValues_tody').empty();
        }
    });

    $("form").submit(function(){
        editor.updateElement();
    });

    $('.productImageCover').click(function(){
        var $this = $(this);
        $this.val($this.prop('checked'));
    })

    initRefresh({toSaveUrl: '/product/toSave'});
</script>
