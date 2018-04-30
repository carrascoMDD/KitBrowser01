package com.dosmil_e.kit.core.model.structural.custommgrs;

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


public class KitInfoTypeOwner_ownedInfoTypesBMgr extends EAIBranchMgr {


  public KitInfoTypeOwner_ownedInfoTypesBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedInfoTypes( theNode);
    }




    protected com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc[] getOwnedInfoTypes( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc aInfoTypeOwner = null;
      try { aInfoTypeOwner = (com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aInfoTypeOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitInfoTypeIfc[] someOwnedInfoTypes = null;
      try { someOwnedInfoTypes = aInfoTypeOwner.getOwnedInfoTypes( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedInfoTypes;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedInfoTypes"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedInfoTypes: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitInfoTypeOwner_ownedInfoTypes_addNew_PrimitiveJavaClass.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_PrimitiveJavaClassProjection.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_EnumeratedTypeProjection.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_EnumeratedType.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_StructuredType.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_DocumentProjection.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_BusinessSignal.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_Document.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_Content.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_StructuredJavaClass.class,
					KitInfoTypeOwner_ownedInfoTypes_addNew_StructuredJavaClassProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "ownedInfoTypes + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitInfoType_delete.class
        }
      )
    };
  }






}


