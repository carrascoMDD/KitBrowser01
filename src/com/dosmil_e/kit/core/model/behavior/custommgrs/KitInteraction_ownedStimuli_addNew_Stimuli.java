package com.dosmil_e.kit.core.model.behavior.custommgrs;

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



public class KitInteraction_ownedStimuli_addNew_Stimuli extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitInteraction_ownedStimuli_addNew_Stimuli(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitStimuliMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitInteractionMeta.vm3RelOwnedStimuli
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitInteraction_ownedStimuli_addNew_Stimuli anAction =
      new KitInteraction_ownedStimuli_addNew_Stimuli( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createStimuli.gif");
  }






}







