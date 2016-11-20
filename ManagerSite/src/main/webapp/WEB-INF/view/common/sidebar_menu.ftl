<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
<div class="collapse navbar-collapse navbar-ex1-collapse">
    <#assign menus = [
        {
            'name': '首页',
            'englishName': 'index',
            'path': '/index',
            'icon': 'fa fa-fw fa-home',
            'active': false,
            'subMenus':[]
        },
        {
            'name': '商品',
            'flag': 'product',
            'path': '#',
            'icon': 'fa fa-fw fa-cubes',
            'active': false,
            'subMenus':[
                {
                    'name': '品牌',
                    'path': '/brand/page',
                    'icon': 'fa fa-fw fa-bookmark',
                    'active': false

                },
                {
                    'name': '分类',
                    'path': '/catalog/page',
                    'icon': 'fa fa-fw fa-navicon',
                    'active': false
                },
                {
                    'name': '商品',
                    'path': '/product/page',
                    'icon': 'fa fa-fw fa-cube',
                    'active': false
                },
                {
                    'name': 'SKU 属性',
                    'path': '/skuProperty/page',
                    'icon': 'fa fa-fw fa-dashboard',
                    'active': false
                },
                {
                    'name': 'SKU',
                    'path': '/sku/page',
                    'icon': 'fa fa-fw fa-barcode',
                    'active': false
                }
            ]
        },
        {
            'name': '订单',
            'flag': 'order',
            'path': '#',
            'icon': 'fa fa-fw fa-shopping-cart',
            'active': false,
            'subMenus':[
                {
                    'name': '订单',
                    'path': '#',
                    'icon': 'fa fa-fw fa-shopping-cart',
                    'active': false
                }
            ]
        }
    ]>
    <ul class="nav navbar-nav side-nav">
        <#list menus as menu>
            <#if menu.subMenus?size gt 0>
                <li>
                    <a href="javascript:;" data-toggle="collapse" data-target="#${menu.flag}"><i class="${menu.icon}"></i> ${menu.name} <i class="fa fa-fw fa-caret-down"></i></a>
                    <ul id="${menu.flag}" class="sub-menu collapse">
                        <#list menu.subMenus as subMenu>
                            <li>
                                <a href="${subMenu.path}"><i class="${subMenu.icon}"></i> ${subMenu.name}</a>
                            </li>
                        </#list>
                    </ul>
                </li>
            <#else>
                <li class="${menu.active?string('active','')}">
                    <a href="${menu.path}"><i class="${menu.icon}"></i> ${menu.name}</a>
                </li>
            </#if>
        </#list>
    </ul>
</div>

<#-- 静态的页面
<ul class="nav navbar-nav side-nav">
    <li>
        <a href="/index"><i class="fa fa-fw fa-home"></i> 首页</a>
    </li>
    <li>
        <a href="javascript:;" data-toggle="collapse" data-target="#product"><i class="fa fa-fw fa-cubes"></i> 商品 <i class="fa fa-fw fa-caret-down"></i></a>
        <ul id="product" class="collapse">
            <li>
                <a href="/brand/page"><i class="fa fa-fw fa-bookmark"></i> 品牌</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-fw fa-navicon"></i> 分类</a>
            </li>
            <li class="active">
                <a href="#"><i class="fa fa-fw fa-cube"></i> 商品</a>
            </li>
        </ul>
    </li>
    <li>
        <a href="javascript:;" data-toggle="collapse" data-target="#order"><i class="fa fa-fw fa-shopping-cart"></i> 订单 <i class="fa fa-fw fa-caret-down"></i></a>
        <ul id="order" class="collapse">
            <li>
                <a href="#">订单</a>
            </li>
        </ul>
    </li>
</ul>-->

<#-- 纯模板的方式，但需要菜单在后台生成并加 acitve 返回
<ul class="nav navbar-nav side-nav">
<#list menus as menu>
    <#if menu.subMenus?size gt 0>
        <li>
            <a class="${menu.active?string('','collapsed')}" href="javascript:;" data-toggle="collapse" data-target="#${menu.flag}" aria-expanded="${menu.active?string('true','false')}"><i class="${menu.icon}"></i> ${menu.name} <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="${menu.flag}" class="collapse${menu.active?string(' in','')}" aria-expanded="${menu.active?string('true','false')}" style="${menu.active?string('','height: 0px;')}">
                <#list menu.subMenus as subMenu>
                    <li class="${subMenu.active?string('active','')}">
                        <a href="${subMenu.path}"><i class="${subMenu.icon}"></i> ${subMenu.name}</a>
                    </li>
                </#list>
            </ul>
        </li>
    <#else>
        <li class="${menu.active?string('active','')}">
            <a href="${menu.path}"><i class="${menu.icon}"></i> ${menu.name}</a>
        </li>
    </#if>
</#list>
</ul>
-->
