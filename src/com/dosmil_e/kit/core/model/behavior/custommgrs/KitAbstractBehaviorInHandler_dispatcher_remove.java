package com.dosmil_e.kit.core.model.behavior.custommgrs;

// Remove

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitAbstractBehaviorInHandler_dispatcher_remove extends
  com.dosmil_e.browserbase.metamgrs.EAIRemoveAction {


  public KitAbstractBehaviorInHandler_dispatcher_remove(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.vm3RelDispatcher
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitAbstractBehaviorInHandler_dispatcher_remove anAction =
      new KitAbstractBehaviorInHandler_dispatcher_remove(
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/remove$RelatedConcreteTypeName$.gif");
  }






}







