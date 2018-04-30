package com.dosmil_e.kit.core.model.behavior.custommgrs;

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



public class KitDispatcherOwner_ownedDispatchers_addNew_JavaMethodDispatcher extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitDispatcherOwner_ownedDispatchers_addNew_JavaMethodDispatcher(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitJavaMethodDispatcherMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitDispatcherOwnerMeta.vm3RelOwnedDispatchers
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDispatcherOwner_ownedDispatchers_addNew_JavaMethodDispatcher anAction =
      new KitDispatcherOwner_ownedDispatchers_addNew_JavaMethodDispatcher( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createJavaMethodDispatcher.gif");
  }






}







