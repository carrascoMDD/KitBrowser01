package com.dosmil_e.kit.core.model.define.custommgrs;

// Remove

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.ifc.*;

import com.dosmil_e.browserbase.mgrs.*;
import com.dosmil_e.browserbase.tree.*;
import com.dosmil_e.browserbase.shell.*;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.util.Vector;



public class KitDelegate_delegateOf_remove extends
  com.dosmil_e.browserbase.metamgrs.EAIRemoveAction {


  public KitDelegate_delegateOf_remove(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitDelegateMeta.vm3RelDelegateOf
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitDelegate_delegateOf_remove anAction =
      new KitDelegate_delegateOf_remove(
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/remove$RelatedConcreteTypeName$.gif");
  }






}






