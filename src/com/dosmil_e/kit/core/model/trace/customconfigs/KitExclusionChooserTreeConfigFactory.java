package com.dosmil_e.kit.core.model.trace.customconfigs;

// ChooserTreeConfigFactory

import com.dosmil_e.browserbase.shell.*;
import com.dosmil_e.browserbase.tree.EAITreeModel;
import com.dosmil_e.browserbase.tree.EAITreeCellRenderer;

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;

import com.dosmil_e.browserbase.configs.*;

import com.dosmil_e.modelbase.ifc.*;


import java.util.Hashtable;


public class KitExclusionChooserTreeConfigFactory {

  public static EAIConfig     gConfig;
  public static Class         gCtxtClass;

  public KitExclusionChooserTreeConfigFactory() {
  }


  public static EAIConfig getConfig( EAIMMCtxtIfc theCtxt) {
    if( theCtxt == null) { return null;}
    if( gConfig == null) {
      initConfig( theCtxt);
    }
    Class aClass = theCtxt.getClass();
    if( gCtxtClass == null || aClass != gCtxtClass) {
      gConfig    = null;
      gCtxtClass = null;
      initConfig( theCtxt);
    }

    return gConfig;
  }


  public static EAIConfig initConfig( EAIMMCtxtIfc theCtxt) {

    gConfig = (EAIConfig) com.dosmil_e.kit.browser.customconfigs.KitProjectTreeConfigFactory.getConfig( theCtxt).copy();

    removeConfigs( theCtxt);

    gConfig.setIsForChooser( true);

    EAIClassChooserFilterConfigIfc anOfClassChooserConfig = new EAIClassChooserFilterConfig(
      theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Exclusion", "core.model.trace"),
      new EAIOfClassChooserFilter( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Exclusion", "core.model.trace")));

    gConfig.addClassChooserFilterConfig( anOfClassChooserConfig);

    return gConfig;
  }


  public static void removeConfigs( EAIMMCtxtIfc theCtxt) {
/*  Sample
      gConfig.removeBranchClassNodesConfigForBMgr( EAIProjectTreeConfigFactory.aPackage_dataTypesBMgr);
*/
  }

}
