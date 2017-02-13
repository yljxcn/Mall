<#list voes as vo>
    <tr>
        <td>${vo.catalogProperty.name}<input type="hidden" name="productCatalogPropertyValues[${vo_index}].catalogPropertyId" value="${vo.catalogProperty.id}"></td>
        <td>
            <#if vo.catalogProperty.isRelationship()>
                <select class="form-control" name="productCatalogPropertyValues[${vo_index}].value">
                    <#list vo.catalogPropertyAndValues as v>
                        <option value="${v.catalogPropertyValue.value}" <#if v?? && v.show>selected</#if>>${v.catalogPropertyValue.value}</option>
                    </#list>
                </select>
            <#else >
                <#list vo.catalogPropertyValues as v>
                    <input name="productCatalogPropertyValues[${vo_index}].value" class="form-control" value="${v.catalogPropertyValue.value}">
                </#list>
            </#if>
        </td>
    </tr>
</#list>

