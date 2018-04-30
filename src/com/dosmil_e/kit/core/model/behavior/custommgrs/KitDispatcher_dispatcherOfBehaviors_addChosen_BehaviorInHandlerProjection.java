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



public class KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandlerProjection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandlerProjection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.behavior.meta.KitBehaviorInHandlerProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherMeta.vm3RelDispatcherOfBehaviors,
      com.dosmil_e.kit.core.projection.behavior.customconfigs.KitBehaviorInHandlerProjectionChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandlerProjection anAction =
      new KitDispatcher_dispatcherOfBehaviors_addChosen_BehaviorInHandlerProjection(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseBehaviorInHandlerProjection.gif");
  }






}







