<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

<#include "../common/link.ftl" />

</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <#include "../common/brand.ftl" />
        <#include "../common/top_menu.ftl" />
        <#include "../common/sidebar_menu.ftl" />
    </nav>

    <div id="page-wrapper">
        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        品牌
                    </h1>
                   <#-- <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-cube"></i> 商品 <i class="fa fa-angle-double-right"></i> <i class="fa fa-cube"></i> 品牌
                        </li>
                    </ol>-->
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="#"><i class="fa fa-fw fa-cubes"></i> 商品</a></li>
                        <li class="breadcrumb-item active"><i class="fa fa-fw fa-bookmark"></i> 品牌</li>
                    </ol>
                </div>
            </div>

            <div class="row button-group">
                <div class="col-lg-9 text-left">
                    <#--<button type="button" class="btn btn-default"><i class="fa fa-fw fa-plus"></i> 增加</button>
                    <button type="button" class="btn btn-primary"><i class="fa fa-fw fa-edit"></i> 修改</button>
                    <button type="button" class="btn btn-success">Success</button>
                    <button type="button" class="btn btn-info">Info</button>
                    <button type="button" class="btn btn-warning">Warning</button>-->
                    <button type="button" class="btn btn-default"><i class="fa fa-fw fa-plus"></i> 增加</button>
                    <button type="button" class="btn btn-primary disabled"><i class="fa fa-fw fa-edit"></i> 修改</button>
                    <button type="button" class="btn btn-danger disabled"><i class="fa fa-fw fa-minus"></i> 删除</button>
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">Large modal</button>
                </div>
                <div class="col-lg-3 text-right">
                    <button type="button" class="btn btn-link tex"><i class="fa fa-fw fa-search"></i> 搜索</button>
                </div>
            </div>

            <div class="row">
                <form role="form" id="search-form" action="/brand/list">
                    <input type="hidden" id="currentPage" value="1">
                    <div class="col-lg-3">
                        <div class="form-group">
                            <label>中文名/英文名</label>
                            <input class="form-control">
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="form-group">
                            <label>创立时间</label>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="date form_datetime input-group">
                                        <input size="16" type="text" value="" readonly class="form-control">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-remove"></i></span>
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="date form_datetime input-group">
                                        <input size="16" type="text" value="" readonly class="form-control">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-remove"></i></span>
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                                    </div>
                                </div>
                            </div>
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
                <div class="col-lg-12" id="t_table">

                </div>
            <!-- /.row -->
        </div>
    </div>
    <!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->

<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div>xxxxxxxxxxxxxxxxxxxxxxxxx</div>
            <div>xxxxxxxxxxxxxxxxxxxxxxxxx</div>
            <div>xxxxxxxxxxxxxxxxxxxxxxxxx</div>
            <div>xxxxxxxxxxxxxxxxxxxxxxxxx</div>
            <div>xxxxxxxxxxxxxxxxxxxxxxxxx</div>
            <div>xxxxxxxxxxxxxxxxxxxxxxxxx</div>
        </div>
    </div>
</div>
</body>
</html>
<!-- /.container-fluid -->

<script>
    (function(){
       /* $.ajax({ url: "/brand/list", success: function(data){
            $("#t_body").html(data);
        }},"html");*/
        $('#t_table').load("/brand/list");

        $(".form_datetime").datetimepicker({
            autoclose: true,
            minView: 2, // 配置只显示选择天的视图
            startDate: "1970-01-01"
        });
    }());
</script>

