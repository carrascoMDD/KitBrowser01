package com.dosmil_e.kit.core.model.behavior.custommgrs;

// AddNew

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitJavaClassHandler_delete extends com.dosmil_e.browserbase.metamgrs.EAIDeleteAction {


  public KitJavaClassHandler_delete(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitJavaClassHandlerMeta.getStaticM3Type( theNode.getMMCtxt()));
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitJavaClassHandler_delete anAction = new KitJavaClassHandler_delete( vTargetNode);

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/deleteJavaClassHandler.gif");
  }






}





