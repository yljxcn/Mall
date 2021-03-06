<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            添加 SKU
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-barcode""></i> SKU</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 添加 SKU</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form action="/sku/save" method="post" enctype="multipart/form-data">
    <input type="hidden" name="productId" value="${(product.id)!""}">
    <h2>商品信息</h2>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品名称</label>
                <input class="form-control" readonly value="${(product.name)!""}">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>商品编号</label>
                <input class="form-control" readonly value="${(product.code)!""}">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属品牌</label>
                <input class="form-control" readonly value="${(product.brand.chineseName)!""}">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>所属分类</label>
                <input class="form-control" readonly value="${(product.catalog.name)!""}">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>市场售价</label>
                <input class="form-control" readonly value="${(product.marketPrice)!""}">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>基础售价</label>
                <input class="form-control" readonly value="${(product.basePrice)!""}">
            </div>
        </div>
    </div>
    <h2>SKU 属性 <button type="button" class="btn btn-default addSkuPropertiesTable"><i class="fa fa-fw fa-plus-square-o"></i> 增加</button></h2>
    <div class="sku-properties-container">
    </div>
    <h2>SKU <button type="button" class="btn btn-default generateSkus"><i class="fa fa-fw fa-rotate-right"></i> 生成</h2>
    <div class="sku-container">
    </div>
    <p class="text-center" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<script id="skuPropertiesTableTemplate" type="text/x-template">
    <div class="sku-properties">
        <div class="sku-property-name">
            <select class="form-control form-control-inline js-select">
                <option value="">请选择</option>
                <#list skuProperties as skuProperty>
                    <option data-relationship="${skuProperty.hasRelationship()?string("true", "false")}" value="${skuProperty.id}">${skuProperty.name}</option>
                </#list>
            </select>
            <a class="js-up" href="javascript:;"><i class="fa fa-fw fa-angle-double-up"></i> 上移</a>
            <a class="js-down" href="javascript:;"><i class="fa fa-fw fa-angle-double-down"></i> 下移</a>
        </div>
        <table class="table table-bordered sku-property-table">
            <thead>
            <tr>
                <th class="actions-col"></th>
                <th>值</th>
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
    <div>
</script>
<script id="skuPropertyRowTemplate" type="text/x-template">
    <tr>
        <td class="actions-col">
            <button type="button" class="btn btn-default js-remove">
                <i class="fa fa-fw fa-minus-square-o"></i> 移除
            </button>
        </td>
        <td><input name="skuPropertyValue" class="form-control sku-property-value"></td>
        <td>
            <input name="file" type="file">
            <input name="skuPropertyId" class="sku-property-id" type="hidden" value="">
        </td>
    </tr>
</script>
<script>
    initRefresh({toSaveUrl: '/sku/toSave'});

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
        skuPropertiesTableObj:null,

        addPropertyTable: function () {
            this.$el.append(this.$table);
            skuPropertiesTableObj = new SkuPropertiesTable(this.$table);
        },

        _bindEvents: function () {
            this.$table
                .on('change', '.js-select', this.selectSkuProperty.bind(this))
                .on('click', '.js-up', this.upPropertyTable.bind(this))
                .on('click', '.js-down', this.downPropertyTable.bind(this));
        },

        selectSkuProperty: function (e) {
            var $select = $(e.currentTarget);
            var skuPropertyId = $select.val();
            if(skuPropertyId){
               var relationship = $select.find('option:selected').data('relationship');
               if(relationship){
                   $.ajax({
                       type: "POST",
                       url: "/skuPropertyRelationshipValue/list",
                       data: {skuPropertyId: skuPropertyId},
                       dataType: 'json',
                       timeout: 100000
                   }).done(function (data) {
                       if(skuPropertiesTableObj){
                           skuPropertiesTableObj.removeAllPropertyRow();
                           $.each(data,function(index,value){
                               skuPropertiesTableObj.initPropertyRow(value);
                           });
                       }
                   });
               }
            }else{
                skuPropertiesTableObj.removeAllPropertyRow();
            }
        },

        upPropertyTable: function (e) {
            var $currentDiv = $(e.currentTarget).parent('div').parent('div');
            var $prevDiv= $currentDiv.prev('div');

            if($prevDiv.length){
                $prevDiv.before($currentDiv);
            }
        },

        downPropertyTable: function (e) {
            var $currentDiv = $(e.currentTarget).parent('div').parent('div');
            var $nextDiv= $currentDiv.next('div');

            if($nextDiv.length){
                $nextDiv.after($currentDiv);
            }
        }
    };


    function SkuPropertiesTable($el) {
        this.$el = $el;
        this.$body = this.$el.children('table').children('tbody');

        this.propertyRowTemplate = $('#skuPropertyRowTemplate').html();
        this._bindEvents();
    }

    SkuPropertiesTable.prototype = {
        _bindEvents: function () {
            this.$el
                .on('click', '.js-add', this.addPropertyRow.bind(this))
                .on('click', '.js-remove', this.removePropertyRow.bind(this));
        },

        initPropertyRow: function (skuPropertyValue) {
            var $propertyRowTemplate = $(this.propertyRowTemplate);
            $propertyRowTemplate.find('input.sku-property-value').val(skuPropertyValue.value);
            $propertyRowTemplate.find('input.sku-property-id').val(skuPropertyValue.skuPropertyId);
            this.$body.append($propertyRowTemplate.get(0));
        },

        addPropertyRow: function () {
            this.$body.append(this.propertyRowTemplate);
        },

        removePropertyRow: function (e) {
            $(e.currentTarget).closest('tr').remove();
        },

        removeAllPropertyRow: function () {
            this.$body.empty();
        }
    };

    // 生成 SKU
    $('.generateSkus').click(function(){
        var $skuContainer = $('.sku-container');
        $skuContainer.empty();

        var $skuPropertiesDivs = $('.sku-properties');
        if(!$skuPropertiesDivs.length){
            alert('未有添加 SKU 属性');
            return;
        }

        var skuPropertiesArray = [];
        var skuPropertyValuesArray = [];

        $skuPropertiesDivs.each(function(i){
            var $skuPropertySelect = $(this).find('select');
            var $skuPropertyOption = $skuPropertySelect.find('option:selected');

            skuPropertiesArray.push({'id': $skuPropertySelect.val(), 'name': $skuPropertyOption.html()});

            var $skuPropertyValueInputs = $(this).find('input.sku-property-value');
            if(!$skuPropertyValueInputs.length){
                alert('未有添加 SKU 属性值');
                return;
            }

            $skuPropertyValueInputs.each(function(i){
                skuPropertyValuesArray.push({'value': $(this).val(), 'skuPropertyId': $skuPropertySelect.val()});
            });

        });

        console.info(JSON.stringify(skuPropertiesArray));
        console.info(JSON.stringify(skuPropertyValuesArray));

        var obj = {
            'productId': ${(product.id)!""},
            'skuProperties': skuPropertiesArray,
            'skuPropertyValues': skuPropertyValuesArray
        };

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/skuProperty/generateSkus",
            data: JSON.stringify(obj),
            dataType: 'html',
            timeout: 100000
        }).done(function (data) {
            $skuContainer.html(data);
        });
    });
</script>
