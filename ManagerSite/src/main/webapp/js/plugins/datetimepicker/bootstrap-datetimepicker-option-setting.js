!(function () {

  'use strict';

  var originalDatetimepicker = $.fn.datetimepicker;

  $.fn.datetimepicker = function () {
    // 将 Array-Like 转为 Array
    var args = $.makeArray(arguments);

    // 获取第一个参数
    var options = args[0];

    // 如果第一个参数是对象
    if($.isPlainObject(options)){

      var defaultOptions = {
        language: 'zh-CN',
        format: 'yyyy-mm-dd'
      };

      // 指定的选项会覆盖默认的选项
      args[0] = $.extend(defaultOptions, options);
    }

    // 调用原插件方法
    return originalDatetimepicker.apply(this, args);
  }

}());