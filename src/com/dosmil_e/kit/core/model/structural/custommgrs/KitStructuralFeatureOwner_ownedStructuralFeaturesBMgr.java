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


public class KitStructuralFeatureOwner_ownedStructuralFeaturesBMgr extends EAIBranchMgr {


  public KitStructuralFeatureOwner_ownedStructuralFeaturesBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedStructuralFeatures( theNode);
    }




    protected com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc[] getOwnedStructuralFeatures( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc aStructuralFeatureOwner = null;
      try { aStructuralFeatureOwner = (com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aStructuralFeatureOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc[] someOwnedStructuralFeatures = null;
      try { someOwnedStructuralFeatures = aStructuralFeatureOwner.getOwnedStructuralFeatures( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedStructuralFeatures;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedStructuralFeatures"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedStructuralFeatures: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_ReferenceProjection.class,
					KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_Reference.class,
					KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_AttributeProjection.class,
					KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_Attribute.class,
					KitStructuralFeatureOwner_ownedStructuralFeatures_addNew_ExposedStructuralFeature.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "ownedStructuralFeatures + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitStructuralFeature_delete.class
        }
      )
    };
  }






}


