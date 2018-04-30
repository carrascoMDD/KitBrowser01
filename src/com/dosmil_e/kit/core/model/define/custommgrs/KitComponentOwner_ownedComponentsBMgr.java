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


public class KitComponentOwner_ownedComponentsBMgr extends EAIBranchMgr {


  public KitComponentOwner_ownedComponentsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedComponents( theNode);
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc[] getOwnedComponents( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc aComponentOwner = null;
      try { aComponentOwner = (com.dosmil_e.kit.core.model.define.ifc.KitComponentOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aComponentOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractComponentIfc[] someOwnedComponents = null;
      try { someOwnedComponents = aComponentOwner.getOwnedComponents( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedComponents;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedComponents"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedComponents: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitComponentOwner_ownedComponents_addNew_InternalRole.class,
					KitComponentOwner_ownedComponents_addNew_ProcessType.class,
					KitComponentOwner_ownedComponents_addNew_Resource.class,
					KitComponentOwner_ownedComponents_addNew_ComponentProjection.class,
					KitComponentOwner_ownedComponents_addNew_ExternalRole.class,
					KitComponentOwner_ownedComponents_addNew_Component.class,
					KitComponentOwner_ownedComponents_addNew_PrimitiveProcess.class,
					KitComponentOwner_ownedComponents_addNew_CompositeProcess.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "ownedComponents + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitAbstractComponent_delete.class
        }
      )
    };
  }






}


