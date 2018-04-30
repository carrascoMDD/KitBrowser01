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


public class KitAbstractEnumeratedType_enumeratedValuesBMgr extends EAIBranchMgr {


  public KitAbstractEnumeratedType_enumeratedValuesBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getEnumeratedValues( theNode);
    }




    protected com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc[] getEnumeratedValues( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitAbstractEnumeratedTypeIfc aAbstractEnumeratedType = null;
      try { aAbstractEnumeratedType = (com.dosmil_e.kit.core.model.structural.ifc.KitAbstractEnumeratedTypeIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aAbstractEnumeratedType == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.structural.ifc.KitEnumeratedValueIfc[] someEnumeratedValues = null;
      try { someEnumeratedValues = aAbstractEnumeratedType.getEnumeratedValues( aCtxt);} catch( EAIException anEx) {}


	    return someEnumeratedValues;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "EnumeratedValues"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "enumeratedValues: ";
    }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitAbstractEnumeratedType_enumeratedValues_addNew_EnumeratedValue.class,

        },
        EAIActionsSetIfc.sMenuInliningModeInline, // setMenuInliningMode
        "enumeratedValues + (N)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitEnumeratedValue_delete.class
        }
      )
    };
  }






}


