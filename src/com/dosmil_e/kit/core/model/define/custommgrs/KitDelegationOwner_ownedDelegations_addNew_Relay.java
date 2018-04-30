package com.dosmil_e.kit.core.model.define.custommgrs;

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



public class KitDelegationOwner_ownedDelegations_addNew_Relay extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitDelegationOwner_ownedDelegations_addNew_Relay(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitRelayMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitDelegationOwnerMeta.vm3RelOwnedDelegations
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDelegationOwner_ownedDelegations_addNew_Relay anAction =
      new KitDelegationOwner_ownedDelegations_addNew_Relay( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createRelay.gif");
  }






}







