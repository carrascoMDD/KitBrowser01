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



public class KitAbstractEnumeratedType_enumeratedValues_addNew_EnumeratedValue extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitAbstractEnumeratedType_enumeratedValues_addNew_EnumeratedValue(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.structural.meta.KitAbstractEnumeratedTypeMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitEnumeratedValueMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.structural.meta.KitAbstractEnumeratedTypeMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.structural.meta.KitAbstractEnumeratedTypeMeta.vm3RelEnumeratedValues
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitAbstractEnumeratedType_enumeratedValues_addNew_EnumeratedValue anAction =
      new KitAbstractEnumeratedType_enumeratedValues_addNew_EnumeratedValue( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createEnumeratedValue.gif");
  }






}







