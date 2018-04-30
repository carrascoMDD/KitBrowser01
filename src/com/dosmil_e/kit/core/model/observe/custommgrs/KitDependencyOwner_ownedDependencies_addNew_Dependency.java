package com.dosmil_e.kit.core.model.observe.custommgrs;

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



public class KitDependencyOwner_ownedDependencies_addNew_Dependency extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitDependencyOwner_ownedDependencies_addNew_Dependency(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.observe.meta.KitDependencyMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.observe.meta.KitDependencyOwnerMeta.vm3RelOwnedDependencies
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDependencyOwner_ownedDependencies_addNew_Dependency anAction =
      new KitDependencyOwner_ownedDependencies_addNew_Dependency( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createDependency.gif");
  }






}







