<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            添加分类
        </h1>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
            <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-navicon""></i> 分类</a></li>
            <li class="breadcrumb-item active"><i class="fa fa-fw fa-plus"></i> 添加分类</li>
            <li class="pull-right no-divider"><a href="javascript:;" class="refresh-a"><i class="fa fa-fw fa-refresh"></i> 刷新</a></li>
        </ol>
    </div>
</div>
<form>
    <h2>基本属性</h2>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>分类名称</label>
                <input class="form-control">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>分类编号</label>
                <input class="form-control">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>上级分类</label>
                <input class="form-control">
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <label>分类排序</label>
                <input class="form-control">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <label>是否显示</label>
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
                <label>分类图片</label>
                <input type="file">
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
<script id="catalogPropertyRowTemplate" type="text/x-template">
    <tr>
        <td class="actions-col">
            <button type="button" class="btn btn-default js-remove">
                <i class="fa fa-fw fa-minus-square-o"></i> 移除
            </button>
        </td>
        <td><input class="form-control"></td>
        <td>
            <select name="type" class="form-control js-select-type">
                <option value="numeric">数值</option>
                <option value="text">文本</option>
                <option value="dropdown">下拉列表</option>
            </select>
        </td>
        <td><input class="form-control"></td>
    </tr>
</script>
<script id="catalogPropertyValueTemplate" type="text/x-template">
    <select multiple class="form-control">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
    </select>
</script>
<script>
    function CatalogPropertiesTable($el) {
        this.$el = $el;
        this.$body = this.$el.children('tbody');

        this.propertyRowTemplate = $('#catalogPropertyRowTemplate').html();

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
            this.$body.append(this.propertyRowTemplate);
        },

        removePropertyRow: function (e) {
            $(e.currentTarget).closest('tr').remove();
        },

        updateLastCellPerRow: function (e) {
            var $currentTarget = $(e.currentTarget);
            var $input = $currentTarget.parent('td').next('td').find('input');
            if($currentTarget.val() == 'dropdown'){
                $input.attr('placeholder', '值以逗号分隔');
            }else{
                $input.removeAttr('placeholder')
            }
        }
    };

    new CatalogPropertiesTable($('.catalog-property-table'));

    $('.refresh-a').click(function(){
        $('#content_body').load('/catalog/toSaveOrUpdate');
        return false;
    });
</script>
