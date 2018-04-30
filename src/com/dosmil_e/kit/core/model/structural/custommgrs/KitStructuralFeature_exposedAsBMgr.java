package com.dosmil_e.kit.core.model.structural.custommgrs;

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


public class KitStructuralFeature_exposedAsBMgr extends EAIBranchMgr {


  public KitStructuralFeature_exposedAsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getExposedAs( theNode);
    }




    protected com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc[] getExposedAs( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc aStructuralFeature = null;
      try { aStructuralFeature = (com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aStructuralFeature == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitExposedStructuralFeatureIfc[] someExposedAs = null;
      try { someExposedAs = aStructuralFeature.getExposedAs( aCtxt);} catch( EAIException anEx) {}


	    return someExposedAs;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "ExposedAs"}, gChildrenAspect, this);
    }



    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "exposedAs: ";
    }


  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitStructuralFeature_exposedAs_addChosen_ExposedStructuralFeature.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "exposedAs ? (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitStructuralFeature_exposedAs_remove.class
        }
      )
    };
  }



}


