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


public class KitHandler_handlerOfBehaviorsBMgr extends EAIBranchMgr {


  public KitHandler_handlerOfBehaviorsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getHandlerOfBehaviors( theNode);
    }




    protected com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc[] getHandlerOfBehaviors( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc aHandler = null;
      try { aHandler = (com.dosmil_e.kit.core.model.behavior.ifc.KitHandlerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aHandler == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.behavior.ifc.KitAbstractBehaviorInHandlerIfc[] someHandlerOfBehaviors = null;
      try { someHandlerOfBehaviors = aHandler.getHandlerOfBehaviors( aCtxt);} catch( EAIException anEx) {}


	    return someHandlerOfBehaviors;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "HandlerOfBehaviors"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "handlerOfBehaviors: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitHandler_handlerOfBehaviors_addChosen_BehaviorInHandlerProjection.class,
					KitHandler_handlerOfBehaviors_addChosen_BehaviorInHandler.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "handlerOfBehaviors ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitHandler_handlerOfBehaviors_remove.class
        }
      )
    };
  }



}


