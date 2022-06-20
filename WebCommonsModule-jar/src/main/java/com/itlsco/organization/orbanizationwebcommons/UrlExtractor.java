/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itlsco.organization.orbanizationwebcommons;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author milind
 */
@Named(value = "urlExtractor")
@RequestScoped
public class UrlExtractor {

    @Inject
    private ExternalContext externalContext;

    /**
     * Creates a new instance of UrlExtractor
     */
    public UrlExtractor() {
    }

    public String getRootUrl() {
        //externalContext = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        String requestURI = request.getRequestURI();
        String url = requestURL.substring(0, requestURL.length() - requestURI.length() + 1);
        return url;
    }
}
