<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

<#include "link.ftl" />

</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <#include "brand.ftl" />
        <#include "top_menu.ftl" />
        <#include "sidebar_menu.ftl" />
    </nav>

    <div id="page-wrapper">

    </div>
    <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

</body>
<script>
    (function(){
        $.ajax({ url: "${url}", success: function(data){
            $("#page-wrapper").html(data);
        }},"html");
        $("#page-wrapper").load("${url}");
    }());

//    $("ul.side-nav li a").click(function(){
//        var $a = $(this);
//        var href = $a.attr("href");
//        if(!href || href == "#" || href == "javascript:;")
//            return;
//        $('#page-wrapper').load(href);
//        return false;
//    });

    $("ul.side-nav").on("click", "li > a", function (e) {
        e.preventDefault();

        var $target = $(this);
        var href = $target.attr("href");

        if (!href || href == "#" || href == "javascript:;")
            return;
        $('#page-wrapper').load(href);
    });

     $.fn.datetimepicker.dates['en'] = $.fn.datetimepicker.dates['zh-CN'];
</script>
</html>
