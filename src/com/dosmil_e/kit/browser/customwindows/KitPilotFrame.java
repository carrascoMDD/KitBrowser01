package com.dosmil_e.kit.browser.customwindows;



import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.ifc.EAIMMElementIfc;

import com.dosmil_e.browserbase.shell.EAIPilotFrame;

import com.dosmil_e.browserbase.configs.*;

public class KitPilotFrame extends EAIPilotFrame {

  public static final String  sKitMMCtxtClassName            = "com.dosmil_e.m3.support.MMCtxtWithM3";
  public static final String  sKitBrowserFrameClassName      = "com.dosmil_e.kit.browser.customwindows.KitProjectBrowserFrame";
  public static final String  sKitMetaBrowserFrameClassName  = "com.dosmil_e.kit.browser.customwindows.KitProjectMetaBrowserFrame";
  public static final String  sKitPilotFrameName             = "Kit Pilot";
  public static final String  sKitNameForNewRoot             = "new Kit project";
  public static final String  sFactoryNameForNewRoot         = "Kit";


  public KitPilotFrame() {
    super();
  }


  protected void initVars() {
    super.initVars();
    
    vDefaultMMCtxtClassName             = sKitMMCtxtClassName;
    vDefaultBrowserFrameClassName       = sKitBrowserFrameClassName;
    vDefaultMetaBrowserFrameClassName   = sKitMetaBrowserFrameClassName;
    vDefaultPilotFrameName              = sKitPilotFrameName;
    vDefaultNameForNewRoot              = sKitNameForNewRoot;
    vDefaultFactoryNameForNewRoot       = sFactoryNameForNewRoot;
  }



  protected void registerFactories( EAIMMCtxtIfc theCtxt) {
    super.registerFactories( theCtxt);

    com.dosmil_e.modelbase.support.EAIMMFactoryIfc aM3Factory =
      new com.dosmil_e.m3.support.M3MMFactoryStandAlone();
    theCtxt.registerFactory( aM3Factory);

    com.dosmil_e.modelbase.support.EAIMMFactoryIfc aKitFactory =
      new com.dosmil_e.kit.support.KitMMFactoryStandAlone();
    theCtxt.registerFactory( aKitFactory);

    com.dosmil_e.m3.support.MMCtxtWithM3Ifc aCtxt = null;
    try { aCtxt = (com.dosmil_e.m3.support.MMCtxtWithM3Ifc) theCtxt;} catch( ClassCastException anEx) {}
    if( aCtxt == null) { return;}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aM3Model = com.dosmil_e.m3.meta.M3Dynamic02.getM3Model( aCtxt);
    if( aM3Model != null) {
      aCtxt.registerModel( aM3Model);
      aCtxt.registerFactoryForModel( aM3Model, aM3Factory);
    }

    com.dosmil_e.m3.core.ifc.M3ModelIfc aKitModel = com.dosmil_e.kit.meta.Kit01.getM3Model( aCtxt);
    if( aKitModel != null) {
      aCtxt.registerModel( aKitModel);
      aCtxt.registerFactoryForModel( aKitModel, aKitFactory);
    }
  }





