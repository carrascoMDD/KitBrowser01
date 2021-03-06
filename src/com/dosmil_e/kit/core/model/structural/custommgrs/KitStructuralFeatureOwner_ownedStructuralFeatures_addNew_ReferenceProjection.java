package com.dosmil_e.kit.core.model.structural.custommgrs;

// AddNew

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_ReferenceProjection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_ReferenceProjection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.structural.meta.KitReferenceProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.structural.meta.KitStructuralFeatureOwnerMeta.vm3RelOwnedStructuralFeatures
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_ReferenceProjection anAction =
      new KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_ReferenceProjection( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createReferenceProjection.gif");
  }






}







