package com.dosmil_e.kit.core.model.structural.custommgrs;

// OnoToOneAggregationBMgr

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


public class KitDefinedStructuralFeature_infoTypeBMgr extends EAIBranchMgr {


  public KitDefinedStructuralFeature_infoTypeBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getInfoType( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureTypingIfc getInfoType( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitDefinedStructuralFeatureIfc aDefinedStructuralFeature = null;
      try { aDefinedStructuralFeature = (com.dosmil_e.kit.core.model.structural.ifc.KitDefinedStructuralFeatureIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aDefinedStructuralFeature == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitStructuralFeatureTypingIfc aInfoType = null;
      try { aInfoType = aDefinedStructuralFeature.getInfoType( aCtxt);} catch( EAIException anEx) {}

	    return aInfoType;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "InfoType"}, gChildrenAspect, this);
    }

    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "infoType: ";
    }




  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitDefinedStructuralFeature_infoType_setNew_StructuralFeatureTyping.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "infoType + (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitStructuralFeatureTyping_delete.class
        }
      )
    };
  }



      
    protected boolean createDummyWhenNullElements() {
      return true;
    }



}


