package com.dosmil_e.kit.core.model.structural.custommgrs;

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



public class KitEnumeratedType_delete extends com.dosmil_e.browserbase.metamgrs.EAIDeleteAction {


  public KitEnumeratedType_delete(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedTypeMeta.getStaticM3Type( theNode.getMMCtxt()));
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitEnumeratedType_delete anAction = new KitEnumeratedType_delete( vTargetNode);

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/deleteEnumeratedType.gif");
  }






}





