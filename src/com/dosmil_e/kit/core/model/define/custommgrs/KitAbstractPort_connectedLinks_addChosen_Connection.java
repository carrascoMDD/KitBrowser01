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



public class KitAbstractPort_connectedLinks_addChosen_Connection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public KitAbstractPort_connectedLinks_addChosen_Connection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.edoc.meta.KitConnectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitAbstractPortMeta.vm3RelConnectedLinks,
      com.dosmil_e.kit.core.model.edoc.customconfigs.KitConnectionChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitAbstractPort_connectedLinks_addChosen_Connection anAction =
      new KitAbstractPort_connectedLinks_addChosen_Connection(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseConnection.gif");
  }






}







