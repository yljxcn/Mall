function initFormAndTable(options){
    options = $.extend({}, initFormAndTable.defaults, options);

    var $link;
    var linkOriginalHtml;

    $('#' + options.tableId).load(options.url);
    $('.'+ options.dateInputClass).datetimepicker({
        autoclose: true,
        minView: 2, // 配置只显示选择天的视图
        startDate: "1970-01-01"
    });
    $('#' + options.formId).ajaxForm({
        success:function (data) {
            $link.removeClass('disable');
            $link.html(linkOriginalHtml);
            $('#' + options.tableId).html(data);
        },
        error:function(data){
            $link.removeClass('disable');
            $link.html(linkOriginalHtml);
            alert('加载失败，请稍后重试')
        }
    });
    $('#' + options.searchLinkId).click(function(){
        $link = $(this);
        linkOriginalHtml = $link.html();

        $link.html('<i class="fa fa-fw fa-spinner fa-spin"></i> 加载...')
        $link.addClass('disable');

        $('#' + options.pageInputId).val(1);
        $('#' + options.formId).submit();
        return false;
    });
}

initFormAndTable.defaults = {
    formId: 'search-form',
    tableId: 't_table',
    url: '/brand/list',
    searchLinkId: 'search-link',
    dateInputClass: 'form_datetime',
    pageInputId: 'currentPage'
};