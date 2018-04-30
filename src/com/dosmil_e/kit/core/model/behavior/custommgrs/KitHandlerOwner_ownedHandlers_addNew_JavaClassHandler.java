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



public class KitHandlerOwner_ownedHandlers_addNew_JavaClassHandler extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitHandlerOwner_ownedHandlers_addNew_JavaClassHandler(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitJavaClassHandlerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.behavior.meta.KitHandlerOwnerMeta.vm3RelOwnedHandlers
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitHandlerOwner_ownedHandlers_addNew_JavaClassHandler anAction =
      new KitHandlerOwner_ownedHandlers_addNew_JavaClassHandler( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createJavaClassHandler.gif");
  }






}







