package com.adamzfc.router.compiler;

import java.util.List;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

public class RouterActivityModel {
    private boolean isNeedBind;
    /** activity */
    private TypeElement element;
    private String actionName;
    /** transition view name */
    private String SceneTransitionElementName;
    /** transition view */
    private Element SceneTransitionElement;
    private List<Element> ExtraElements;
    private List<String> ExtraElementKeys;

    String getSceneTransitionElementName() {
        return SceneTransitionElementName;
    }

    void setSceneTransitionElementName(String sceneTransitionElementName) {
        SceneTransitionElementName = sceneTransitionElementName;
    }

    List<String> getExtraElementKeys() {
        return ExtraElementKeys;
    }

    void setExtraElementKeys(List<String> extraElementKeys) {
        ExtraElementKeys = extraElementKeys;
    }

    List<Element> getExtraElements() {
        return ExtraElements;
    }

    void setExtraElements(List<Element> extraElements) {
        ExtraElements = extraElements;
    }

    Element getSceneTransitionElement() {
        return SceneTransitionElement;
    }

    void setSceneTransitionElement(Element sceneTransitionElement) {
        SceneTransitionElement = sceneTransitionElement;
    }

    TypeElement getElement() {
        return element;
    }

    void setElement(TypeElement mElement) {
        this.element = mElement;
    }

    String getActionName() {
        return actionName;
    }

    void setActionName(String mActionName) {
        this.actionName = mActionName;
    }

    boolean isNeedBind() {
        return isNeedBind;
    }

    void setNeedBind(boolean needBind) {
        isNeedBind = needBind;
    }
}
