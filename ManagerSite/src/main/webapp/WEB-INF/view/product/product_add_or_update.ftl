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
<form>
    <h2>基本信息</h2>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品名称</label>
                <input class="form-control">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品编号</label>
                <input class="form-control">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属分类</label>
                <select class="form-control" id="catalogId">
                    <option>请选择</option>
                <#list catalogs as catalog>
                    <option value="${catalog.id}">${catalog.name}</option>
                </#list>
                </select>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属品牌</label>
                <select class="form-control">
                    <option>请选择</option>
                    <#list brands as brand>
                        <option value="${brand.id}">${brand.chineseName}</option>
                    </#list>
                </select>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>市场售价</label>
                <input class="form-control">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>基础售价</label>
                <input class="form-control">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>是否上架</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosInline1" value="option1" checked>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosInline1" value="option2">否
                    </label>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>是否推荐</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosInline2" value="option1" checked>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosInline2" value="option2">否
                    </label>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <label>商品关键字</label>
                <input class="form-control" placeholder="以逗号分隔">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <label>商品标签</label>
                <textarea class="form-control" rows="3" placeholder="以逗号分隔"></textarea>
            </div>
        </div>
    </div>
    <h2>商品分类属性</h2>
    <table class="table table-bordered catalog-property-table">
        <thead>
            <tr>
                <th>名称</th>
                <th>类型</th>
            </tr>
        </thead>
        <tbody id="catalogPropertiesAndValues_tody">
        </tbody>
    </table>
    <h2>商品详情</h2>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <textarea name="editor01" class="form-control" rows="3" placeholder="以逗号分隔"></textarea>
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
                <img alt="" src="" class="uploadImg">
                <input type="hidden" name="image">
            </div>
            <div class="input-group">
                <select class="form-control">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                </select>
                <span class="input-group-addon">
                    <label>
                        <input type="radio" name="cover" value="" checked>
                        <span>封面</span>
                    </label>
                </span>
            </div>
        </div>
    </#macro>
    <div class="row">
        <#list 1..4 as number>
            <@productImage number/>
        </#list>
    </div>
    <div class="row">
    <#list 5..8 as number>
            <@productImage number/>
        </#list>
    </div>
    <p class="text-center" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script>
    var editor = CKEDITOR.replace('editor01');
    editor.setData("XXX");
    console.info(editor.getData());

    $(".image-div .js-upload").uploadify({
        height        : 30,
        buttonText    :"上传",
        swf           : '/js/plugins/uploadify/uploadify.swf',
        uploader      : '/uploadify/uploadify.php',
        width         : 120
    });

    $('.refresh-a').click(function(){
        $('#content_body').load('/product/toSaveOrUpdate');
        return false;
    });

    $('#catalogId').change(function(){
        var catalogId = $(this).val();
        if(catalogId)
            $('#catalogPropertiesAndValues_tody').load('/product/catalogPropertiesAndValues?catalogId=' + catalogId);
    });
</script>
