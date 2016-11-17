!(function () {

    'use strict';

    var originalFormToArray = $.fn.formToArray;
    // 过滤表单中时间参数值为空字符串
    $.fn.formToArray = function () {
        var a = originalFormToArray.apply(this, arguments);
        return a.filter(function (item) {
            return item.value !== '';
        });
    };

}());