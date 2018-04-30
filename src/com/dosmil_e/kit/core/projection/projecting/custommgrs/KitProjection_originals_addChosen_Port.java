package com.dosmil_e.kit.core.projection.projecting.custommgrs;

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



public class KitProjection_originals_addChosen_Port extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public KitProjection_originals_addChosen_Port(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitPortMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelOriginals,
      com.dosmil_e.kit.core.model.define.customconfigs.KitPortChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitProjection_originals_addChosen_Port anAction =
      new KitProjection_originals_addChosen_Port(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/choosePort.gif");
  }






}







