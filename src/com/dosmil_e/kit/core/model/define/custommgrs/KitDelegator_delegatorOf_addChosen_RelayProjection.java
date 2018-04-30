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



public class KitDelegator_delegatorOf_addChosen_RelayProjection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public KitDelegator_delegatorOf_addChosen_RelayProjection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.define.meta.KitRelayProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitDelegatorMeta.vm3RelDelegatorOf,
      com.dosmil_e.kit.core.projection.define.customconfigs.KitRelayProjectionChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDelegator_delegatorOf_addChosen_RelayProjection anAction =
      new KitDelegator_delegatorOf_addChosen_RelayProjection(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseRelayProjection.gif");
  }






}







