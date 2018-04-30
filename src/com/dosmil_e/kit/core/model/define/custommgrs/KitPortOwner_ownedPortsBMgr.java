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


public class KitPortOwner_ownedPortsBMgr extends EAIBranchMgr {


  public KitPortOwner_ownedPortsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedPorts( theNode);
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc[] getOwnedPorts( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc aPortOwner = null;
      try { aPortOwner = (com.dosmil_e.kit.core.model.define.ifc.KitPortOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aPortOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractPortIfc[] someOwnedPorts = null;
      try { someOwnedPorts = aPortOwner.getOwnedPorts( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedPorts;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedPorts"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedPorts: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitPortOwner_ownedPorts_addNew_Port.class,
					KitPortOwner_ownedPorts_addNew_PortProjection.class,
					KitPortOwner_ownedPorts_addNew_InteractionPortal.class,
					KitPortOwner_ownedPorts_addNew_InteractionInterface.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "ownedPorts + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitAbstractPort_delete.class
        }
      )
    };
  }






}


