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



public class KitAbstractBehaviorInHandler_dispatcher_setChosen_JavaMethodDispatcher extends
  com.dosmil_e.browserbase.metamgrs.EAISetChosenAction {


  public KitAbstractBehaviorInHandler_dispatcher_setChosen_JavaMethodDispatcher(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitJavaMethodDispatcherMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitAbstractBehaviorInHandlerMeta.vm3RelDispatcher,
      com.dosmil_e.kit.core.model.behavior.customconfigs.KitJavaMethodDispatcherChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitAbstractBehaviorInHandler_dispatcher_setChosen_JavaMethodDispatcher anAction =
      new KitAbstractBehaviorInHandler_dispatcher_setChosen_JavaMethodDispatcher(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseJavaMethodDispatcher.gif");
  }






}




