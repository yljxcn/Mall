<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            添加品牌
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="javascript:;"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="javascript:;"><i class="fa fa-fw fa-bookmark""></i> 品牌</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 修改品牌</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form action="/brand/update" method="post" enctype="multipart/form-data">
    <input type="hidden" id="oId" name="id" value="${(brand.id)!""}">
    <div class="row">
        <div class="col-lg-4">
            <div class="form-group">
                <label>中文名</label>
                <input class="form-control" name="chineseName" value="${(brand.chineseName)!""}">
            </div>
        </div>
        <div class="col-lg-4">
            <div class="form-group">
                <label>英文名</label>
                <input class="form-control" name="englishName" value="${(brand.englishName)!""}">
            </div>
        </div>
        <div class="col-lg-4">
            <div class="form-group">
                <label>成立时间</label>
                <div class="date form_datetime input-group">
                    <input size="16" name="foundDate" type="text" readonly class="form-control" value="${(brand.foundDate?string("yyyy-MM-dd"))!""}">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-remove"></i></span>
                    <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4">
            <div class="form-group">
                <label>官方网站</label>
                <input class="form-control" name="url" value="${(brand.url)!""}">
            </div>
        </div>
        <div class="col-lg-4">
            <div class="form-group">
                <label>排序</label>
                <input class="form-control" name="sequence" value="${(brand.sequence)!""}">
            </div>
        </div>
        <div class="col-lg-4">
            <div class="form-group">
                <label>是否显示</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="mods" value="1" ${(brand.hasVisible()?string('checked', ''))!""}>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="mods" value="0" ${(brand.hasVisible()?string('', 'checked'))!""}>否
                    </label>


                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <label>描述</label>
                <textarea name="description" class="form-control">${(brand.description)!""}</textarea>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>LOGO</label>
                <input type="file" name="file" accept="image/*" onchange="loadFile(event)">
                <img id="output" height="30%" width="30%" src="${(brand.logo)!""}">
            </div>
        </div>
    </div>
    <p class="text-center" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script>
    $('.form_datetime').datetimepicker({
        autoclose: true,
        minView: 2, // 配置只显示选择天的视图
        startDate: "1970-01-01"
    });

    var loadFile = function(event) {
        var output = document.getElementById('output');
        output.src = URL.createObjectURL(event.target.files[0]);
    };

    initRefresh();
</script>
