<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            修改SKU
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-database""></i> SKU</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 修改SKU</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form action="/sku/update" method="post">
    <input type="hidden" id="oId" name="id" value="${(sku.id)!""}">
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品</label>
                <input class="form-control" value="${(sku.product.name)!""}" readonly>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>编号</label>
                <input class="form-control" name="code" value="${(sku.code)!""}" readonly>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>价格</label>
                <input class="form-control" name="price" value="${(sku.price)!""}">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4">
            <div class="form-group">
                <label>是否上架</label>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="shelves" value="true" <#if sku?? && sku.hasShelves()>checked</#if>>是
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="shelves" value="false" <#if sku?? && !(sku.hasShelves())>checked</#if>>否
                    </label>


                </div>
            </div>
        </div>
    </div>
    <p class="text-left" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script>
    initRefresh({toUpdateUrl: '/sku/toUpdate'});
</script>
