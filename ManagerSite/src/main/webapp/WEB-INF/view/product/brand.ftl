<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

<#include "../common/link.ftl" />
<link href="/css/product/brand.css" rel="stylesheet">

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
                        商品
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-dashboard"></i> 品牌
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
                        <div class="form-group">
                            <label>创立时间</label>
                            <input class="form-control">
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

    </div>
    <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

</body>

<script>
    (function(){
        $.ajax({ url: "/brand/list", success: function(data){
            $("#t_body").html(data);
        }},"html");
    }());
</script>

</html>
