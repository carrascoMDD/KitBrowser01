package com.dosmil_e.kit.core.projection.projecting.custommgrs;

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


public class KitProjection_subProjectionsBMgr extends EAIBranchMgr {


  public KitProjection_subProjectionsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getSubProjections( theNode);
    }




    protected com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] getSubProjections( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc aProjection = null;
      try { aProjection = (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aProjection == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] someSubProjections = null;
      try { someSubProjections = aProjection.getSubProjections( aCtxt);} catch( EAIException anEx) {}


	    return someSubProjections;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "SubProjections"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "subProjections: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitProjection_subProjections_addNew_Hide.class,
					KitProjection_subProjections_addNew_Fachade.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "subProjections + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitProjection_delete.class
        }
      )
    };
  }






}


