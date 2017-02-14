<div class="table-responsive">
    <table class="table">
        <thead>
        <tr>
            <th>录入时间</th>
            <th>名称</th>
            <th>编号</th>
            <th>有默认值</th>
            <th>有效</th>
        </tr>
        </thead>
        <tbody id="t_body">
            <#list pagination.datas as data>
                <tr data-id="${data.id}">
                    <td>${data.createdDate?string("yyyy-MM-dd")}</td>
                    <td>${data.name}</td>
                    <td>${data.code}</td>
                    <td>
                        ${data.hasRelationship()?string('<i class="fa fa-fw fa-check fa-color-right"></i>','<i class="fa fa-fw fa-close fa-color-wrong"></i>')}
                    </td>
                    <td>
                        ${data.hasEffective()?string('<i class="fa fa-fw fa-check fa-color-right"></i>','<i class="fa fa-fw fa-close fa-color-wrong"></i>')}
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

