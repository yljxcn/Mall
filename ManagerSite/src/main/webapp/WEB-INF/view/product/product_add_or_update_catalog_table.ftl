<#list voes as vo>
    <tr>
        <td>${vo.catalogProperty.name}</td>
        <td>
            <#if vo.catalogProperty.isRelationship()>
                <select class="form-control">
                    <#list vo.catalogPropertyValues as v>
                        <option value="${v.value}">${v.value}</option>
                    </#list>
                </select>
            <#else >
                <#list vo.catalogPropertyValues as v>
                    <input class="form-control" value="${v.value}">
                </#list>
            </#if>
        </td>
    </tr>
</#list>

