<#list voes as vo>
    <tr>
        <td>${vo.catalogProperty.name}<input type="hidden" name="productCatalogPropertyValues[${vo_index}].catalogPropertyId" value="${vo.catalogProperty.id}"></td>
        <td>
            <#if vo.catalogProperty.isRelationship()>
                <select class="form-control" name="productCatalogPropertyValues[${vo_index}].value">
                    <#list vo.catalogPropertyValues as v>
                        <option value="${v.value}">${v.value}</option>
                    </#list>
                </select>
            <#else >
                <#list vo.catalogPropertyValues as v>
                    <input name="productCatalogPropertyValues[${vo_index}].value" class="form-control" value="${v.value}">
                </#list>
            </#if>
        </td>
    </tr>
</#list>

