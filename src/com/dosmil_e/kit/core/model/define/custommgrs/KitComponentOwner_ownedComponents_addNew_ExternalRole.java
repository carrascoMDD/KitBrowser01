package com.dosmil_e.kit.core.model.define.custommgrs;

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



public class KitComponentOwner_ownedComponents_addNew_ExternalRole extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitComponentOwner_ownedComponents_addNew_ExternalRole(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.edoc.meta.KitExternalRoleMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitComponentOwnerMeta.vm3RelOwnedComponents
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitComponentOwner_ownedComponents_addNew_ExternalRole anAction =
      new KitComponentOwner_ownedComponents_addNew_ExternalRole( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createExternalRole.gif");
  }






}







