package io.webfolder.cdp.type.runtime;

import java.util.List;

public class GetPropertiesResult {
    private List<PropertyDescriptor> result;

    private List<InternalPropertyDescriptor> internalProperties;

    private ExceptionDetails exceptionDetails;

    public List<PropertyDescriptor> getResult() {
        return result;
    }

    public List<InternalPropertyDescriptor> getInternalProperties() {
        return internalProperties;
    }

    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }
}
