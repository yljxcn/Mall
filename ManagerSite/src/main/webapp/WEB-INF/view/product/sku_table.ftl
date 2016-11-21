<table class="table table-bordered sku-table">
    <thead>
        <tr>
            <th class="actions-col"></th>
            <th>SKU编号</th>
            <#list skuProperties as skuProperty>
                <th>skuProperty.name</th>
            </#list>
            <th>售价</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td class="actions-col">
                <button type="button" class="btn btn-default js-remove">
                    <i class="fa fa-fw fa-minus-square-o"></i> 移除
                </button>
            </td>
            <#list skus as sku>
                <#list skuProperties as skuProperty>
                    <th>sku[skuProperty.name]</th>
                </#list>
                <th>sku.code</th>
            </#list>
            <td><input class="form-control"></td>
        </tr>
    </tbody>
</table>