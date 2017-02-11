<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            添加分类
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="javascript:;"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="javascript:;"><i class="fa fa-fw fa-navicon""></i> 分类</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 添加分类</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form action="/catalog/save" method="post">
    <h2>基本属性</h2>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>分类名称</label>
                <input class="form-control" name="catalog.name">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>分类编号</label>
                <input class="form-control" name="catalog.code">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>上级分类</label>
                <select class="form-control" name="catalog.parentCatalogId">
                    <#list catalogs as c>
                        <option value="${c.id}">${c.name}</option>
                    </#list>
                    <option value="">无</option>
                </select>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>分类等级</label>
                <select class="form-control" name="catalog.level">
                    <option value="0">一级</option>
                    <option value="1">二级</option>
                    <option value="2">三级</option>
                </select>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>分类排序</label>
                <input class="form-control" name="catalog.sequence">
            </div>
        </div>
    </div>
    <h2>分类属性</h2>
    <div>
        <table class="table table-bordered catalog-property-table">
            <thead>
                <tr>
                    <th class="actions-col"></th>
                    <th>名称</th>
                    <th>类型</th>
                    <th>值</th>
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
    </div>
    <p class="text-center" style="margin-top: 20px;">
        <button type="submit" class="btn btn-default">保存</button>
        <button type="reset" class="btn btn-default">重置</button>
    </p>
</form>
<#-- 分类属性行模板 -->
<script id="catalogPropertyRowTemplate" type="text/x-template">
    <tr>
        <td class="actions-col">
            <button type="button" class="btn btn-default js-remove">
                <i class="fa fa-fw fa-minus-square-o"></i> 移除
            </button>
        </td>
        <td>
            <input type="hidden" name="catalogProperties[].id">
            <input class="form-control" name="catalogProperties[].name">
        </td>
        <td>
            <select name="catalogProperties[].type" class="form-control js-select-type">
                <option value="0">数值</option>
                <option value="1">文本</option>
                <option value="2">下拉列表</option>
            </select>
        </td>
        <td>
            <input type="hidden" name="catalogPropertyValues[].id">
            <input class="form-control" name="catalogPropertyValues[].value">
        </td>
    </tr>
</script>

<script>
    function CatalogPropertiesTable($el) {
        this.$el = $el;
        this.$body = this.$el.children('tbody');
        this.propertyRowTemplate = $('#catalogPropertyRowTemplate').html();
        this.rows = 0; // 传多个参数的数组下标
        this._bindEvents();
    }

    CatalogPropertiesTable.prototype = {
        _bindEvents: function () {
            this.$el
                .on('click', '.js-add', this.addPropertyRow.bind(this))
                .on('click', '.js-remove', this.removePropertyRow.bind(this))
                .on('change', '.js-select-type', this.updateLastCellPerRow.bind(this));
        },
        addPropertyRow: function () {
            // 结合模板来看这个方法
            this.$body.append(this.propertyRowTemplate.replace(/\[\]/g, "[" + this.rows + "]"));
            this.rows++;
        },
        removePropertyRow: function (e) {
            $(e.currentTarget).closest('tr').remove();
            this.rows--;
        },
        updateLastCellPerRow: function (e) {
            var $currentTarget = $(e.currentTarget);
            var $input = $currentTarget.parent('td').next('td').find('input');
            if($currentTarget.val() == 2){
                $input.attr('placeholder', '值以逗号分隔');
            }else{
                $input.removeAttr('placeholder')
            }
        }
    };
    new CatalogPropertiesTable($('.catalog-property-table'));

    initRefresh({toSaveUrl: '/catalog/toSave'});
</script>
