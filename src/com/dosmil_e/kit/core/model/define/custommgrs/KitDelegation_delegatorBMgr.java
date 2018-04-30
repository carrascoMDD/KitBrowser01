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


public class KitDelegation_delegatorBMgr extends EAIBranchMgr {


  public KitDelegation_delegatorBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getDelegator( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc getDelegator( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc aDelegation = null;
      try { aDelegation = (com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aDelegation == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc aDelegator = null;
      try { aDelegator = aDelegation.getDelegator( aCtxt);} catch( EAIException anEx) {}

	    return aDelegator;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "Delegator"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "delegator: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					KitDelegation_delegator_setChosen_Port.class,
					KitDelegation_delegator_setChosen_PortProjection.class,
					KitDelegation_delegator_setChosen_InteractionPortal.class,
					KitDelegation_delegator_setChosen_InteractionInterface.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "delegator ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitDelegation_delegator_remove.class
        }
      )
    };
  }



}


