<div class="container-fluid">

    <!-- Page Heading -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">
                商品
            </h1>
            <ol class="breadcrumb">
                <li class="active">
                    <i class="fa fa-cube"></i> 品牌
                </li>
            </ol>
        </div>
    </div>

    <div class="row">
        <form role="form" id="search-form">
            <input type="hidden" id="currentPage" value="1">
            <div class="col-lg-3">
                <div class="form-group">
                    <label>中文名/英文名</label>
                    <input class="form-control">
                </div>
            </div>
            <div class="col-lg-3">
                <div class="form-group">
                    <label>创立时间</label>
                    <div class="date form_datetime input-group">
                        <input size="16" type="text" value="" readonly class="form-control">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-remove"></i></span>
                        <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                    </div>
                </div>
            </div>
            <div class="col-lg-3">
                <div class="form-group">
                    <label>创立时间</label>
                    <input class="form-control">
                </div>
            </div>
            <div class="col-lg-3">
                <div class="form-group">
                    <label>状态</label>
                    <select class="form-control">
                        <option>显示</option>
                        <option>隐藏</option>
                    </select>
                </div>
            </div>
        </form>
    </div>

    <div class="row">
        <div class="col-lg-12">
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>LOGO</th>
                            <th>创立时间</th>
                            <th>中文名</th>
                            <th>英文名</th>
                            <th>可见性</th>
                        </tr>
                    </thead>
                    <tbody id="t_body">
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="row text-right">
        <div class="col-lg-12">
        <#include "../common/pagination.ftl" />
        </div>
    </div>
    <!-- /.row -->

</div>
<!-- /.container-fluid -->

<script>
    (function(){
       /* $.ajax({ url: "/brand/list", success: function(data){
            $("#t_body").html(data);
        }},"html");*/
        $('#t_body').load("/brand/list");

        $(".form_datetime").datetimepicker({
            format: "yyyy-mm-dd",
            autoclose: true,
            todayBtn: true,
            minView: 2, // 配置只显示选择天的视图
            startDate: "1970-01-01"
        });
    }());
</script>

