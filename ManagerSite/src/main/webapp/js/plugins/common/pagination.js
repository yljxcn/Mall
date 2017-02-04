function initPagination(options) {
    options = $.extend({}, initPagination.defaults, options);

    $('#pagination').twbsPagination({
        initiateStartPageClick: false,
        startPage: options.startPage,
        totalPages: options.totalPages,
        first: options.first,
        prev: options.prev,
        next: options.next,
        last: options.last,
        visiblePages: options.visiblePages,
        onPageClick: function (event, page) {
            $('#' + options.currentPageId).val(page);
            $('#' + options.formId).submit();
        }
    });
}

// 一些默认设置
initPagination.defaults = {
    formId: 'search-form',
    currentPageId: 'currentPage',
    startPage: 1,
    totalPages: 5,
    visiblePages: 5,
    first: '<i class="fa fa-fw fa-angle-double-left"></i>',
    prev: '<i class="fa fa-fw fa-angle-left"></i>',
    next: '<i class="fa fa-fw fa-angle-right"></i>',
    last: '<i class="fa fa-fw fa-angle-double-right"></i>'
};
