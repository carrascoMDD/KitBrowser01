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



public class KitPortOwner_ownedPorts_addNew_PortProjection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitPortOwner_ownedPorts_addNew_PortProjection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.define.meta.KitPortProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitPortOwnerMeta.vm3RelOwnedPorts
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitPortOwner_ownedPorts_addNew_PortProjection anAction =
      new KitPortOwner_ownedPorts_addNew_PortProjection( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createPortProjection.gif");
  }






}







