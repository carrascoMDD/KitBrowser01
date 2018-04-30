package com.dosmil_e.kit.core.model.structural.custommgrs;

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


public class KitExposedStructuralFeature_exposedBMgr extends EAIBranchMgr {


  public KitExposedStructuralFeature_exposedBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getExposed( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc getExposed( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc aExposedStructuralFeature = null;
      try { aExposedStructuralFeature = (com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aExposedStructuralFeature == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc aExposed = null;
      try { aExposed = aExposedStructuralFeature.getExposed( aCtxt);} catch( EAIException anEx) {}

	    return aExposed;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "Exposed"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "exposed: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
    new EAIGenericActionsMgr(
        new Class[] {
					KitExposedStructuralFeature_exposed_setChosen_ReferenceProjection.class,
					KitExposedStructuralFeature_exposed_setChosen_Reference.class,
					KitExposedStructuralFeature_exposed_setChosen_AttributeProjection.class,
					KitExposedStructuralFeature_exposed_setChosen_Attribute.class,
					KitExposedStructuralFeature_exposed_setChosen_ExposedStructuralFeature.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "exposed ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitExposedStructuralFeature_exposed_remove.class
        }
      )
    };
  }



}


