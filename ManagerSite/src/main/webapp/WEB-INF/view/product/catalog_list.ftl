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
                    <td><span class="badge">${data.level}</span></</td>
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

