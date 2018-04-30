package com.dosmil_e.kit.core.model.trace.custommgrs;

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



public class KitAnnotation_sources_addChosen_Listened extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public KitAnnotation_sources_addChosen_Listened(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.trace.meta.KitAnnotationMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitListenedMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.trace.meta.KitAnnotationMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.trace.meta.KitAnnotationMeta.vm3RelSources,
      com.dosmil_e.kit.core.model.behavior.customconfigs.KitListenedChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitAnnotation_sources_addChosen_Listened anAction =
      new KitAnnotation_sources_addChosen_Listened(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseListened.gif");
  }






}







