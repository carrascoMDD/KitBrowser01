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



public class KitInteractionOwner_ownedInteractions_addNew_SignaledProjection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitInteractionOwner_ownedInteractions_addNew_SignaledProjection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.behavior.meta.KitSignaledProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitInteractionOwnerMeta.vm3RelOwnedInteractions
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitInteractionOwner_ownedInteractions_addNew_SignaledProjection anAction =
      new KitInteractionOwner_ownedInteractions_addNew_SignaledProjection( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createSignaledProjection.gif");
  }






}







