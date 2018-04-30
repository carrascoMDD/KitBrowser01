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


public class KitBehaviorOwner_ownedBehaviorsBMgr extends EAIBranchMgr {


  public KitBehaviorOwner_ownedBehaviorsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedBehaviors( theNode);
    }




    protected com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc[] getOwnedBehaviors( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc aBehaviorOwner = null;
      try { aBehaviorOwner = (com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aBehaviorOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitBehaviorIfc[] someOwnedBehaviors = null;
      try { someOwnedBehaviors = aBehaviorOwner.getOwnedBehaviors( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedBehaviors;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedBehaviors"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedBehaviors: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitBehaviorOwner_ownedBehaviors_addNew_BehaviorInHandlerProjection.class,
					KitBehaviorOwner_ownedBehaviors_addNew_BehaviorInHandler.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "ownedBehaviors + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitBehavior_delete.class
        }
      )
    };
  }






}


