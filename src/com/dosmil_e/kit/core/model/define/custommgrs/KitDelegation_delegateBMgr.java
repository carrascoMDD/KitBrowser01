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


public class KitDelegation_delegateBMgr extends EAIBranchMgr {


  public KitDelegation_delegateBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getDelegate( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc getDelegate( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc aDelegation = null;
      try { aDelegation = (com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aDelegation == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc aDelegate = null;
      try { aDelegate = aDelegation.getDelegate( aCtxt);} catch( EAIException anEx) {}

	    return aDelegate;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "Delegate"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "delegate: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					KitDelegation_delegate_setChosen_Port.class,
					KitDelegation_delegate_setChosen_PortProjection.class,
					KitDelegation_delegate_setChosen_InteractionPortal.class,
					KitDelegation_delegate_setChosen_InteractionInterface.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "delegate ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitDelegation_delegate_remove.class
        }
      )
    };
  }



}


