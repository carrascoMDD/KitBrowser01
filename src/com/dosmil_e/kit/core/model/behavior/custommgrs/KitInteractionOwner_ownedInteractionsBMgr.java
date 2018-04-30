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


public class KitInteractionOwner_ownedInteractionsBMgr extends EAIBranchMgr {


  public KitInteractionOwner_ownedInteractionsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedInteractions( theNode);
    }




    protected com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc[] getOwnedInteractions( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc aInteractionOwner = null;
      try { aInteractionOwner = (com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aInteractionOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitInteractionIfc[] someOwnedInteractions = null;
      try { someOwnedInteractions = aInteractionOwner.getOwnedInteractions( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedInteractions;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedInteractions"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedInteractions: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitInteractionOwner_ownedInteractions_addNew_Responded.class,
					KitInteractionOwner_ownedInteractions_addNew_RespondedProjection.class,
					KitInteractionOwner_ownedInteractions_addNew_Requested.class,
					KitInteractionOwner_ownedInteractions_addNew_RequestedProjection.class,
					KitInteractionOwner_ownedInteractions_addNew_Signaled.class,
					KitInteractionOwner_ownedInteractions_addNew_SignaledProjection.class,
					KitInteractionOwner_ownedInteractions_addNew_Listened.class,
					KitInteractionOwner_ownedInteractions_addNew_ListenedProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "ownedInteractions + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitInteraction_delete.class
        }
      )
    };
  }






}


