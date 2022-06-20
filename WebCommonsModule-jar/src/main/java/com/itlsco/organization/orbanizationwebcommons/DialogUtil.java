/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itlsco.organization.orbanizationwebcommons;

import java.util.HashMap;
import java.util.Map;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author milind
 */
public class DialogUtil {

    /**
     * Uses Primefaces dialog framework. Default width and height is 98%, and
     * closable is true.
     *
     * @param <E>
     * @param entity instance of an entity or any pojo pass to the dialog page
     * @param entityName String name passed in flash like
     * getExternalContext().getFlash().put(entityName, entity);
     * @param dialogPage full path of the xhtml page to show in the dialog.
     */
    public static <E> void showDialog( String dialogPage) {
        Map<String, Object> options = new HashMap<>();
        options.put("model", true);
        options.put("dynamic", true);
        options.put("closeOnEscape", true);
        options.put("closable", true);
        options.put("resizable", true);
        options.put("responsive", true);
        options.put("draggable", true);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
        options.put("width", "98%");
        options.put("height", "98%");
        PrimeFaces.current().dialog().openDynamic(dialogPage, options, null);

    }
    /**
     * Uses Primefaces dialog framework. Default width and height is 98%, and
     * closable is true.
     *
     * @param <E>
     * @param entity instance of an entity or any pojo pass to the dialog page
     * @param entityName String name passed in flash like
     * getExternalContext().getFlash().put(entityName, entity);
     * @param dialogPage full path of the xhtml page to show in the dialog.
     */
    public static <E> void showDialog(E entity, String entityName, String dialogPage) {
        showDialog(entity, entityName, dialogPage, true, "98%", "98%");
    }

    /**
     * Uses Primefaces dialog framework.Default width and height is 98%.
     *
     * @param <E>
     * @param entity instance of an entity or any pojo pass to the dialog page
     * @param entityName String name passed in flash like
     * getExternalContext().getFlash().put(entityName, entity);
     * @param dialogPage full path of the xhtml page to show in the dialog.
     * @param closable
     */
    public static <E> void showDialog(E entity, String entityName, String dialogPage, boolean closable) {
        showDialog(entity, entityName, dialogPage, closable, "98%", "98%");
    }

    /**
     * Uses Primefaces dialog framework.
     *
     * @param <E>
     * @param entity instance of an entity or any pojo pass to the dialog page
     * @param entityName String name passed in flash like
     * getExternalContext().getFlash().put(entityName, entity);
     * @param dialogPage full path of the xhtml page to show in the dialog.
     * @param closable whether dialog is closable and also by escape key
     * @param width with percent sign like "75%"
     * @param height with percent sign like "75%"
     */
    public static <E> void showDialog(E entity, String entityName, String dialogPage, boolean closable, String width, String height) {
        Map<String, Object> options = new HashMap<>();
        options.put("model", true);
        options.put("dynamic", true);
        options.put("closeOnEscape", closable);
        options.put("closable", closable);
        options.put("resizable", true);
        options.put("responsive", true);
        options.put("draggable", true);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
        options.put("width", width);
        options.put("height", height);

        //transfer selected category to dialog
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put(entityName, entity);
        PrimeFaces.current().dialog().openDynamic(dialogPage, options, null);
    }
}