  protected EAIMMElementIfc sampleRoot() throws EAIException {

    EAIMMCtxtIfc aCtxt = createMMCtxt();
    if( aCtxt == null) {
      String aMMCtxtClassName = getMMCtxtClassName();
      if( aMMCtxtClassName == null) {
        aMMCtxtClassName = "null MMCtxtClassName - check program arguments";
      }
      showActionStatus( "FAILURE null Ctxt : " + aMMCtxtClassName);
      return null;
    }

    boolean aMustVisit    = getArgumentProperty("visit")    != null;
    boolean aMustBrowseM3 = getArgumentProperty("browseM3") != null;
    boolean aMustEditView = getArgumentProperty("editView") != null;

    com.dosmil_e.m3.core.ifc.M3ModelIfc                   aM3M3Model  = null;
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    aM3TravCfg  = null;

    com.dosmil_e.m3.core.ifc.M3ModelIfc                   aKitM3Model = null;
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    aKitTravCfg = null;

    if( aMustVisit || aMustBrowseM3) {
      aM3M3Model = com.dosmil_e.m3.meta.M3Dynamic02.getM3Model( aCtxt);
      aM3TravCfg = aM3M3Model.findTraversalConfigsNamed( aCtxt,
        new EAIMMName(com.dosmil_e.m3.meta.M3ReplicationConfig.gTraversalConfigName));

      aKitM3Model = com.dosmil_e.kit.meta.Kit01.getM3Model( aCtxt);
      aKitTravCfg = aKitM3Model.findTraversalConfigsNamed( aCtxt,
        new EAIMMName(com.dosmil_e.kit.meta.KitReplicationConfig.gTraversalConfigName));
    }

    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aRoot = null;
    try {
      aRoot = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aCtxt.getMMFactory( getFactoryNameForNewRoot()).createRoot( aCtxt, new EAIMMName( getNameForNewRoot()));
    } catch( ClassCastException anEx) {}
    if( aRoot == null) {
      showActionStatus( "FAILURE creating Sample Root");
      return null;
    }

    showActionStatus( "New Root SUCCESSFULLY created");

    try { aCtxt.getFlatTrxMgr().justSaved();} catch( EAIException anException) {}


    com.dosmil_e.browserbase.configs.EAIConfigIfc aConfigForM3 = getTreeConfigForM3( aCtxt);


  if( aMustVisit) {

    com.dosmil_e.m3.visit.M3TraversalCtxtIfc aTravCtxt = new com.dosmil_e.m3.visit.M3TraversalCtxt();
    com.dosmil_e.m3.visit.M3TraversalVisitor aVisitor = new com.dosmil_e.m3.visit.M3TraversalVisitor( aCtxt);

    aVisitor.visit( aCtxt, aTravCtxt, aM3TravCfg, aM3M3Model);

    java.util.Hashtable aReplicatedBySourceDict = aTravCtxt.getCommon( "ReplicatedBySource");
    if( aReplicatedBySourceDict != null) {
      Object aReplicatedSourceElementObject = aReplicatedBySourceDict.get( aKitM3Model);
      if( aReplicatedSourceElementObject != null) {
        com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aReplicatedSourceElement = null;
        try { aReplicatedSourceElement = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aReplicatedSourceElementObject;} catch( ClassCastException anEx) {}
        if( aReplicatedSourceElement != null)     {
          openRootBrowserFrameClassNamed( aCtxt, aReplicatedSourceElement,
            "com.dosmil_e.m3.browser.customwindows.M3ModelBrowserFrame", aConfigForM3);
        }
      }
    }

    aTravCtxt = new com.dosmil_e.m3.visit.M3TraversalCtxt();
    aVisitor = new com.dosmil_e.m3.visit.M3TraversalVisitor( aCtxt);

    aVisitor.visit( aCtxt, aTravCtxt, aM3TravCfg, aKitM3Model);

    aReplicatedBySourceDict = aTravCtxt.getCommon( "ReplicatedBySource");
    if( aReplicatedBySourceDict != null) {
      Object aReplicatedSourceElementObject = aReplicatedBySourceDict.get( aKitM3Model);
      if( aReplicatedSourceElementObject != null) {
        com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aReplicatedSourceElement = null;
        try { aReplicatedSourceElement = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aReplicatedSourceElementObject;} catch( ClassCastException anEx) {}
        if( aReplicatedSourceElement != null)     {
          openRootBrowserFrameClassNamed( aCtxt, aReplicatedSourceElement,
            "com.dosmil_e.m3.browser.customwindows.M3ModelBrowserFrame", aConfigForM3);
        }
      }
    }
  }

    if( aMustBrowseM3) {

      openRootBrowserFrameClassNamed( aCtxt, aM3M3Model, "com.dosmil_e.m3.browser.customwindows.M3ModelBrowserFrame", aConfigForM3);
      openRootBrowserFrameClassNamed( aCtxt, aM3TravCfg, "com.dosmil_e.m3.browser.customwindows.M3ModelBrowserFrame", aConfigForM3);

      openRootBrowserFrameClassNamed( aCtxt, aKitM3Model, "com.dosmil_e.m3.browser.customwindows.M3ModelBrowserFrame", aConfigForM3);
      openRootBrowserFrameClassNamed( aCtxt, aKitTravCfg, "com.dosmil_e.m3.browser.customwindows.M3ModelBrowserFrame", aConfigForM3);
    }


    if( aMustEditView) {
      com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aNewTravCfg =
       (com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc) aCtxt.getMMFactory("M3").createMMElementOfType( aCtxt, "TraversalConfig", "traversal",new EAIMMName("New View"));
	  	aKitM3Model.addTraversalConfigs( aCtxt, aNewTravCfg);

      com.dosmil_e.browserbase.configs.EAIConfigIfc aConfigForM3View =
        com.dosmil_e.m3.browser.customwindows.M3PilotFrame.getTreeConfigForModelViewM3( aCtxt);

      openRootBrowserFrameClassNamed( aCtxt, aNewTravCfg, "com.dosmil_e.m3.browser.customwindows.M3ModelBrowserFrame",
        aConfigForM3View);
    }

    openRootBrowserFrame( aCtxt, aRoot);


    return aRoot;
  }




  protected void printVisitHeader( String theHeader) {
    if( com.dosmil_e.m3.traversal.impl.M3NodeMgrImpl.sDumpVisitBoundaries) {
      System.out.println();
      System.out.println();
      System.out.println("****************  Visit dump : " + theHeader);
      System.out.println();
    }
  }







  public static com.dosmil_e.browserbase.configs.EAIConfigIfc getTreeConfigForM3( EAIMMCtxtIfc theCtxt) {

    com.dosmil_e.browserbase.configs.EAIConfigIfc aOverridenConfig =
      com.dosmil_e.m3.browser.customwindows.M3PilotFrame.getTreeConfigForM3( theCtxt);
    if( aOverridenConfig == null) { return null;}

    String aName = aOverridenConfig.getNameOrUnnamed();

    com.dosmil_e.browserbase.configs.EAIConfigIfc aOverrideConfig = new EAIConfig(aName + "_OVR_aliasClassesFor_KitTraversalConfig_&_KitReplicationConfig");

    aOverrideConfig.setClassAlias(
      com.dosmil_e.kit.meta.KitTraversalConfig.class,
      theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"));

    aOverrideConfig.setClassAlias(
      com.dosmil_e.kit.meta.KitReplicationConfig.class,
      theCtxt.getMMFactory("M3").getClassForType( theCtxt, "TraversalConfig", "traversal"));

    aOverrideConfig.setOverridenConfig( aOverridenConfig);

    return aOverrideConfig;
  }



}
