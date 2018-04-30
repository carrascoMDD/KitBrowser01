package com.dosmil_e.kit.core.model.define.custommgrs;

// OneToManyOneBMgr

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;


import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.metamgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

 
import java.awt.Window;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.tree.TreeNode;

import java.util.Vector;


public class KitAbstractLink_connectedPortBMgr extends EAIBranchMgr {


  public KitAbstractLink_connectedPortBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getConnectedPort( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc getConnectedPort( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc aAbstractLink = null;
      try { aAbstractLink = (com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aAbstractLink == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc aConnectedPort = null;
      try { aConnectedPort = aAbstractLink.getConnectedPort( aCtxt);} catch( EAIException anEx) {}

	    return aConnectedPort;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "ConnectedPort"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "connectedPort: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					KitAbstractLink_connectedPort_setChosen_Port.class,
					KitAbstractLink_connectedPort_setChosen_PortProjection.class,
					KitAbstractLink_connectedPort_setChosen_InteractionPortal.class,
					KitAbstractLink_connectedPort_setChosen_InteractionInterface.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "connectedPort ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitAbstractLink_connectedPort_remove.class
        }
      )
    };
  }



}


