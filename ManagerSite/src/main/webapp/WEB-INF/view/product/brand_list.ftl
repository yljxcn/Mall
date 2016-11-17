<div class="table-responsive">
    <table class="table">
        <thead>
        <tr>
            <th>LOGO</th>
            <th>创立时间</th>
            <th>中文名</th>
            <th>英文名</th>
            <th>是否可见</th>
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
    $('#pagination').twbsPagination({
        initiateStartPageClick: false,
        startPage: ${qo.page},
        totalPages: ${pages},
        first: '<i class="fa fa-fw fa-angle-double-left"></i>',
        prev: '<i class="fa fa-fw fa-angle-left"></i>',
        next: '<i class="fa fa-fw fa-angle-right"></i>',
        last: '<i class="fa fa-fw fa-angle-double-right"></i>',
        visiblePages: 5,
        onPageClick: function (event, page) {
            $('#currentPage').val(page);
            $('#search-form').submit();
        }
    });

    $('tbody#t_body').on('click', 'tr', function(){
        var $tr = $(this);
        $('div.button-group button.btn').removeClass('disabled');
        $('tbody#t_body > tr').removeClass('info');
        $tr.addClass('info');
        // console.info($tr.data('id'));
    });
</script>

