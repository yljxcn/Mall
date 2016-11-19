<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <#include "../common/link.ftl" />
    <script>
        $(function(){
            initMenu();
            initFormAndTable();

            $('.mods-select').change(function(){
                var $select = $(this);
                var val = $select.find('option:selected').html();
                if(val == '请选择'){
                    $select.removeAttr('name');
                }else if(val == '显示'){
                    $select.attr('name', 'includeMods')
                }
                else if(val == '隐藏'){
                    $select.attr('name', 'excludeMods')
                }
            });
        });
    </script>

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
                    <button type="button" class="btn btn-primary"><i class="fa fa-fw fa-plus"></i> 增加</button>
                    <button type="button" class="btn btn-primary disabled"><i class="fa fa-fw fa-edit"></i> 修改</button>
                    <button type="button" class="btn btn-danger disabled"><i class="fa fa-fw fa-minus"></i> 删除</button>
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".addOrUpdate">模态框</button>
                </div>
                <div class="col-lg-3 text-right">
                    <button id="search-link" type="button" class="btn btn-default"><i class="fa fa-fw fa-search"></i> 搜索</button>
                </div>
            </div>

            <div class="row">
                <form role="form" id="search-form" action="/brand/list">
                    <input type="hidden" name="page" id="currentPage" value="1">
                    <div class="col-lg-3">
                        <div class="form-group">
                            <label>中文名</label>
                            <input class="form-control" name="likeChineseName">
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="form-group">
                            <label>创立时间</label>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="date form_datetime input-group">
                                        <input size="16" name="startFoundDate" type="text" readonly class="form-control">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-remove"></i></span>
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="date form_datetime input-group">
                                        <input size="16" name="endFoundDate" type="text" readonly class="form-control">
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
                            <select class="form-control mods-select">
                                <option>请选择</option>
                                <option value="1">显示</option>
                                <option value="1">隐藏</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>

            <div class="row">
                <div class="col-lg-12" id="t_table">

                </div>
            </div>
        </div>
    </div>
    <!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->
<#include "brand_modal.ftl">
</body>
</html>
<!-- /.container-fluid -->



