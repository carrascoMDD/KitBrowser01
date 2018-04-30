package com.dosmil_e.kit.core.model.define.custommgrs;

// OneToManyManyAggregationBMgr

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


public class KitLinkOwner_ownedLinksBMgr extends EAIBranchMgr {


  public KitLinkOwner_ownedLinksBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedLinks( theNode);
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] getOwnedLinks( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc aLinkOwner = null;
      try { aLinkOwner = (com.dosmil_e.kit.core.model.define.ifc.KitLinkOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aLinkOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc[] someOwnedLinks = null;
      try { someOwnedLinks = aLinkOwner.getOwnedLinks( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedLinks;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedLinks"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedLinks: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitLinkOwner_ownedLinks_addNew_Connection.class,
					KitLinkOwner_ownedLinks_addNew_Link.class,
					KitLinkOwner_ownedLinks_addNew_LinkProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "ownedLinks + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitAbstractLink_delete.class
        }
      )
    };
  }






}


