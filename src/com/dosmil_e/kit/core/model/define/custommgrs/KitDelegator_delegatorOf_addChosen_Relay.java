package com.dosmil_e.kit.core.model.define.custommgrs;

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



public class KitDelegator_delegatorOf_addChosen_Relay extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public KitDelegator_delegatorOf_addChosen_Relay(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitRelayMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf,
      com.dosmil_e.kit.core.model.define.customconfigs.KitRelayChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDelegator_delegatorOf_addChosen_Relay anAction =
      new KitDelegator_delegatorOf_addChosen_Relay(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseRelay.gif");
  }






}






