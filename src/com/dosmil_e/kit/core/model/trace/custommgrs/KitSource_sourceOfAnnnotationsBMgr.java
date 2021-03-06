package com.dosmil_e.kit.core.model.trace.custommgrs;

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


public class KitSource_sourceOfAnnnotationsBMgr extends EAIBranchMgr {


  public KitSource_sourceOfAnnnotationsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getSourceOfAnnnotations( theNode);
    }




    protected com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[] getSourceOfAnnnotations( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc aSource = null;
      try { aSource = (com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aSource == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc[] someSourceOfAnnnotations = null;
      try { someSourceOfAnnnotations = aSource.getSourceOfAnnnotations( aCtxt);} catch( EAIException anEx) {}


	    return someSourceOfAnnnotations;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "SourceOfAnnnotations"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "sourceOfAnnnotations: ";
    }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitSource_sourceOfAnnnotations_addChosen_Annotation.class,
					KitSource_sourceOfAnnnotations_addChosen_Transformation.class,
					KitSource_sourceOfAnnnotations_addChosen_Version.class,
					KitSource_sourceOfAnnnotations_addChosen_Synthesis.class,
					KitSource_sourceOfAnnnotations_addChosen_Exclusion.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "sourceOfAnnnotations ? (N)" // setSubMenuLabel
      )
    };
  }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitSource_sourceOfAnnnotations_remove.class
        }
      )
    };
  }













}


