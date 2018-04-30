package com.dosmil_e.kit.core.model.behavior.custommgrs;

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



public class KitBehaviorOwner_ownedBehaviors_addNew_BehaviorInHandlerProjection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitBehaviorOwner_ownedBehaviors_addNew_BehaviorInHandlerProjection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.behavior.meta.KitBehaviorInHandlerProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorOwnerMeta.vm3RelOwnedBehaviors
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitBehaviorOwner_ownedBehaviors_addNew_BehaviorInHandlerProjection anAction =
      new KitBehaviorOwner_ownedBehaviors_addNew_BehaviorInHandlerProjection( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createBehaviorInHandlerProjection.gif");
  }






}







