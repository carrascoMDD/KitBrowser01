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


public class KitDelegate_delegateOfBMgr extends EAIBranchMgr {


  public KitDelegate_delegateOfBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getDelegateOf( theNode);
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] getDelegateOf( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc aDelegate = null;
      try { aDelegate = (com.dosmil_e.kit.core.model.define.ifc.KitDelegateIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aDelegate == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitDelegationIfc[] someDelegateOf = null;
      try { someDelegateOf = aDelegate.getDelegateOf( aCtxt);} catch( EAIException anEx) {}


	    return someDelegateOf;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "DelegateOf"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "delegateOf: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitDelegate_delegateOf_addChosen_AliasProjection.class,
					KitDelegate_delegateOf_addChosen_Alias.class,
					KitDelegate_delegateOf_addChosen_Relay.class,
					KitDelegate_delegateOf_addChosen_RelayProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "delegateOf ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitDelegate_delegateOf_remove.class
        }
      )
    };
  }



}


