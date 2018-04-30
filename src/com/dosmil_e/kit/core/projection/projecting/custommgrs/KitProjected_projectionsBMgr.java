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


public class KitProjected_projectionsBMgr extends EAIBranchMgr {


  public KitProjected_projectionsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getProjections( theNode);
    }




    protected com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc[] getProjections( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc aProjected = null;
      try { aProjected = (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectedIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aProjected == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.projection.projecting.ifc.KitFachadeIfc[] someProjections = null;
      try { someProjections = aProjected.getProjections( aCtxt);} catch( EAIException anEx) {}


	    return someProjections;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "Projections"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "projections: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitProjected_projections_addNew_Fachade.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "projections + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitFachade_delete.class
        }
      )
    };
  }






}


