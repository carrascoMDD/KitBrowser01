package com.dosmil_e.kit.core.model.structural.custommgrs;

// SetChosen

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitExposedStructuralFeature_exposed_setChosen_Attribute extends
  com.dosmil_e.browserbase.metamgrs.EAISetChosenAction {


  public KitExposedStructuralFeature_exposed_setChosen_Attribute(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.structural.meta.KitExposedStructuralFeatureMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.edoc.meta.KitAttributeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitExposedStructuralFeatureMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.structural.meta.KitExposedStructuralFeatureMeta.vm3RelExposed,
      com.dosmil_e.kit.core.model.edoc.customconfigs.KitAttributeChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitExposedStructuralFeature_exposed_setChosen_Attribute anAction =
      new KitExposedStructuralFeature_exposed_setChosen_Attribute(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseAttribute.gif");
  }






}




