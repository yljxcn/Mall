<div class="table-responsive">
    <table class="table">
        <thead>
        <tr>
            <th>LOGO</th>
            <th>创立时间</th>
            <th>中文名</th>
            <th>英文名</th>
            <th>可见</th>
        </tr>
        </thead>
        <tbody id="t_body">
            <#list pagination.datas as data>
                <tr data-id="${data.id}">
                    <td><a href="${data.url}" target="_blank"><img class="brand-logo" src="${data.logo}"></a></td>
                    <td>${data.foundDate?string("yyyy-MM-dd")}</td>
                    <td>${data.chineseName}</td>
                    <td>${data.englishName}</td>
                    <td>
                        ${data.hasVisible()?string('<i class="fa fa-fw fa-check fa-color-right"></i>','<i class="fa fa-fw fa-close fa-color-wrong"></i>')}
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


