package com.dosmil_e.kit.core.model.observe.custommgrs;

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


public class KitDependencyOwner_ownedDependenciesBMgr extends EAIBranchMgr {


  public KitDependencyOwner_ownedDependenciesBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOwnedDependencies( theNode);
    }




    protected com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc[] getOwnedDependencies( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc aDependencyOwner = null;
      try { aDependencyOwner = (com.dosmil_e.kit.core.model.observe.ifc.KitDependencyOwnerIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aDependencyOwner == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.observe.ifc.KitDependencyIfc[] someOwnedDependencies = null;
      try { someOwnedDependencies = aDependencyOwner.getOwnedDependencies( aCtxt);} catch( EAIException anEx) {}


	    return someOwnedDependencies;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OwnedDependencies"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "ownedDependencies: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitDependencyOwner_ownedDependencies_addNew_Dependency.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "ownedDependencies + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitDependency_delete.class
        }
      )
    };
  }






}


