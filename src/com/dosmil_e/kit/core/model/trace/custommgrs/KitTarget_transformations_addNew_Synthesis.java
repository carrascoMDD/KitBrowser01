package com.dosmil_e.kit.core.model.trace.custommgrs;

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



public class KitTarget_transformations_addNew_Synthesis extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitTarget_transformations_addNew_Synthesis(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.trace.meta.KitSynthesisMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.trace.meta.KitTargetMeta.vm3RelTransformations
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitTarget_transformations_addNew_Synthesis anAction =
      new KitTarget_transformations_addNew_Synthesis( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createSynthesis.gif");
  }






}







