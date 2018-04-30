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



public class KitTransformation_subTransformations_addNew_Version extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitTransformation_subTransformations_addNew_Version(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.trace.meta.KitVersionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.trace.meta.KitTransformationMeta.vm3RelSubTransformations
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitTransformation_subTransformations_addNew_Version anAction =
      new KitTransformation_subTransformations_addNew_Version( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createVersion.gif");
  }






}







