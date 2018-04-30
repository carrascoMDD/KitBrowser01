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



public class KitHandler_handlerOfBehaviors_remove extends
  com.dosmil_e.browserbase.metamgrs.EAIRemoveAction {


  public KitHandler_handlerOfBehaviors_remove(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitHandlerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitHandlerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitHandlerMeta.vm3RelHandlerOfBehaviors
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitHandler_handlerOfBehaviors_remove anAction =
      new KitHandler_handlerOfBehaviors_remove(
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/remove$RelatedConcreteTypeName$.gif");
  }






}







