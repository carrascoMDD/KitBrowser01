package com.dosmil_e.kit.core.model.behavior.custommgrs;

// SetChosen

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitAbstractBehaviorInHandler_handler_setChosen_JavaClassHandler extends
  com.dosmil_e.browserbase.metamgrs.EAISetChosenAction {


  public KitAbstractBehaviorInHandler_handler_setChosen_JavaClassHandler(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitJavaClassHandlerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.vm3RelHandler,
      com.dosmil_e.kit.core.model.behavior.customconfigs.KitJavaClassHandlerChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitAbstractBehaviorInHandler_handler_setChosen_JavaClassHandler anAction =
      new KitAbstractBehaviorInHandler_handler_setChosen_JavaClassHandler(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseJavaClassHandler.gif");
  }






}




