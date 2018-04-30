package com.dosmil_e.kit.core.model.define.custommgrs;

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



public class KitDelegation_delegator_setChosen_InteractionPortal extends
  com.dosmil_e.browserbase.metamgrs.EAISetChosenAction {


  public KitDelegation_delegator_setChosen_InteractionPortal(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.edoc.meta.KitInteractionPortalMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitDelegationMeta.vm3RelDelegator,
      com.dosmil_e.kit.core.model.edoc.customconfigs.KitInteractionPortalChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDelegation_delegator_setChosen_InteractionPortal anAction =
      new KitDelegation_delegator_setChosen_InteractionPortal(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseInteractionPortal.gif");
  }






}




