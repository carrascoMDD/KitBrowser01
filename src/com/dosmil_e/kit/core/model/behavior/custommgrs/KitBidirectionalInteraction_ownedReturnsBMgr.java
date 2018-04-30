package com.dosmil_e.kit.core.model.behavior.custommgrs;

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


public class KitBidirectionalInteraction_ownedReturnsBMgr extends EAIBranchMgr {


  public KitBidirectionalInteraction_ownedReturnsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedReturns( theNode);
    }




    protected com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc[] getOwnedReturns( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitBidirectionalInteractionIfc aBidirectionalInteraction = null;
      try { aBidirectionalInteraction = (com.dosmil_e.kit.core.model.behavior.ifc.KitBidirectionalInteractionIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aBidirectionalInteraction == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitReturnIfc[] someOwnedReturns = null;
      try { someOwnedReturns = aBidirectionalInteraction.getOwnedReturns( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedReturns;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedReturns"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedReturns: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitBidirectionalInteraction_ownedReturns_addNew_Return.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "ownedReturns + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitReturn_delete.class
        }
      )
    };
  }






}


