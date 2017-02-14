<div class="table-responsive">
    <table class="table">
        <thead>
        <tr>
            <th>录入时间</th>
            <th>商品编号</th>
            <th>商品名称</th>
            <th>SKU</th>
            <th>售价</th>
            <th>上架</th>
        </tr>
        </thead>
        <tbody id="t_body">
            <#list pagination.datas as data>
                <tr data-id="${data.id}">
                    <td>${data.createdDate?string("yyyy-MM-dd")}</td>
                    <td>${data.product.code}</td>
                    <td>${data.product.name}</td>
                    <td>${data.code}</td>
                    <td>${data.price}</td>
                    <td>
                        ${data.hasShelves()?string('<i class="fa fa-fw fa-check fa-color-right"></i>','<i class="fa fa-fw fa-close fa-color-wrong"></i>')}
                    </td>
                </tr>
            </#list>
        </tbody>
    </table>
</div>
<div class="row text-right">
    <div class="col-lg-12">
        <ul id="pagination" class="pagination-sm"></ul>
    </div>
</div>
<script>
    initPagination({startPage: ${qo.page}, totalPages: ${pages}});
    initTrSelected();
</script>

