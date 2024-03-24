package io.webfolder.cdp.type.runtime;

import lombok.Getter;

import java.util.List;

@Getter
public class GetPropertiesResult {

    private List<PropertyDescriptor> result;

    private List<InternalPropertyDescriptor> internalProperties;

    private ExceptionDetails exceptionDetails;

}
