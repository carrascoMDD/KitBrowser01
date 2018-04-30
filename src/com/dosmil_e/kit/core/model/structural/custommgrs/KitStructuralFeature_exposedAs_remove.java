package com.dosmil_e.kit.core.model.structural.custommgrs;

// Remove

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitStructuralFeature_exposedAs_remove extends
  com.dosmil_e.browserbase.metamgrs.EAIRemoveAction {


  public KitStructuralFeature_exposedAs_remove(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureMeta.vm3RelExposedAs
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitStructuralFeature_exposedAs_remove anAction =
      new KitStructuralFeature_exposedAs_remove(
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/remove$RelatedConcreteTypeName$.gif");
  }






}







