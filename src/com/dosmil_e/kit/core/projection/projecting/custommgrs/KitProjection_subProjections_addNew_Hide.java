package com.dosmil_e.kit.core.projection.projecting.custommgrs;

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



public class KitProjection_subProjections_addNew_Hide extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitProjection_subProjections_addNew_Hide(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.projecting.meta.KitHideMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.projection.projecting.meta.KitProjectionMeta.vm3RelSubProjections
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitProjection_subProjections_addNew_Hide anAction =
      new KitProjection_subProjections_addNew_Hide( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createHide.gif");
  }






}







