package com.dosmil_e.kit.core.model.organize.custommgrs;

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


public class KitPackageOwner_subPackagesBMgr extends EAIBranchMgr {


  public KitPackageOwner_subPackagesBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getSubPackages( theNode);
    }




    protected com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc[] getSubPackages( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc aPackageOwner = null;
      try { aPackageOwner = (com.dosmil_e.kit.core.model.organize.ifc.KitPackageOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aPackageOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.organize.ifc.KitAbstractPackageIfc[] someSubPackages = null;
      try { someSubPackages = aPackageOwner.getSubPackages( aCtxt);} catch( EAIException anEx) {}


	    return someSubPackages;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "SubPackages"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "subPackages: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitPackageOwner_subPackages_addNew_Package.class,
					KitPackageOwner_subPackages_addNew_PackageProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "subPackages + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitAbstractPackage_delete.class
        }
      )
    };
  }






}


