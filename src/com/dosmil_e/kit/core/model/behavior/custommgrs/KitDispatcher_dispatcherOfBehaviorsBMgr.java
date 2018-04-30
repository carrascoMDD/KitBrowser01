package com.dosmil_e.kit.core.model.behavior.custommgrs;

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


public class KitDispatcher_dispatcherOfBehaviorsBMgr extends EAIBranchMgr {


  public KitDispatcher_dispatcherOfBehaviorsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getDispatcherOfBehaviors( theNode);
    }




    protected com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc[] getDispatcherOfBehaviors( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc aDispatcher = null;
      try { aDispatcher = (com.dosmil_e.kit.core.model.behavior.ifc.KitDispatcherIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aDispatcher == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc[] someDispatcherOfBehaviors = null;
      try { someDispatcherOfBehaviors = aDispatcher.getDispatcherOfBehaviors( aCtxt);} catch( EAIException anEx) {}


	    return someDispatcherOfBehaviors;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "DispatcherOfBehaviors"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "dispatcherOfBehaviors: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandlerProjection.class,
					KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandler.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "dispatcherOfBehaviors ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitDispatcher_dispatcherOfBehaviors_remove.class
        }
      )
    };
  }



}


