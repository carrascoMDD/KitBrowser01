package com.dosmil_e.kit.core.projection.projecting.custommgrs;

// ManyToManyBMgr

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


public class KitProjectable_originalOfProjectionsBMgr extends EAIBranchMgr {


  public KitProjectable_originalOfProjectionsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOriginalOfProjections( theNode);
    }




    protected com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] getOriginalOfProjections( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc aProjectable = null;
      try { aProjectable = (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aProjectable == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc[] someOriginalOfProjections = null;
      try { someOriginalOfProjections = aProjectable.getOriginalOfProjections( aCtxt);} catch( EAIException anEx) {}


	    return someOriginalOfProjections;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "OriginalOfProjections"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "originalOfProjections: ";
    }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitProjectable_originalOfProjections_addChosen_Hide.class,
					KitProjectable_originalOfProjections_addChosen_Fachade.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "originalOfProjections ? (N)" // setSubMenuLabel
      )
    };
  }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitProjectable_originalOfProjections_remove.class
        }
      )
    };
  }













}


