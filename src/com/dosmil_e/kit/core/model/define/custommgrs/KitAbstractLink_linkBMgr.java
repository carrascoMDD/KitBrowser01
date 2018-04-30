package com.dosmil_e.kit.core.model.define.custommgrs;

// OnoToOneBMgr

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


public class KitAbstractLink_linkBMgr extends EAIBranchMgr {


  public KitAbstractLink_linkBMgr() {
    super( );
  }


    protected EAIMMElementIfc[] getMMElements( EAITreeNode theNode) {
      EAIMMElementIfc aMMElement = getLink( theNode);
      if( aMMElement == null) { return null;}
      return new EAIMMElementIfc[] { aMMElement};
    }




    protected com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc getLink( EAITreeNode theNode) {

      if( theNode == null) { return null;}

      Object aUserObject = theNode.getUserObject();
      if( aUserObject == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc aAbstractLink = null;
      try { aAbstractLink = (com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc) aUserObject;} catch( ClassCastException anEx) {}
      if( aAbstractLink == null) { return null;}

      EAIMMCtxtIfc aCtxt = theNode.getMMCtxt();
      if( aCtxt == null) { return null;}

      com.dosmil_e.kit.core.model.define.ifc.KitAbstractLinkIfc aLink = null;
      try { aLink = aAbstractLink.getLink( aCtxt);} catch( EAIException anEx) {}

	    return aLink;
    }




    protected void observePropertiesForChildren( EAITreeNode theNode) {
      if( theNode == null) { return;}
      theNode.observePropertiesForAspect( new String[] { "Link"}, gChildrenAspect, this);
    }


    public String composeLabelPrefix( EAITreeNode theNode, EAINodeMgrIfc theNodeMgr) {
      return "link: ";
    }



 public EAIActionsMgrIfc[] getBranchActionsMgrsForChild( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
					KitAbstractLink_link_setChosen_Connection.class,
					KitAbstractLink_link_setChosen_Link.class,
					KitAbstractLink_link_setChosen_LinkProjection.class,

        },
        EAIActionsSetIfc.sMenuInliningModeSubMenu, // setMenuInliningMode
        "link ? (1)" // setSubMenuLabel
      )
    };
  }






  public EAIActionsMgrIfc[] getBranchActionsMgrsForParent( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
          KitAbstractLink_link_remove.class
        }
      )
    };
  }


}


