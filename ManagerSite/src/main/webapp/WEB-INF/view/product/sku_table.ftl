<table class="table table-bordered sku-table">
    <thead>
        <tr>
            <th class="actions-col"></th>
            <th>SKU 编号</th>
            <#list skuProperties as skuProperty>
                <th>${skuProperty.name}</th>
            </#list>
            <th>售价</th>
        </tr>
    </thead>
    <tbody>
        <#list skus as sku>
            <tr>
                <td class="actions-col">
                    <button type="button" class="btn btn-default js-remove">
                        <i class="fa fa-fw fa-minus-square-o"></i> 移除
                    </button>
                </td>
                <td>${sku.code}</td>
                <#list skuProperties as skuProperty>
                    <th>${sku[skuProperty.name]}</th>
                </#list>

                <td><input class="form-control"></td>
            </tr>
        </#list>
    </tbody>
</table>
<script>
    $('.sku-table').on('click', '.js-remove', function(){
        $(this).closest('tr').remove();
    });
</script>