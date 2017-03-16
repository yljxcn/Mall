<div class="table-responsive">
    <table class="table">
        <thead>
        <tr>
            <th>创建时间</th>
            <th>等级</th>
            <th>名称</th>
            <th>编号</th>
            <th>顺序</th>
        </tr>
        </thead>
        <tbody id="t_body">
            <#list pagination.datas as data>
                <tr data-id="${data.id}">
                    <td>${data.createdDate?string("yyyy-MM-dd")}</td>
                    <td><span class="badge">${data.level + 1}</span></</td>
                    <td>${data.name}</td>
                    <td>${data.code}</td>
                    <td>${data.sequence}</td>
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

