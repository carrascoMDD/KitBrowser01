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



public class KitBidirectionalInteraction_ownedReturns_addNew_Return extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitBidirectionalInteraction_ownedReturns_addNew_Return(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitBidirectionalInteractionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitReturnMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitBidirectionalInteractionMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitBidirectionalInteractionMeta.vm3RelOwnedReturns
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitBidirectionalInteraction_ownedReturns_addNew_Return anAction =
      new KitBidirectionalInteraction_ownedReturns_addNew_Return( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createReturn.gif");
  }






}







