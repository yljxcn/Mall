<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            添加
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cube""></i> 商品</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 添加</li>
        </ol>
    </div>
</div>
<form>
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
                <input class="form-control">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属品牌</label>
                <input class="form-control">
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
                        <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline1" value="option1" checked>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline2" value="option2">否
                    </label>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>是否推荐</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline1" value="option1" checked>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline2" value="option2">否
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
    <label>商品分类属性</label>
    <table class="table table-bordered catalog-property-table">
        <thead>
            <tr>
                <th>名称</th>
                <th>类型</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>CPU系列</td>
                <td><input class="form-control"></td>
            </tr>
            <tr>
                <td>CPU型号</td>
                <td><input class="form-control"></td>
            </tr>
            <tr>
                <td>CPU接口</td>
                <td>
                    <select class="form-control">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                </td>
            </tr>
        </tbody>
    </table>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <label>商品详情</label>
                <textarea name="editor01" class="form-control" rows="3" placeholder="以逗号分隔"></textarea>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-3">
            <div class="uploadify-button " id="file_upload_1-button" style="width: 120px; height: 30px; line-height: 30px;"><span class="uploadify-button-text">SELECT FILES</span></div>
        </div>
    </div>
    <p class="text-center">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script>
    CKEDITOR.replace('editor01');
    console.info(1);
    $("#file_upload_1-button").uploadify({
        height        : 30,
        swf           : '/js/plugins/uploadify/uploadify.swf',
        uploader      : '/uploadify/uploadify.php',
        width         : 120
    });
    console.info(2);
</script>
