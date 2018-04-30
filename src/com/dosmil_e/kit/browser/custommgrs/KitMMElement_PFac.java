package com.dosmil_e.kit.browser.custommgrs;

import com.dosmil_e.modelbase.flattrx.*;

import com.dosmil_e.modelbase.support.EAIMMName;
import com.dosmil_e.modelbase.support.EAIMMNameIfc;

import  com.dosmil_e.browserbase.mgrs.EAIBranchMgrIfc;
import  com.dosmil_e.browserbase.mgrs.EAINodeMgr;
import  com.dosmil_e.browserbase.mgrs.EAIBranchMgr;
import  com.dosmil_e.browserbase.tree.EAITreeNode;
import  com.dosmil_e.browserbase.configs.EAIConfigIfc;


import com.dosmil_e.modelbase.support.EAIException;
import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;


import  com.dosmil_e.browserbase.shell.EAIEditorPanelsSet;
import  com.dosmil_e.browserbase.shell.EAIEditorPanelsSetIfc;
import  com.dosmil_e.browserbase.shell.EAIEditorPanelsFactory;
import  com.dosmil_e.browserbase.shell.EAIEditorPanelsFactoryIfc;

import  com.dosmil_e.kit.browser.customwindows.KitMMElementHorizontalEditorPanel;


import javax.swing.ImageIcon;
import java.util.Vector;

public class KitMMElement_PFac extends EAIEditorPanelsFactory {

  public KitMMElement_PFac() {
    super();
  }

  public void getEditorPanelsInto( Vector theCollector) {
    theCollector.addElement( new KitMMElementHorizontalEditorPanel());
  }


}

