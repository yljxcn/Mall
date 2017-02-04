// 为表格每行选中添加底色
function initTrSelected(options){
    options = $.extend({}, initTrSelected.defaults, options);

    $('tbody#' + options.tbodyId).on('click', 'tr', function(){
        var $tr = $(this);
        $('div.button-group button.btn').removeClass('disabled');
        $('tbody#' + options.tbodyId + ' > tr').removeClass(options.colorClass);
        $tr.addClass(options.colorClass);
    });
}

initTrSelected.defaults = {
    tbodyId: 't_body',
    colorClass: 'info'
};