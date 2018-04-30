package com.dosmil_e.kit.core.model.edoc.custommgrs;

// NMgr

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.metamgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;


import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.util.Vector;

import com.dosmil_e.kit.core.model.edoc.ifc.KitStructuralTypeIfc;


public class KitStructuralTypeNMgr extends EAINodeMgr {


  public KitStructuralTypeNMgr() {
    super();
  }







  protected void initIcon() {

    vIcon = new ImageIcon("images/StructuralType.gif");

  }










  public EAIActionsMgrIfc[] getNodeActionsMgrs( ) {
    return new EAIActionsMgrIfc[] {
      new EAIGenericActionsMgr(
        new Class[] {
//          KitStructuralType_delete.class
        }
      )
    };
  }
















  public EAIEditorPanelsSetIfc getNodeEditorPanelsSet() {
    EAIEditorPanelsSetIfc anEditorPanelsSet = new EAIEditorPanelsSet();

    EAIEditorPanelsFactoryIfc aPanelsFactory = new com.dosmil_e.kit.browser.custommgrs.KitMMElement_PFac();
    anEditorPanelsSet.add( aPanelsFactory);
    return anEditorPanelsSet;
  }




}

