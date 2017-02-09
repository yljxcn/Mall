/**
 * Created by lony on 2017/2/9.
 */
function initRefresh(options){
    options = $.extend({}, initRefresh.defaults, options);

    $('.refresh-a').click(function(){
        var oId = $('#' + options.inputId).val();
        var $contentBody = $('#' + options.contentBodyId);

        if(oId)
            $contentBody.load(options.toUpdateUrl + '?id=' + oId);
        else
            $contentBody.load(options.toSaveUrl);

        return false;
    });
}

initRefresh.defaults = {
    contentBodyId: 'content_body',
    inputId: 'oId',
    toSaveUrl: '/brand/toSave',
    toUpdateUrl: '/brand/toUpdate'
};