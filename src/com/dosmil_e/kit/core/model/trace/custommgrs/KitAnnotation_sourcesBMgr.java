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


public class KitAnnotation_sourcesBMgr extends EAIBranchMgr {


  public KitAnnotation_sourcesBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      return getSources( theNode);
    }




    protected com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc[] getSources( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc aAnnotation = null;
      try { aAnnotation = (com.dosmil_e.kit.core.model.trace.ifc.KitAnnotationIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aAnnotation == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.trace.ifc.KitSourceIfc[] someSources = null;
      try { someSources = aAnnotation.getSources( aCtxt);} catch( EAIException anEx) {}


	    return someSources;

    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "Sources"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "sources: ";
    }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitAnnotation_sources_addChosen_Connection.class,
					KitAnnotation_sources_addChosen_Link.class,
					KitAnnotation_sources_addChosen_LinkProjection.class,
					KitAnnotation_sources_addChosen_BehaviorInHandlerProjection.class,
					KitAnnotation_sources_addChosen_BehaviorInHandler.class,
					KitAnnotation_sources_addChosen_Responded.class,
					KitAnnotation_sources_addChosen_RespondedProjection.class,
					KitAnnotation_sources_addChosen_Requested.class,
					KitAnnotation_sources_addChosen_RequestedProjection.class,
					KitAnnotation_sources_addChosen_Signaled.class,
					KitAnnotation_sources_addChosen_SignaledProjection.class,
					KitAnnotation_sources_addChosen_Listened.class,
					KitAnnotation_sources_addChosen_ListenedProjection.class,
					KitAnnotation_sources_addChosen_Project.class,
					KitAnnotation_sources_addChosen_ProjectProjection.class,
					KitAnnotation_sources_addChosen_Package.class,
					KitAnnotation_sources_addChosen_PackageProjection.class,
					KitAnnotation_sources_addChosen_Community.class,
					KitAnnotation_sources_addChosen_Dependency.class,
					KitAnnotation_sources_addChosen_Port.class,
					KitAnnotation_sources_addChosen_PortProjection.class,
					KitAnnotation_sources_addChosen_InteractionPortal.class,
					KitAnnotation_sources_addChosen_InteractionInterface.class,
					KitAnnotation_sources_addChosen_StructuredType.class,
					KitAnnotation_sources_addChosen_DocumentProjection.class,
					KitAnnotation_sources_addChosen_BusinessSignal.class,
					KitAnnotation_sources_addChosen_Document.class,
					KitAnnotation_sources_addChosen_Content.class,
					KitAnnotation_sources_addChosen_StructuredJavaClass.class,
					KitAnnotation_sources_addChosen_StructuredJavaClassProjection.class,
					KitAnnotation_sources_addChosen_StructuralType.class,
					KitAnnotation_sources_addChosen_InternalRole.class,
					KitAnnotation_sources_addChosen_ProcessType.class,
					KitAnnotation_sources_addChosen_Resource.class,
					KitAnnotation_sources_addChosen_ComponentProjection.class,
					KitAnnotation_sources_addChosen_ExternalRole.class,
					KitAnnotation_sources_addChosen_Component.class,
					KitAnnotation_sources_addChosen_PrimitiveProcess.class,
					KitAnnotation_sources_addChosen_CompositeProcess.class,
					KitAnnotation_sources_addChosen_AssemblyProjection.class,
					KitAnnotation_sources_addChosen_Assembly.class,
					KitAnnotation_sources_addChosen_AliasProjection.class,
					KitAnnotation_sources_addChosen_Alias.class,
					KitAnnotation_sources_addChosen_Relay.class,
					KitAnnotation_sources_addChosen_RelayProjection.class,
					KitAnnotation_sources_addChosen_ReferenceProjection.class,
					KitAnnotation_sources_addChosen_Reference.class,
					KitAnnotation_sources_addChosen_AttributeProjection.class,
					KitAnnotation_sources_addChosen_Attribute.class,
					KitAnnotation_sources_addChosen_ExposedStructuralFeature.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "sources ? (N)" // setSubMenuLabel
      )
    };
  }





  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitAnnotation_sources_remove.class
        }
      )
    };
  }













}


