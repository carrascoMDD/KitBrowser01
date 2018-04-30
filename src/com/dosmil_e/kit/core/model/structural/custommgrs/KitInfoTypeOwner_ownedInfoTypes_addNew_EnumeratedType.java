package com.dosmil_e.kit.core.model.structural.custommgrs;

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



public class KitInfoTypeOwner_ownedInfoTypes_addNew_EnumeratedType extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitInfoTypeOwner_ownedInfoTypes_addNew_EnumeratedType(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedTypeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.structural.meta.KitInfoTypeOwnerMeta.vm3RelOwnedInfoTypes
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitInfoTypeOwner_ownedInfoTypes_addNew_EnumeratedType anAction =
      new KitInfoTypeOwner_ownedInfoTypes_addNew_EnumeratedType( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createEnumeratedType.gif");
  }






}







