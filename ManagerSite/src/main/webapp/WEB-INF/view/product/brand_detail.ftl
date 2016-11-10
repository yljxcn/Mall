<#list pagination.datas as data>
    <tr>
        <td><a href="${data.url}" target="_blank"><img class="brand-logo" src="${data.logo}"></a></td>
        <td>${data.foundTime?string("yyyy-MM-dd")}</td>
        <td>${data.chineseName}</td>
        <td>${data.englishName}</td>
        <td>${data.visibilityState}</td>
    </tr>
</#list>