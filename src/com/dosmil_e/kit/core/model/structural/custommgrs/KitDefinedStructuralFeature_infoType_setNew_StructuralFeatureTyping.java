package com.dosmil_e.kit.core.model.structural.custommgrs;

// SetNew

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitDefinedStructuralFeature_infoType_setNew_StructuralFeatureTyping extends
  com.dosmil_e.browserbase.metamgrs.EAISetNewAction {


  public KitDefinedStructuralFeature_infoType_setNew_StructuralFeatureTyping(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.structural.meta.KitDefinedStructuralFeatureMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureTypingMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitDefinedStructuralFeatureMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.structural.meta.KitDefinedStructuralFeatureMeta.vm3RelInfoType
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDefinedStructuralFeature_infoType_setNew_StructuralFeatureTyping anAction =
      new KitDefinedStructuralFeature_infoType_setNew_StructuralFeatureTyping(
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }



  protected void initIcon() {
    vIcon = new ImageIcon("images/createStructuralFeatureTyping.gif");
  }






}







