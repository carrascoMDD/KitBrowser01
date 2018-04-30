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



public class KitLinkOwner_ownedLinks_addNew_Connection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitLinkOwner_ownedLinks_addNew_Connection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitLinkOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.edoc.meta.KitConnectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitLinkOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitLinkOwnerMeta.vm3RelOwnedLinks
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitLinkOwner_ownedLinks_addNew_Connection anAction =
      new KitLinkOwner_ownedLinks_addNew_Connection( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createConnection.gif");
  }






}







