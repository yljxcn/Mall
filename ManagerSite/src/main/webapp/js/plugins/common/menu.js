function initMenu(){
    var $a= $('ul.side-nav').find('li > a[href="' + window.location.pathname + '"]');
    if($a.length){
        var $pli = $a.parent('li');
        var $pul = $pli.parent('ul');

        $pli.addClass('active');
        if($pul.hasClass('sub-menu')){
            var $pa = $pul.prev('a');
            $pa.removeClass('collapsed').attr('aria-expanded', 'true');
            $pul.addClass('in').attr('aria-expanded', 'true').attr('style', '');
        }
    }
}