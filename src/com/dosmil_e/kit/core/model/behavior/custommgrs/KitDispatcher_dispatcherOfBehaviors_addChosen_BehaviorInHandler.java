package com.dosmil_e.kit.core.model.behavior.custommgrs;

// AddChosen

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandler extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandler(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitBehaviorInHandlerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.vm3RelDispatcherOfBehaviors,
      com.dosmil_e.kit.core.model.behavior.customconfigs.KitBehaviorInHandlerChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandler anAction =
      new KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandler(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseBehaviorInHandler.gif");
  }






}







