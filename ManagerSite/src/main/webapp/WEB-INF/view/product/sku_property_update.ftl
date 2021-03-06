<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            修改SKU属性
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-database""></i> SKU属性</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 修改SKU属性</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form action="/skuProperty/update" method="post">
    <input type="hidden" id="oId" name="id" value="${(skuProperty.id)!""}">
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>名称</label>
                <input class="form-control" name="name" value="${(skuProperty.name)!""}">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>编号</label>
                <input class="form-control" name="code" value="${(skuProperty.code)!""}">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>默认可选值</label>
                <textarea class="form-control" rows="3" placeholder="以逗号分隔">${skuPropertyDefaultValues!""}</textarea>
            </div>
        </div>
    </div>
    <p class="text-left" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script>
    initRefresh({toUpdateUrl: '/skuProperty/toUpdate'});
</script>
