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


public class KitDelegator_delegatorOfBMgr extends EAIBranchMgr {


  public KitDelegator_delegatorOfBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getDelegatorOf( theNode);
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getDelegatorOf( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc aDelegator = null;
      try { aDelegator = (com.dosmil_e.kit.core.model.define.ifc.KitDelegatorIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aDelegator == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] someDelegatorOf = null;
      try { someDelegatorOf = aDelegator.getDelegatorOf( aCtxt);} catch( EAIException anEx) {}


	    return someDelegatorOf;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "DelegatorOf"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "delegatorOf: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitDelegator_delegatorOf_addChosen_AliasProjection.class,
					KitDelegator_delegatorOf_addChosen_Alias.class,
					KitDelegator_delegatorOf_addChosen_Relay.class,
					KitDelegator_delegatorOf_addChosen_RelayProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "delegatorOf ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitDelegator_delegatorOf_remove.class
        }
      )
    };
  }



}


