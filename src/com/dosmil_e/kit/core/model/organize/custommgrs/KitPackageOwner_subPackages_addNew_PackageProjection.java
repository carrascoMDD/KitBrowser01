package com.dosmil_e.kit.core.model.organize.custommgrs;

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



public class KitPackageOwner_subPackages_addNew_PackageProjection extends
  com.dosmil_e.browserbase.metamgrs.EAIAddNewAction {


  public KitPackageOwner_subPackages_addNew_PackageProjection(
    com.dosmil_e.browserbase.tree.EAITreeNode theNode) {

    super( theNode,
      com.dosmil_e.kit.core.model.organize.meta.KitPackageOwnerMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.projection.organize.meta.KitPackageProjectionMeta.getStaticM3Type( theNode.getMMCtxt()),
      com.dosmil_e.kit.core.model.organize.meta.KitPackageOwnerMeta.getStaticM3Type( theNode.getMMCtxt()) == null
        ? null : com.dosmil_e.kit.core.model.organize.meta.KitPackageOwnerMeta.vm3RelSubPackages
      );
  }



  public EAIActionIfc cloneBase() throws CloneNotSupportedException {
    KitPackageOwner_subPackages_addNew_PackageProjection anAction =
      new KitPackageOwner_subPackages_addNew_PackageProjection( 
        getTargetNode());

    anAction.setIcon( getIcon());
    anAction.setName( getName());
    return anAction;
  }




  protected void initIcon() {
    vIcon = new ImageIcon("images/createPackageProjection.gif");
  }






}







