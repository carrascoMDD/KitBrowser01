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


public class KitDelegationOwner_ownedDelegationsBMgr extends EAIBranchMgr {


  public KitDelegationOwner_ownedDelegationsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedDelegations( theNode);
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getOwnedDelegations( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc aDelegationOwner = null;
      try { aDelegationOwner = (com.dosmil_e.kit.core.model.define.ifc.KitDelegationOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aDelegationOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] someOwnedDelegations = null;
      try { someOwnedDelegations = aDelegationOwner.getOwnedDelegations( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedDelegations;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedDelegations"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedDelegations: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitDelegationOwner_ownedDelegations_addNew_AliasProjection.class,
					KitDelegationOwner_ownedDelegations_addNew_Alias.class,
					KitDelegationOwner_ownedDelegations_addNew_Relay.class,
					KitDelegationOwner_ownedDelegations_addNew_RelayProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "ownedDelegations + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitDelegation_delete.class
        }
      )
    };
  }






}


