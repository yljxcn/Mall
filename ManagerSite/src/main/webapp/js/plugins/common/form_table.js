function initFormAndTable(options){
    options = $.extend({}, initFormAndTable.defaults, options);

    var $link;
    var linkOriginalHtml;

    $('#' + options.tableId).load(options.url);

    // 时间插件
    $('.'+ options.dateInputClass).datetimepicker({
        autoclose: true,
        minView: 2, // 配置只显示选择天的视图
        startDate: "1970-01-01"
    });

    // 表单 AJAX 提交处理
    $('#' + options.formId).ajaxForm({
        success:function (data) {
            // 避免刚进入列表页面的时候点击翻页到导致的 $link 未定义的错误
            if($link){
                $link.removeClass('disable');
                $link.html(linkOriginalHtml);
            }
            $('#' + options.tableId).html(data);
        },
        error:function(data){
            if($link){
                $link.removeClass('disable');
                $link.html(linkOriginalHtml);
            }
            alert('加载失败，请稍后重试')
        }
    });

    // 为搜索连接注册事件
    $('#' + options.searchLinkId).click(function(){
        $link = $(this);
        linkOriginalHtml = $link.html();

        $link.html('<i class="fa fa-fw fa-spinner fa-spin"></i> 加载...')
        $link.addClass('disable');

        $('#' + options.pageInputId).val(1);
        $('#' + options.formId).submit();
        return false;
    });

    // 为添加按钮注册事件
    $('#' + options.saveBtnId).click(function(){
        $('#' + options.contentBodyId).load(options.toSaveUrl);
    });

    // 为修改按钮注册事件
    $('#' + options.updateBtnId).click(function(){
        var id = $('#' + options.tableId).find('tr.info').data('id');
        if(id)
            $('#' + options.contentBodyId).load(options.toUpdateUrl + '?id=' + id);
    });

    // 为删除按钮注册事件
    $('#' + options.deleteBtnId).click(function(){
        var id = $('#' + options.tableId).find('tr.info').data('id');
        if(id)
            window.location.href = options.deleteUrl + '?id=' + id;
    });
}

// 一些默认设置
initFormAndTable.defaults = {
    contentBodyId: 'content_body',
    formId: 'search-form',
    tableId: 't_table',
    url: '/brand/list',
    toSaveUrl: '/brand/toSave',
    toUpdateUrl: '/brand/toUpdate',
    deleteUrl: '/brand/delete',
    searchLinkId: 'search-link',
    dateInputClass: 'form_datetime',
    pageInputId: 'currentPage',
    saveBtnId: 'save',
    updateBtnId: 'update',
    deleteBtnId: 'delete'
};