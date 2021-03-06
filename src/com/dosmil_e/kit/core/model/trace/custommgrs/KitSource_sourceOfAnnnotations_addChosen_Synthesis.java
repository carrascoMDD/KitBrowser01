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



public class KitSource_sourceOfAnnnotations_addChosen_Synthesis extends
  com.dosmil_e.browserbase.metamgrs.EAIAddChosenAction {


  public KitSource_sourceOfAnnnotations_addChosen_Synthesis(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.trace.meta.KitSynthesisMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.trace.meta.KitSourceMeta.vm3RelSourceOfAnnnotations,
      com.dosmil_e.kit.core.model.trace.customconfigs.KitSynthesisChooserTreeConfigFactory.getConfig( theNode.getMMCtxt())
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitSource_sourceOfAnnnotations_addChosen_Synthesis anAction =
      new KitSource_sourceOfAnnnotations_addChosen_Synthesis(
      getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }


  protected void initIcon() {
    vIcon = new ImageIcon("images/chooseSynthesis.gif");
  }






}







