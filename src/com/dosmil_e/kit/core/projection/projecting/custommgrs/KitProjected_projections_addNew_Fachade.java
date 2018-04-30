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



public class KitProjected_projections_addNew_Fachade extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitProjected_projections_addNew_Fachade(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.projecting.meta.KitFachadeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.projection.projecting.meta.KitProjectedMeta.vm3RelProjections
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitProjected_projections_addNew_Fachade anAction =
      new KitProjected_projections_addNew_Fachade( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createFachade.gif");
  }






}







