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
    <div class="sku-property-filter">
        <select class="form-control form-control-inline"
            <option>型号</option>
            <option>颜色</option>
            <option>尺寸</option>
        </select>
        <a class="js-up" href="javascript:;"><i class="fa fa-fw fa-angle-double-up"></i> 上移</a>
        <a class="js-down" href="javascript:;"><i class="fa fa-fw fa-angle-double-down"></i> 下移</a>
    </div>
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
        new SkuPropertiesTableDiv($(this).parent('h2').next('div'));
    });

    function SkuPropertiesTableDiv($el){
        this.$el = $el;
        this.$table = $($('#skuPropertiesTableTemplate').html());
        this.addPropertyTable();
        this._bindEvents();
    }

    SkuPropertiesTableDiv.prototype = {
        addPropertyTable: function () {
            this.$el.append(this.$table);
            new SkuPropertiesTable(this.$table);
        },

        _bindEvents: function () {
            this.$el
                .on('click', '.js-up', this.upPropertyTable.bind(this))
                .on('click', '.js-down', this.downPropertyTable.bind(this));
        },

        upPropertyTable: function (e) {
            var $currentDiv = $(e.currentTarget).parent('div');
            var $currentTable = $currentDiv.next('table');
            var $prevTable = $currentDiv.prev('table');
            var $prevDive = $prevTable.prev('div');

            if($prevTable.length && $prevDive.length){
                console.info("上面有")
            }
        },

        downPropertyTable: function (e) {
            var $currentDiv = $(e.currentTarget).parent('div');
            var $currentTable = $currentDiv.next('table');
            var $nextDiv = $currentTable.next('div');
            var $nextTable = $nextDiv.next('table');

            if($nextDiv.length && $nextTable.length){
                console.info("下面有")
            }
        }
    };


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
        }
    };

    $('.refresh-a').click(function(){
        $('#content_body').load('/sku/toSaveOrUpdate');
        return false;
    });
</script>
