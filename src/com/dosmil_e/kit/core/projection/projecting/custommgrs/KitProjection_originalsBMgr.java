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


public class KitProjection_originalsBMgr extends EAIBranchMgr {


  public KitProjection_originalsBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getOriginals( theNode);
    }




    protected com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc[] getOriginals( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc aProjection = null;
      try { aProjection = (com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectionIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aProjection == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.projection.projecting.ifc.KitProjectableIfc[] someOriginals = null;
      try { someOriginals = aProjection.getOriginals( aCtxt);} catch( EAIException anEx) {}


	    return someOriginals;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "Originals"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "originals: ";
    }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitProjection_originals_addChosen_Alias.class,
					KitProjection_originals_addChosen_PrimitiveJavaClassProjection.class,
					KitProjection_originals_addChosen_Link.class,
					KitProjection_originals_addChosen_AttributeProjection.class,
					KitProjection_originals_addChosen_Reference.class,
					KitProjection_originals_addChosen_StructuredJavaClassProjection.class,
					KitProjection_originals_addChosen_Port.class,
					KitProjection_originals_addChosen_Relay.class,
					KitProjection_originals_addChosen_EnumeratedTypeProjection.class,
					KitProjection_originals_addChosen_Assembly.class,
					KitProjection_originals_addChosen_Attribute.class,
					KitProjection_originals_addChosen_ProjectProjection.class,
					KitProjection_originals_addChosen_PortProjection.class,
					KitProjection_originals_addChosen_Responded.class,
					KitProjection_originals_addChosen_Project.class,
					KitProjection_originals_addChosen_StructuredJavaClass.class,
					KitProjection_originals_addChosen_EnumeratedType.class,
					KitProjection_originals_addChosen_Component.class,
					KitProjection_originals_addChosen_PackageProjection.class,
					KitProjection_originals_addChosen_RelayProjection.class,
					KitProjection_originals_addChosen_LinkProjection.class,
					KitProjection_originals_addChosen_BehaviorInHandler.class,
					KitProjection_originals_addChosen_Package.class,
					KitProjection_originals_addChosen_Document.class,
					KitProjection_originals_addChosen_RespondedProjection.class,
					KitProjection_originals_addChosen_AssemblyProjection.class,
					KitProjection_originals_addChosen_PrimitiveJavaClass.class,
					KitProjection_originals_addChosen_Listened.class,
					KitProjection_originals_addChosen_DocumentProjection.class,
					KitProjection_originals_addChosen_ListenedProjection.class,
					KitProjection_originals_addChosen_SignaledProjection.class,
					KitProjection_originals_addChosen_ComponentProjection.class,
					KitProjection_originals_addChosen_AliasProjection.class,
					KitProjection_originals_addChosen_Requested.class,
					KitProjection_originals_addChosen_RequestedProjection.class,
					KitProjection_originals_addChosen_Signaled.class,
					KitProjection_originals_addChosen_ReferenceProjection.class,
					KitProjection_originals_addChosen_BehaviorInHandlerProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "originals ? (N)" // setSubMenuLabel
      )
    };
  }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitProjection_originals_remove.class
        }
      )
    };
  }













}


