<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            添加SKU
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-barcode""></i> SKU</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 添加SKU</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form>
    <h2>商品信息</h2>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品名称</label>
                <input class="form-control" readonly>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品编号</label>
                <input class="form-control" readonly>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属分类</label>
                <input class="form-control" readonly>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属品牌</label>
                <input class="form-control" readonly>
            </div>
        </div>
    </div>
    <h2>SKU属性 <button type="button" class="btn btn-default addSkuPropertiesTable"><i class="fa fa-fw fa-plus-square-o"></i> 增加</button></h2>
    <div>
       <#-- <table class="table table-bordered sku-property-table">
            <thead>
            <tr>
                <th class="actions-col"></th>
                <th>名称</th>
                <th>图片</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
            <tfoot>
            <tr>
                <td colspan="4">
                    <button type="button" class="btn btn-default js-add">
                        <i class="fa fa-fw fa-plus-square-o"></i> 增加
                    </button>
                </td>
            </tr>
            </tfoot>
        </table>-->
    </div>
    <p class="text-center" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script id="skuPropertiesTableTemplate" type="text/x-template">
    <table class="table table-bordered sku-property-table">
        <thead>
        <tr>
            <th class="actions-col"></th>
            <th>名称</th>
            <th>图片</th>
        </tr>
        </thead>
        <tbody>

        </tbody>
        <tfoot>
        <tr>
            <td colspan="4">
                <button type="button" class="btn btn-default js-add">
                    <i class="fa fa-fw fa-plus-square-o"></i> 增加
                </button>
            </td>
        </tr>
        </tfoot>
    </table>
</script>
<script id="skuPropertyRowTemplate" type="text/x-template">
    <tr>
        <td class="actions-col">
            <button type="button" class="btn btn-default js-remove">
                <i class="fa fa-fw fa-minus-square-o"></i> 移除
            </button>
        </td>
        <td><input class="form-control"></td>
        <td><input type="file"></td>
    </tr>
</script>
<script>

    $('.addSkuPropertiesTable').click(function(){
        var propertiestablTemplate = $('#skuPropertiesTableTemplate').html();
        $(this).parent('h2').next('div').append(propertiestablTemplate);

        var $table = $(propertiestablTemplate);
        new SkuPropertiesTable($table);
    });

    function SkuPropertiesTable($el) {
        this.$el = $el;
        this.$body = this.$el.children('tbody');

        this.propertyRowTemplate = $('#skuPropertyRowTemplate').html();

        this._bindEvents();
    }

    SkuPropertiesTable.prototype = {
        _bindEvents: function () {
            this.$el
                    .on('click', '.js-add', this.addPropertyRow.bind(this))
                    .on('click', '.js-remove', this.removePropertyRow.bind(this));
        },

        addPropertyRow: function () {
            this.$body.append(this.propertyRowTemplate);
        },

        removePropertyRow: function (e) {
            $(e.currentTarget).closest('tr').remove();
        },
    };

    // new SkuPropertiesTable($('.sku-property-table'));

    /*
    $(".image-div .js-upload").uploadify({
        height        : 30,
        buttonText    :"上传",
        swf           : '/js/plugins/uploadify/uploadify.swf',
        uploader      : '/uploadify/uploadify.php',
        width         : 120
    });*/

    $('.refresh-a').click(function(){
        $('#content_body').load('/sku/toSaveOrUpdate');
        return false;
    });
</script>
