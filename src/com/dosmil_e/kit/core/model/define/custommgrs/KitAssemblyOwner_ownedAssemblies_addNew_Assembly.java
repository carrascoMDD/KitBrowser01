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



public class KitAssemblyOwner_ownedAssemblies_addNew_Assembly extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitAssemblyOwner_ownedAssemblies_addNew_Assembly(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitAssemblyMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.define.meta.KitAssemblyOwnerMeta.vm3RelOwnedAssemblies
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitAssemblyOwner_ownedAssemblies_addNew_Assembly anAction =
      new KitAssemblyOwner_ownedAssemblies_addNew_Assembly( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createAssembly.gif");
  }






}







