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
        <form role="form">
            <div class="col-lg-3">
                <div class="form-group">
                    <label>中文名/英文名</label>
                    <input class="form-control">
                </div>
            </div>
            <div class="col-lg-3">
                <div class="form-group form_datetime" data-date="2013-02-21T15:25:00Z">
                    <label>创立时间</label>
                    <div class="form-group">
                        <input class="form-control" size="16" type="text" value="" readonly>
                        <span class="add-on"><i class="icon-remove"></i></span>
                        <span class="add-on"><i class="icon-calendar"></i></span>
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
            format: "dd MM yyyy - hh:ii",
            autoclose: true,
            todayBtn: true,
            startDate: "2013-02-14 10:00",
            minuteStep: 10
        });
    }());
</script>

