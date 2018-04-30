package com.dosmil_e.kit.core.model.define.custommgrs;

// OneToManyManyBMgr

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


public class KitAbstractPort_connectedLinksBMgr extends EAIBranchMgr {


  public KitAbstractPort_connectedLinksBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getConnectedLinks( theNode);
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getConnectedLinks( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc aAbstractPort = null;
      try { aAbstractPort = (com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aAbstractPort == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] someConnectedLinks = null;
      try { someConnectedLinks = aAbstractPort.getConnectedLinks( aCtxt);} catch( EAIException anEx) {}


	    return someConnectedLinks;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "ConnectedLinks"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "connectedLinks: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitAbstractPort_connectedLinks_addChosen_Connection.class,
					KitAbstractPort_connectedLinks_addChosen_Link.class,
					KitAbstractPort_connectedLinks_addChosen_LinkProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "connectedLinks ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitAbstractPort_connectedLinks_remove.class
        }
      )
    };
  }



}


