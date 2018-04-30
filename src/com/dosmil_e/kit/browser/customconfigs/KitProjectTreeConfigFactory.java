package com.dosmil_e.kit.browser.customconfigs;

// WholeTreeConfigFactory

import com.dosmil_e.browserbase.shell.*;
import com.dosmil_e.browserbase.tree.EAITreeModel;
import com.dosmil_e.browserbase.tree.EAITreeCellRenderer;

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;

import com.dosmil_e.browserbase.configs.*;

import com.dosmil_e.modelbase.ifc.*;

import java.util.Hashtable;


public class KitProjectTreeConfigFactory {

  public static EAIConfig     gConfig;
  public static Class         gCtxtClass;


  /*******************************************************
   *  Static members holding Node and Branch Managers
   *******************************************************/

	public static com.dosmil_e.kit.core.projection.projecting.custommgrs.KitProjectable_originalOfProjectionsBMgr aProjectable_originalOfProjectionsBMgr  = new com.dosmil_e.kit.core.projection.projecting.custommgrs.KitProjectable_originalOfProjectionsBMgr();

	public static com.dosmil_e.kit.core.projection.projecting.custommgrs.KitProjection_originalsBMgr aProjection_originalsBMgr  = new com.dosmil_e.kit.core.projection.projecting.custommgrs.KitProjection_originalsBMgr();

	public static com.dosmil_e.kit.core.projection.projecting.custommgrs.KitProjection_subProjectionsBMgr aProjection_subProjectionsBMgr  = new com.dosmil_e.kit.core.projection.projecting.custommgrs.KitProjection_subProjectionsBMgr();

	public static com.dosmil_e.kit.core.projection.projecting.custommgrs.KitProjected_projectionsBMgr aProjected_projectionsBMgr  = new com.dosmil_e.kit.core.projection.projecting.custommgrs.KitProjected_projectionsBMgr();

	public static com.dosmil_e.kit.core.projection.projecting.custommgrs.KitHideNMgr aHideNMgr  = new com.dosmil_e.kit.core.projection.projecting.custommgrs.KitHideNMgr();

	public static com.dosmil_e.kit.core.projection.projecting.custommgrs.KitFachadeNMgr aFachadeNMgr  = new com.dosmil_e.kit.core.projection.projecting.custommgrs.KitFachadeNMgr();

	public static com.dosmil_e.kit.core.projection.define.custommgrs.KitAliasProjectionNMgr aAliasProjectionNMgr  = new com.dosmil_e.kit.core.projection.define.custommgrs.KitAliasProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.define.custommgrs.KitAssemblyProjectionNMgr aAssemblyProjectionNMgr  = new com.dosmil_e.kit.core.projection.define.custommgrs.KitAssemblyProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.define.custommgrs.KitComponentProjectionNMgr aComponentProjectionNMgr  = new com.dosmil_e.kit.core.projection.define.custommgrs.KitComponentProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.define.custommgrs.KitLinkProjectionNMgr aLinkProjectionNMgr  = new com.dosmil_e.kit.core.projection.define.custommgrs.KitLinkProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.define.custommgrs.KitPortProjectionNMgr aPortProjectionNMgr  = new com.dosmil_e.kit.core.projection.define.custommgrs.KitPortProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.define.custommgrs.KitRelayProjectionNMgr aRelayProjectionNMgr  = new com.dosmil_e.kit.core.projection.define.custommgrs.KitRelayProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.organize.custommgrs.KitProjectProjectionNMgr aProjectProjectionNMgr  = new com.dosmil_e.kit.core.projection.organize.custommgrs.KitProjectProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.organize.custommgrs.KitPackageProjectionNMgr aPackageProjectionNMgr  = new com.dosmil_e.kit.core.projection.organize.custommgrs.KitPackageProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.behavior.custommgrs.KitBehaviorInHandlerProjectionNMgr aBehaviorInHandlerProjectionNMgr  = new com.dosmil_e.kit.core.projection.behavior.custommgrs.KitBehaviorInHandlerProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.behavior.custommgrs.KitListenedProjectionNMgr aListenedProjectionNMgr  = new com.dosmil_e.kit.core.projection.behavior.custommgrs.KitListenedProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.behavior.custommgrs.KitRequestedProjectionNMgr aRequestedProjectionNMgr  = new com.dosmil_e.kit.core.projection.behavior.custommgrs.KitRequestedProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.behavior.custommgrs.KitRespondedProjectionNMgr aRespondedProjectionNMgr  = new com.dosmil_e.kit.core.projection.behavior.custommgrs.KitRespondedProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.behavior.custommgrs.KitSignaledProjectionNMgr aSignaledProjectionNMgr  = new com.dosmil_e.kit.core.projection.behavior.custommgrs.KitSignaledProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.structural.custommgrs.KitAttributeProjectionNMgr aAttributeProjectionNMgr  = new com.dosmil_e.kit.core.projection.structural.custommgrs.KitAttributeProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.structural.custommgrs.KitEnumeratedTypeProjectionNMgr aEnumeratedTypeProjectionNMgr  = new com.dosmil_e.kit.core.projection.structural.custommgrs.KitEnumeratedTypeProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.structural.custommgrs.KitPrimitiveJavaClassProjectionNMgr aPrimitiveJavaClassProjectionNMgr  = new com.dosmil_e.kit.core.projection.structural.custommgrs.KitPrimitiveJavaClassProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.structural.custommgrs.KitStructuredJavaClassProjectionNMgr aStructuredJavaClassProjectionNMgr  = new com.dosmil_e.kit.core.projection.structural.custommgrs.KitStructuredJavaClassProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.structural.custommgrs.KitReferenceProjectionNMgr aReferenceProjectionNMgr  = new com.dosmil_e.kit.core.projection.structural.custommgrs.KitReferenceProjectionNMgr();

	public static com.dosmil_e.kit.core.projection.structural.custommgrs.KitDocumentProjectionNMgr aDocumentProjectionNMgr  = new com.dosmil_e.kit.core.projection.structural.custommgrs.KitDocumentProjectionNMgr();

	public static com.dosmil_e.kit.core.model.observe.custommgrs.KitDependencyOwner_ownedDependenciesBMgr aDependencyOwner_ownedDependenciesBMgr  = new com.dosmil_e.kit.core.model.observe.custommgrs.KitDependencyOwner_ownedDependenciesBMgr();

	public static com.dosmil_e.kit.core.model.observe.custommgrs.KitDependencyNMgr aDependencyNMgr  = new com.dosmil_e.kit.core.model.observe.custommgrs.KitDependencyNMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitAbstractEnumeratedType_enumeratedValuesBMgr aAbstractEnumeratedType_enumeratedValuesBMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitAbstractEnumeratedType_enumeratedValuesBMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitEnumeratedValueNMgr aEnumeratedValueNMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitEnumeratedValueNMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitDefinedStructuralFeature_infoTypeBMgr aDefinedStructuralFeature_infoTypeBMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitDefinedStructuralFeature_infoTypeBMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitInfoTypeOwner_ownedInfoTypesBMgr aInfoTypeOwner_ownedInfoTypesBMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitInfoTypeOwner_ownedInfoTypesBMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuralFeatureOwner_ownedStructuralFeaturesBMgr aStructuralFeatureOwner_ownedStructuralFeaturesBMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuralFeatureOwner_ownedStructuralFeaturesBMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuralFeature_exposedAsBMgr aStructuralFeature_exposedAsBMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuralFeature_exposedAsBMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitExposedStructuralFeatureNMgr aExposedStructuralFeatureNMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitExposedStructuralFeatureNMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitExposedStructuralFeature_exposedBMgr aExposedStructuralFeature_exposedBMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitExposedStructuralFeature_exposedBMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitEnumeratedTypeNMgr aEnumeratedTypeNMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitEnumeratedTypeNMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitPrimitiveJavaClassNMgr aPrimitiveJavaClassNMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitPrimitiveJavaClassNMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuredJavaClassNMgr aStructuredJavaClassNMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuredJavaClassNMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitDocumentNMgr aDocumentNMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitDocumentNMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuralFeatureTypingNMgr aStructuralFeatureTypingNMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuralFeatureTypingNMgr();

	public static com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuredTypeNMgr aStructuredTypeNMgr  = new com.dosmil_e.kit.core.model.structural.custommgrs.KitStructuredTypeNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitTarget_transformationsBMgr aTarget_transformationsBMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitTarget_transformationsBMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitTransformationNMgr aTransformationNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitTransformationNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitTransformation_subTransformationsBMgr aTransformation_subTransformationsBMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitTransformation_subTransformationsBMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitSynthesisNMgr aSynthesisNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitSynthesisNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitVersionNMgr aVersionNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitVersionNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitURLNMgr aURLNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitURLNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitMediaNMgr aMediaNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitMediaNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitCommentNMgr aCommentNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitCommentNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitComment_attachementsBMgr aComment_attachementsBMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitComment_attachementsBMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitAttachmentNMgr aAttachmentNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitAttachmentNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitAnnotationNMgr aAnnotationNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitAnnotationNMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitAnnotation_sourcesBMgr aAnnotation_sourcesBMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitAnnotation_sourcesBMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitSource_sourceOfAnnnotationsBMgr aSource_sourceOfAnnnotationsBMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitSource_sourceOfAnnnotationsBMgr();

	public static com.dosmil_e.kit.core.model.trace.custommgrs.KitExclusionNMgr aExclusionNMgr  = new com.dosmil_e.kit.core.model.trace.custommgrs.KitExclusionNMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitComponentOwner_ownedComponentsBMgr aComponentOwner_ownedComponentsBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitComponentOwner_ownedComponentsBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitAssemblyOwner_ownedAssembliesBMgr aAssemblyOwner_ownedAssembliesBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitAssemblyOwner_ownedAssembliesBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitLinkOwner_ownedLinksBMgr aLinkOwner_ownedLinksBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitLinkOwner_ownedLinksBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitPortOwner_ownedPortsBMgr aPortOwner_ownedPortsBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitPortOwner_ownedPortsBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitAbstractPort_linksBMgr aAbstractPort_linksBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitAbstractPort_linksBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitAbstractPort_connectedLinksBMgr aAbstractPort_connectedLinksBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitAbstractPort_connectedLinksBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitDelegationOwner_ownedDelegationsBMgr aDelegationOwner_ownedDelegationsBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitDelegationOwner_ownedDelegationsBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitDelegator_delegatorOfBMgr aDelegator_delegatorOfBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitDelegator_delegatorOfBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitDelegation_delegatorBMgr aDelegation_delegatorBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitDelegation_delegatorBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitDelegation_delegateBMgr aDelegation_delegateBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitDelegation_delegateBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitDelegate_delegateOfBMgr aDelegate_delegateOfBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitDelegate_delegateOfBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitAbstractLink_connectedPortBMgr aAbstractLink_connectedPortBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitAbstractLink_connectedPortBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitAbstractLink_linkBMgr aAbstractLink_linkBMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitAbstractLink_linkBMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitComponentNMgr aComponentNMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitComponentNMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitAssemblyNMgr aAssemblyNMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitAssemblyNMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitLinkNMgr aLinkNMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitLinkNMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitRelayNMgr aRelayNMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitRelayNMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitAliasNMgr aAliasNMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitAliasNMgr();

	public static com.dosmil_e.kit.core.model.define.custommgrs.KitPortNMgr aPortNMgr  = new com.dosmil_e.kit.core.model.define.custommgrs.KitPortNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitProcessTypeNMgr aProcessTypeNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitProcessTypeNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitBusinessSignalNMgr aBusinessSignalNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitBusinessSignalNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitContentNMgr aContentNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitContentNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitCommunityNMgr aCommunityNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitCommunityNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitInteractionPortalNMgr aInteractionPortalNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitInteractionPortalNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitInteractionInterfaceNMgr aInteractionInterfaceNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitInteractionInterfaceNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitCompositeProcessNMgr aCompositeProcessNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitCompositeProcessNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitPrimitiveProcessNMgr aPrimitiveProcessNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitPrimitiveProcessNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitConnectionNMgr aConnectionNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitConnectionNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitInternalRoleNMgr aInternalRoleNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitInternalRoleNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitExternalRoleNMgr aExternalRoleNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitExternalRoleNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitResourceNMgr aResourceNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitResourceNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitStructuralTypeNMgr aStructuralTypeNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitStructuralTypeNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitReferenceNMgr aReferenceNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitReferenceNMgr();

	public static com.dosmil_e.kit.core.model.edoc.custommgrs.KitAttributeNMgr aAttributeNMgr  = new com.dosmil_e.kit.core.model.edoc.custommgrs.KitAttributeNMgr();

	public static com.dosmil_e.kit.core.model.organize.custommgrs.KitPackageOwner_subPackagesBMgr aPackageOwner_subPackagesBMgr  = new com.dosmil_e.kit.core.model.organize.custommgrs.KitPackageOwner_subPackagesBMgr();

	public static com.dosmil_e.kit.core.model.organize.custommgrs.KitProjectNMgr aProjectNMgr  = new com.dosmil_e.kit.core.model.organize.custommgrs.KitProjectNMgr();

	public static com.dosmil_e.kit.core.model.organize.custommgrs.KitPackageNMgr aPackageNMgr  = new com.dosmil_e.kit.core.model.organize.custommgrs.KitPackageNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitJavaClassHandlerNMgr aJavaClassHandlerNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitJavaClassHandlerNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitJavaMethodDispatcherNMgr aJavaMethodDispatcherNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitJavaMethodDispatcherNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitBidirectionalInteraction_ownedReturnsBMgr aBidirectionalInteraction_ownedReturnsBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitBidirectionalInteraction_ownedReturnsBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitInteractionOwner_ownedInteractionsBMgr aInteractionOwner_ownedInteractionsBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitInteractionOwner_ownedInteractionsBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitInteraction_ownedStimuliBMgr aInteraction_ownedStimuliBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitInteraction_ownedStimuliBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitHandlerOwner_ownedHandlersBMgr aHandlerOwner_ownedHandlersBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitHandlerOwner_ownedHandlersBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitHandler_handlerOfBehaviorsBMgr aHandler_handlerOfBehaviorsBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitHandler_handlerOfBehaviorsBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitAbstractBehaviorInHandler_handlerBMgr aAbstractBehaviorInHandler_handlerBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitAbstractBehaviorInHandler_handlerBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitAbstractBehaviorInHandler_dispatcherBMgr aAbstractBehaviorInHandler_dispatcherBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitAbstractBehaviorInHandler_dispatcherBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitDispatcherOwner_ownedDispatchersBMgr aDispatcherOwner_ownedDispatchersBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitDispatcherOwner_ownedDispatchersBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitDispatcher_dispatcherOfBehaviorsBMgr aDispatcher_dispatcherOfBehaviorsBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitDispatcher_dispatcherOfBehaviorsBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitBehaviorOwner_ownedBehaviorsBMgr aBehaviorOwner_ownedBehaviorsBMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitBehaviorOwner_ownedBehaviorsBMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitSignaledNMgr aSignaledNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitSignaledNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitListenedNMgr aListenedNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitListenedNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitRequestedNMgr aRequestedNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitRequestedNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitRespondedNMgr aRespondedNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitRespondedNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitBehaviorInHandlerNMgr aBehaviorInHandlerNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitBehaviorInHandlerNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitStimuliNMgr aStimuliNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitStimuliNMgr();

	public static com.dosmil_e.kit.core.model.behavior.custommgrs.KitReturnNMgr aReturnNMgr  = new com.dosmil_e.kit.core.model.behavior.custommgrs.KitReturnNMgr();

	public static com.dosmil_e.kit.core.model.common.custommgrs.KitCommonNMgr aCommonNMgr  = new com.dosmil_e.kit.core.model.common.custommgrs.KitCommonNMgr();



  public KitProjectTreeConfigFactory() {
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

    gConfig     = new EAIConfig( "KitProjectTreeConfigFactory");
    gCtxtClass  = theCtxt.getClass();

  /*******************************************************
   *  Root node configs
   *******************************************************/

		EAIClassRootNodeConfigIfc     aRootHideRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Hide", "core.projection.projecting"), aHideNMgr, null);
		gConfig.addClassRootNodeConfig( aRootHideRNC);

		EAIClassRootNodeConfigIfc     aRootFachadeRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Fachade", "core.projection.projecting"), aFachadeNMgr, null);
		gConfig.addClassRootNodeConfig( aRootFachadeRNC);

		EAIClassRootNodeConfigIfc     aRootAliasProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AliasProjection", "core.projection.define"), aAliasProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAliasProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootAssemblyProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AssemblyProjection", "core.projection.define"), aAssemblyProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAssemblyProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootComponentProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ComponentProjection", "core.projection.define"), aComponentProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootComponentProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootLinkProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "LinkProjection", "core.projection.define"), aLinkProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootLinkProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootPortProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PortProjection", "core.projection.define"), aPortProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootPortProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootRelayProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RelayProjection", "core.projection.define"), aRelayProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRelayProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootProjectProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ProjectProjection", "core.projection.organize"), aProjectProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootProjectProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootPackageProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PackageProjection", "core.projection.organize"), aPackageProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootPackageProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootBehaviorInHandlerProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandlerProjection", "core.projection.behavior"), aBehaviorInHandlerProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootBehaviorInHandlerProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootListenedProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ListenedProjection", "core.projection.behavior"), aListenedProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootListenedProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootRequestedProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RequestedProjection", "core.projection.behavior"), aRequestedProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRequestedProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootRespondedProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RespondedProjection", "core.projection.behavior"), aRespondedProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRespondedProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootSignaledProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "SignaledProjection", "core.projection.behavior"), aSignaledProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootSignaledProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootAttributeProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AttributeProjection", "core.projection.structural"), aAttributeProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAttributeProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootEnumeratedTypeProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "EnumeratedTypeProjection", "core.projection.structural"), aEnumeratedTypeProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootEnumeratedTypeProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootPrimitiveJavaClassProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveJavaClassProjection", "core.projection.structural"), aPrimitiveJavaClassProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootPrimitiveJavaClassProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootStructuredJavaClassProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredJavaClassProjection", "core.projection.structural"), aStructuredJavaClassProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootStructuredJavaClassProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootReferenceProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ReferenceProjection", "core.projection.structural"), aReferenceProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootReferenceProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootDocumentProjectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "DocumentProjection", "core.projection.structural"), aDocumentProjectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootDocumentProjectionRNC);

		EAIClassRootNodeConfigIfc     aRootDependencyRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Dependency", "core.model.observe"), aDependencyNMgr, null);
		gConfig.addClassRootNodeConfig( aRootDependencyRNC);

		EAIClassRootNodeConfigIfc     aRootEnumeratedValueRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "EnumeratedValue", "core.model.structural"), aEnumeratedValueNMgr, null);
		gConfig.addClassRootNodeConfig( aRootEnumeratedValueRNC);

		EAIClassRootNodeConfigIfc     aRootExposedStructuralFeatureRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ExposedStructuralFeature", "core.model.structural"), aExposedStructuralFeatureNMgr, null);
		gConfig.addClassRootNodeConfig( aRootExposedStructuralFeatureRNC);

		EAIClassRootNodeConfigIfc     aRootEnumeratedTypeRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "EnumeratedType", "core.model.structural"), aEnumeratedTypeNMgr, null);
		gConfig.addClassRootNodeConfig( aRootEnumeratedTypeRNC);

		EAIClassRootNodeConfigIfc     aRootPrimitiveJavaClassRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveJavaClass", "core.model.structural"), aPrimitiveJavaClassNMgr, null);
		gConfig.addClassRootNodeConfig( aRootPrimitiveJavaClassRNC);

		EAIClassRootNodeConfigIfc     aRootStructuredJavaClassRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredJavaClass", "core.model.structural"), aStructuredJavaClassNMgr, null);
		gConfig.addClassRootNodeConfig( aRootStructuredJavaClassRNC);

		EAIClassRootNodeConfigIfc     aRootDocumentRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Document", "core.model.structural"), aDocumentNMgr, null);
		gConfig.addClassRootNodeConfig( aRootDocumentRNC);

		EAIClassRootNodeConfigIfc     aRootStructuralFeatureTypingRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuralFeatureTyping", "core.model.structural"), aStructuralFeatureTypingNMgr, null);
		gConfig.addClassRootNodeConfig( aRootStructuralFeatureTypingRNC);

		EAIClassRootNodeConfigIfc     aRootStructuredTypeRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredType", "core.model.structural"), aStructuredTypeNMgr, null);
		gConfig.addClassRootNodeConfig( aRootStructuredTypeRNC);

		EAIClassRootNodeConfigIfc     aRootTransformationRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Transformation", "core.model.trace"), aTransformationNMgr, null);
		gConfig.addClassRootNodeConfig( aRootTransformationRNC);

		EAIClassRootNodeConfigIfc     aRootSynthesisRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Synthesis", "core.model.trace"), aSynthesisNMgr, null);
		gConfig.addClassRootNodeConfig( aRootSynthesisRNC);

		EAIClassRootNodeConfigIfc     aRootVersionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Version", "core.model.trace"), aVersionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootVersionRNC);

		EAIClassRootNodeConfigIfc     aRootURLRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "URL", "core.model.trace"), aURLNMgr, null);
		gConfig.addClassRootNodeConfig( aRootURLRNC);

		EAIClassRootNodeConfigIfc     aRootMediaRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Media", "core.model.trace"), aMediaNMgr, null);
		gConfig.addClassRootNodeConfig( aRootMediaRNC);

		EAIClassRootNodeConfigIfc     aRootCommentRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Comment", "core.model.trace"), aCommentNMgr, null);
		gConfig.addClassRootNodeConfig( aRootCommentRNC);

		EAIClassRootNodeConfigIfc     aRootAttachmentRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Attachment", "core.model.trace"), aAttachmentNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAttachmentRNC);

		EAIClassRootNodeConfigIfc     aRootAnnotationRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Annotation", "core.model.trace"), aAnnotationNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAnnotationRNC);

		EAIClassRootNodeConfigIfc     aRootExclusionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Exclusion", "core.model.trace"), aExclusionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootExclusionRNC);

		EAIClassRootNodeConfigIfc     aRootComponentRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Component", "core.model.define"), aComponentNMgr, null);
		gConfig.addClassRootNodeConfig( aRootComponentRNC);

		EAIClassRootNodeConfigIfc     aRootAssemblyRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Assembly", "core.model.define"), aAssemblyNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAssemblyRNC);

		EAIClassRootNodeConfigIfc     aRootLinkRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Link", "core.model.define"), aLinkNMgr, null);
		gConfig.addClassRootNodeConfig( aRootLinkRNC);

		EAIClassRootNodeConfigIfc     aRootRelayRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Relay", "core.model.define"), aRelayNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRelayRNC);

		EAIClassRootNodeConfigIfc     aRootAliasRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Alias", "core.model.define"), aAliasNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAliasRNC);

		EAIClassRootNodeConfigIfc     aRootPortRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Port", "core.model.define"), aPortNMgr, null);
		gConfig.addClassRootNodeConfig( aRootPortRNC);

		EAIClassRootNodeConfigIfc     aRootProcessTypeRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ProcessType", "core.model.edoc"), aProcessTypeNMgr, null);
		gConfig.addClassRootNodeConfig( aRootProcessTypeRNC);

		EAIClassRootNodeConfigIfc     aRootBusinessSignalRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BusinessSignal", "core.model.edoc"), aBusinessSignalNMgr, null);
		gConfig.addClassRootNodeConfig( aRootBusinessSignalRNC);

		EAIClassRootNodeConfigIfc     aRootContentRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Content", "core.model.edoc"), aContentNMgr, null);
		gConfig.addClassRootNodeConfig( aRootContentRNC);

		EAIClassRootNodeConfigIfc     aRootCommunityRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Community", "core.model.edoc"), aCommunityNMgr, null);
		gConfig.addClassRootNodeConfig( aRootCommunityRNC);

		EAIClassRootNodeConfigIfc     aRootInteractionPortalRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionPortal", "core.model.edoc"), aInteractionPortalNMgr, null);
		gConfig.addClassRootNodeConfig( aRootInteractionPortalRNC);

		EAIClassRootNodeConfigIfc     aRootInteractionInterfaceRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionInterface", "core.model.edoc"), aInteractionInterfaceNMgr, null);
		gConfig.addClassRootNodeConfig( aRootInteractionInterfaceRNC);

		EAIClassRootNodeConfigIfc     aRootCompositeProcessRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "CompositeProcess", "core.model.edoc"), aCompositeProcessNMgr, null);
		gConfig.addClassRootNodeConfig( aRootCompositeProcessRNC);

		EAIClassRootNodeConfigIfc     aRootPrimitiveProcessRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveProcess", "core.model.edoc"), aPrimitiveProcessNMgr, null);
		gConfig.addClassRootNodeConfig( aRootPrimitiveProcessRNC);

		EAIClassRootNodeConfigIfc     aRootConnectionRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Connection", "core.model.edoc"), aConnectionNMgr, null);
		gConfig.addClassRootNodeConfig( aRootConnectionRNC);

		EAIClassRootNodeConfigIfc     aRootInternalRoleRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InternalRole", "core.model.edoc"), aInternalRoleNMgr, null);
		gConfig.addClassRootNodeConfig( aRootInternalRoleRNC);

		EAIClassRootNodeConfigIfc     aRootExternalRoleRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ExternalRole", "core.model.edoc"), aExternalRoleNMgr, null);
		gConfig.addClassRootNodeConfig( aRootExternalRoleRNC);

		EAIClassRootNodeConfigIfc     aRootResourceRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Resource", "core.model.edoc"), aResourceNMgr, null);
		gConfig.addClassRootNodeConfig( aRootResourceRNC);

		EAIClassRootNodeConfigIfc     aRootStructuralTypeRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuralType", "core.model.edoc"), aStructuralTypeNMgr, null);
		gConfig.addClassRootNodeConfig( aRootStructuralTypeRNC);

		EAIClassRootNodeConfigIfc     aRootReferenceRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Reference", "core.model.edoc"), aReferenceNMgr, null);
		gConfig.addClassRootNodeConfig( aRootReferenceRNC);

		EAIClassRootNodeConfigIfc     aRootAttributeRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Attribute", "core.model.edoc"), aAttributeNMgr, null);
		gConfig.addClassRootNodeConfig( aRootAttributeRNC);

		EAIClassRootNodeConfigIfc     aRootProjectRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Project", "core.model.organize"), aProjectNMgr, null);
		gConfig.addClassRootNodeConfig( aRootProjectRNC);

		EAIClassRootNodeConfigIfc     aRootPackageRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Package", "core.model.organize"), aPackageNMgr, null);
		gConfig.addClassRootNodeConfig( aRootPackageRNC);

		EAIClassRootNodeConfigIfc     aRootJavaClassHandlerRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "JavaClassHandler", "core.model.behavior"), aJavaClassHandlerNMgr, null);
		gConfig.addClassRootNodeConfig( aRootJavaClassHandlerRNC);

		EAIClassRootNodeConfigIfc     aRootJavaMethodDispatcherRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "JavaMethodDispatcher", "core.model.behavior"), aJavaMethodDispatcherNMgr, null);
		gConfig.addClassRootNodeConfig( aRootJavaMethodDispatcherRNC);

		EAIClassRootNodeConfigIfc     aRootSignaledRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Signaled", "core.model.behavior"), aSignaledNMgr, null);
		gConfig.addClassRootNodeConfig( aRootSignaledRNC);

		EAIClassRootNodeConfigIfc     aRootListenedRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Listened", "core.model.behavior"), aListenedNMgr, null);
		gConfig.addClassRootNodeConfig( aRootListenedRNC);

		EAIClassRootNodeConfigIfc     aRootRequestedRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Requested", "core.model.behavior"), aRequestedNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRequestedRNC);

		EAIClassRootNodeConfigIfc     aRootRespondedRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Responded", "core.model.behavior"), aRespondedNMgr, null);
		gConfig.addClassRootNodeConfig( aRootRespondedRNC);

		EAIClassRootNodeConfigIfc     aRootBehaviorInHandlerRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandler", "core.model.behavior"), aBehaviorInHandlerNMgr, null);
		gConfig.addClassRootNodeConfig( aRootBehaviorInHandlerRNC);

		EAIClassRootNodeConfigIfc     aRootStimuliRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Stimuli", "core.model.behavior"), aStimuliNMgr, null);
		gConfig.addClassRootNodeConfig( aRootStimuliRNC);

		EAIClassRootNodeConfigIfc     aRootReturnRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Return", "core.model.behavior"), aReturnNMgr, null);
		gConfig.addClassRootNodeConfig( aRootReturnRNC);

		EAIClassRootNodeConfigIfc     aRootCommonRNC = new EAIClassRootNodeConfig( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Common", "core.model.common"), aCommonNMgr, null);
		gConfig.addClassRootNodeConfig( aRootCommonRNC);




  /*******************************************************
   *  Node and Branch configs
   *******************************************************/

		EAIBranchClassNodesConfigIfc  aProjectable_originalOfProjectionsBCNC  = new EAIBranchClassNodesConfig( aProjectable_originalOfProjectionsBMgr);
		aProjectable_originalOfProjectionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Hide","core.projection.projecting"), aHideNMgr, null ));
		aProjectable_originalOfProjectionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Fachade","core.projection.projecting"), aFachadeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjectable_originalOfProjectionsBCNC);

		EAIBranchClassNodesConfigIfc  aProjection_originalsBCNC  = new EAIBranchClassNodesConfig( aProjection_originalsBMgr);
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Alias","core.model.define"), aAliasNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveJavaClassProjection","core.projection.structural"), aPrimitiveJavaClassProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Link","core.model.define"), aLinkNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AttributeProjection","core.projection.structural"), aAttributeProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Reference","core.model.edoc"), aReferenceNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredJavaClassProjection","core.projection.structural"), aStructuredJavaClassProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Port","core.model.define"), aPortNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Relay","core.model.define"), aRelayNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "EnumeratedTypeProjection","core.projection.structural"), aEnumeratedTypeProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Assembly","core.model.define"), aAssemblyNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Attribute","core.model.edoc"), aAttributeNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ProjectProjection","core.projection.organize"), aProjectProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PortProjection","core.projection.define"), aPortProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Responded","core.model.behavior"), aRespondedNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Project","core.model.organize"), aProjectNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredJavaClass","core.model.structural"), aStructuredJavaClassNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "EnumeratedType","core.model.structural"), aEnumeratedTypeNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Component","core.model.define"), aComponentNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PackageProjection","core.projection.organize"), aPackageProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RelayProjection","core.projection.define"), aRelayProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "LinkProjection","core.projection.define"), aLinkProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandler","core.model.behavior"), aBehaviorInHandlerNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Package","core.model.organize"), aPackageNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Document","core.model.structural"), aDocumentNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RespondedProjection","core.projection.behavior"), aRespondedProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AssemblyProjection","core.projection.define"), aAssemblyProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveJavaClass","core.model.structural"), aPrimitiveJavaClassNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Listened","core.model.behavior"), aListenedNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "DocumentProjection","core.projection.structural"), aDocumentProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ListenedProjection","core.projection.behavior"), aListenedProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "SignaledProjection","core.projection.behavior"), aSignaledProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ComponentProjection","core.projection.define"), aComponentProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AliasProjection","core.projection.define"), aAliasProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Requested","core.model.behavior"), aRequestedNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RequestedProjection","core.projection.behavior"), aRequestedProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Signaled","core.model.behavior"), aSignaledNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ReferenceProjection","core.projection.structural"), aReferenceProjectionNMgr, null ));
		aProjection_originalsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandlerProjection","core.projection.behavior"), aBehaviorInHandlerProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjection_originalsBCNC);

		EAIBranchClassNodesConfigIfc  aProjection_subProjectionsBCNC  = new EAIBranchClassNodesConfig( aProjection_subProjectionsBMgr);
		aProjection_subProjectionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Hide","core.projection.projecting"), aHideNMgr, null ));
		aProjection_subProjectionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Fachade","core.projection.projecting"), aFachadeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjection_subProjectionsBCNC);

		EAIBranchClassNodesConfigIfc  aProjected_projectionsBCNC  = new EAIBranchClassNodesConfig( aProjected_projectionsBMgr);
		aProjected_projectionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Fachade","core.projection.projecting"), aFachadeNMgr, null ));
		gConfig.addBranchClassNodesConfig( aProjected_projectionsBCNC);

		EAINodeBranchesConfigIfc aHideNBC  = new EAINodeBranchesConfig( aHideNMgr);
		aHideNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjection_originalsBMgr, null));
		aHideNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjection_subProjectionsBMgr, null));
		gConfig.addNodeBranchesConfig( aHideNBC);

		EAINodeBranchesConfigIfc aFachadeNBC  = new EAINodeBranchesConfig( aFachadeNMgr);
		aFachadeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjection_originalsBMgr, null));
		aFachadeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjection_subProjectionsBMgr, null));
		gConfig.addNodeBranchesConfig( aFachadeNBC);

		EAINodeBranchesConfigIfc aAliasProjectionNBC  = new EAINodeBranchesConfig( aAliasProjectionNMgr);
		aAliasProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegation_delegateBMgr, null));
		aAliasProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegation_delegatorBMgr, null));
		aAliasProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aAliasProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aAliasProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aAliasProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aAliasProjectionNBC);

		EAINodeBranchesConfigIfc aAssemblyProjectionNBC  = new EAINodeBranchesConfig( aAssemblyProjectionNMgr);
		aAssemblyProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aAssemblyProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComponentOwner_ownedComponentsBMgr, null));
		aAssemblyProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aLinkOwner_ownedLinksBMgr, null));
		aAssemblyProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aAssemblyProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aAssemblyProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aAssemblyProjectionNBC);

		EAINodeBranchesConfigIfc aComponentProjectionNBC  = new EAINodeBranchesConfig( aComponentProjectionNMgr);
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegationOwner_ownedDelegationsBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDependencyOwner_ownedDependenciesBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aComponentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aComponentProjectionNBC);

		EAINodeBranchesConfigIfc aLinkProjectionNBC  = new EAINodeBranchesConfig( aLinkProjectionNMgr);
		aLinkProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractLink_connectedPortBMgr, null));
		aLinkProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractLink_linkBMgr, null));
		aLinkProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aLinkProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aLinkProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aLinkProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aLinkProjectionNBC);

		EAINodeBranchesConfigIfc aPortProjectionNBC  = new EAINodeBranchesConfig( aPortProjectionNMgr);
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractPort_connectedLinksBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegate_delegateOfBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegator_delegatorOfBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractPort_linksBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteractionOwner_ownedInteractionsBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aPortProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aPortProjectionNBC);

		EAINodeBranchesConfigIfc aRelayProjectionNBC  = new EAINodeBranchesConfig( aRelayProjectionNMgr);
		aRelayProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegation_delegateBMgr, null));
		aRelayProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegation_delegatorBMgr, null));
		aRelayProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aRelayProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aRelayProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aRelayProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aRelayProjectionNBC);

		EAINodeBranchesConfigIfc aProjectProjectionNBC  = new EAINodeBranchesConfig( aProjectProjectionNMgr);
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComponentOwner_ownedComponentsBMgr, null));
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPackageOwner_subPackagesBMgr, null));
		aProjectProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aProjectProjectionNBC);

		EAINodeBranchesConfigIfc aPackageProjectionNBC  = new EAINodeBranchesConfig( aPackageProjectionNMgr);
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComponentOwner_ownedComponentsBMgr, null));
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPackageOwner_subPackagesBMgr, null));
		aPackageProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aPackageProjectionNBC);

		EAINodeBranchesConfigIfc aBehaviorInHandlerProjectionNBC  = new EAINodeBranchesConfig( aBehaviorInHandlerProjectionNMgr);
		aBehaviorInHandlerProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractBehaviorInHandler_dispatcherBMgr, null));
		aBehaviorInHandlerProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractBehaviorInHandler_handlerBMgr, null));
		aBehaviorInHandlerProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aBehaviorInHandlerProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aBehaviorInHandlerProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aBehaviorInHandlerProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aBehaviorInHandlerProjectionNBC);

		EAINodeBranchesConfigIfc aListenedProjectionNBC  = new EAINodeBranchesConfig( aListenedProjectionNMgr);
		aListenedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aListenedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aListenedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteraction_ownedStimuliBMgr, null));
		aListenedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aListenedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aListenedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aListenedProjectionNBC);

		EAINodeBranchesConfigIfc aRequestedProjectionNBC  = new EAINodeBranchesConfig( aRequestedProjectionNMgr);
		aRequestedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aRequestedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aRequestedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBidirectionalInteraction_ownedReturnsBMgr, null));
		aRequestedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteraction_ownedStimuliBMgr, null));
		aRequestedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aRequestedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aRequestedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aRequestedProjectionNBC);

		EAINodeBranchesConfigIfc aRespondedProjectionNBC  = new EAINodeBranchesConfig( aRespondedProjectionNMgr);
		aRespondedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aRespondedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aRespondedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBidirectionalInteraction_ownedReturnsBMgr, null));
		aRespondedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteraction_ownedStimuliBMgr, null));
		aRespondedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aRespondedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aRespondedProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aRespondedProjectionNBC);

		EAINodeBranchesConfigIfc aSignaledProjectionNBC  = new EAINodeBranchesConfig( aSignaledProjectionNMgr);
		aSignaledProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aSignaledProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aSignaledProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteraction_ownedStimuliBMgr, null));
		aSignaledProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aSignaledProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aSignaledProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aSignaledProjectionNBC);

		EAINodeBranchesConfigIfc aAttributeProjectionNBC  = new EAINodeBranchesConfig( aAttributeProjectionNMgr);
		aAttributeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeature_exposedAsBMgr, null));
		aAttributeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDefinedStructuralFeature_infoTypeBMgr, null));
		aAttributeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aAttributeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aAttributeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aAttributeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aAttributeProjectionNBC);

		EAINodeBranchesConfigIfc aEnumeratedTypeProjectionNBC  = new EAINodeBranchesConfig( aEnumeratedTypeProjectionNMgr);
		aEnumeratedTypeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractEnumeratedType_enumeratedValuesBMgr, null));
		aEnumeratedTypeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aEnumeratedTypeProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		gConfig.addNodeBranchesConfig( aEnumeratedTypeProjectionNBC);

		EAINodeBranchesConfigIfc aPrimitiveJavaClassProjectionNBC  = new EAINodeBranchesConfig( aPrimitiveJavaClassProjectionNMgr);
		aPrimitiveJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aPrimitiveJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		gConfig.addNodeBranchesConfig( aPrimitiveJavaClassProjectionNBC);

		EAINodeBranchesConfigIfc aStructuredJavaClassProjectionNBC  = new EAINodeBranchesConfig( aStructuredJavaClassProjectionNMgr);
		aStructuredJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aStructuredJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aStructuredJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aStructuredJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aStructuredJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aStructuredJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aStructuredJavaClassProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aStructuredJavaClassProjectionNBC);

		EAINodeBranchesConfigIfc aReferenceProjectionNBC  = new EAINodeBranchesConfig( aReferenceProjectionNMgr);
		aReferenceProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeature_exposedAsBMgr, null));
		aReferenceProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDefinedStructuralFeature_infoTypeBMgr, null));
		aReferenceProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aReferenceProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aReferenceProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aReferenceProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aReferenceProjectionNBC);

		EAINodeBranchesConfigIfc aDocumentProjectionNBC  = new EAINodeBranchesConfig( aDocumentProjectionNMgr);
		aDocumentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aDocumentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aDocumentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aDocumentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjected_projectionsBMgr, null));
		aDocumentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aDocumentProjectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aDocumentProjectionNBC);

		EAIBranchClassNodesConfigIfc  aDependencyOwner_ownedDependenciesBCNC  = new EAIBranchClassNodesConfig( aDependencyOwner_ownedDependenciesBMgr);
		aDependencyOwner_ownedDependenciesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Dependency","core.model.observe"), aDependencyNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDependencyOwner_ownedDependenciesBCNC);

		EAINodeBranchesConfigIfc aDependencyNBC  = new EAINodeBranchesConfig( aDependencyNMgr);
		aDependencyNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aDependencyNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aDependencyNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aDependencyNBC);

		EAIBranchClassNodesConfigIfc  aAbstractEnumeratedType_enumeratedValuesBCNC  = new EAIBranchClassNodesConfig( aAbstractEnumeratedType_enumeratedValuesBMgr);
		aAbstractEnumeratedType_enumeratedValuesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "EnumeratedValue","core.model.structural"), aEnumeratedValueNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAbstractEnumeratedType_enumeratedValuesBCNC);

		EAINodeBranchesConfigIfc aEnumeratedValueNBC  = new EAINodeBranchesConfig( aEnumeratedValueNMgr);
		gConfig.addNodeBranchesConfig( aEnumeratedValueNBC);

		EAIBranchClassNodesConfigIfc  aDefinedStructuralFeature_infoTypeBCNC  = new EAIBranchClassNodesConfig( aDefinedStructuralFeature_infoTypeBMgr);
		aDefinedStructuralFeature_infoTypeBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuralFeatureTyping","core.model.structural"), aStructuralFeatureTypingNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDefinedStructuralFeature_infoTypeBCNC);

		EAIBranchClassNodesConfigIfc  aInfoTypeOwner_ownedInfoTypesBCNC  = new EAIBranchClassNodesConfig( aInfoTypeOwner_ownedInfoTypesBMgr);
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveJavaClass","core.model.structural"), aPrimitiveJavaClassNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveJavaClassProjection","core.projection.structural"), aPrimitiveJavaClassProjectionNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "EnumeratedTypeProjection","core.projection.structural"), aEnumeratedTypeProjectionNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "EnumeratedType","core.model.structural"), aEnumeratedTypeNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredType","core.model.structural"), aStructuredTypeNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "DocumentProjection","core.projection.structural"), aDocumentProjectionNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BusinessSignal","core.model.edoc"), aBusinessSignalNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Document","core.model.structural"), aDocumentNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Content","core.model.edoc"), aContentNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredJavaClass","core.model.structural"), aStructuredJavaClassNMgr, null ));
		aInfoTypeOwner_ownedInfoTypesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredJavaClassProjection","core.projection.structural"), aStructuredJavaClassProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aInfoTypeOwner_ownedInfoTypesBCNC);

		EAIBranchClassNodesConfigIfc  aStructuralFeatureOwner_ownedStructuralFeaturesBCNC  = new EAIBranchClassNodesConfig( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr);
		aStructuralFeatureOwner_ownedStructuralFeaturesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ReferenceProjection","core.projection.structural"), aReferenceProjectionNMgr, null ));
		aStructuralFeatureOwner_ownedStructuralFeaturesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Reference","core.model.edoc"), aReferenceNMgr, null ));
		aStructuralFeatureOwner_ownedStructuralFeaturesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AttributeProjection","core.projection.structural"), aAttributeProjectionNMgr, null ));
		aStructuralFeatureOwner_ownedStructuralFeaturesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Attribute","core.model.edoc"), aAttributeNMgr, null ));
		aStructuralFeatureOwner_ownedStructuralFeaturesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ExposedStructuralFeature","core.model.structural"), aExposedStructuralFeatureNMgr, null ));
		gConfig.addBranchClassNodesConfig( aStructuralFeatureOwner_ownedStructuralFeaturesBCNC);

		EAIBranchClassNodesConfigIfc  aStructuralFeature_exposedAsBCNC  = new EAIBranchClassNodesConfig( aStructuralFeature_exposedAsBMgr);
		aStructuralFeature_exposedAsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ExposedStructuralFeature","core.model.structural"), aExposedStructuralFeatureNMgr, null ));
		gConfig.addBranchClassNodesConfig( aStructuralFeature_exposedAsBCNC);

		EAINodeBranchesConfigIfc aExposedStructuralFeatureNBC  = new EAINodeBranchesConfig( aExposedStructuralFeatureNMgr);
		aExposedStructuralFeatureNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aExposedStructuralFeature_exposedBMgr, null));
		aExposedStructuralFeatureNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeature_exposedAsBMgr, null));
		aExposedStructuralFeatureNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aExposedStructuralFeatureNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aExposedStructuralFeatureNBC);

		EAIBranchClassNodesConfigIfc  aExposedStructuralFeature_exposedBCNC  = new EAIBranchClassNodesConfig( aExposedStructuralFeature_exposedBMgr);
		aExposedStructuralFeature_exposedBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ReferenceProjection","core.projection.structural"), aReferenceProjectionNMgr, null ));
		aExposedStructuralFeature_exposedBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Reference","core.model.edoc"), aReferenceNMgr, null ));
		aExposedStructuralFeature_exposedBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AttributeProjection","core.projection.structural"), aAttributeProjectionNMgr, null ));
		aExposedStructuralFeature_exposedBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Attribute","core.model.edoc"), aAttributeNMgr, null ));
		aExposedStructuralFeature_exposedBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ExposedStructuralFeature","core.model.structural"), aExposedStructuralFeatureNMgr, null ));
		gConfig.addBranchClassNodesConfig( aExposedStructuralFeature_exposedBCNC);

		EAINodeBranchesConfigIfc aEnumeratedTypeNBC  = new EAINodeBranchesConfig( aEnumeratedTypeNMgr);
		aEnumeratedTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractEnumeratedType_enumeratedValuesBMgr, null));
		aEnumeratedTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		gConfig.addNodeBranchesConfig( aEnumeratedTypeNBC);

		EAINodeBranchesConfigIfc aPrimitiveJavaClassNBC  = new EAINodeBranchesConfig( aPrimitiveJavaClassNMgr);
		aPrimitiveJavaClassNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		gConfig.addNodeBranchesConfig( aPrimitiveJavaClassNBC);

		EAINodeBranchesConfigIfc aStructuredJavaClassNBC  = new EAINodeBranchesConfig( aStructuredJavaClassNMgr);
		aStructuredJavaClassNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aStructuredJavaClassNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aStructuredJavaClassNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aStructuredJavaClassNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aStructuredJavaClassNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aStructuredJavaClassNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aStructuredJavaClassNBC);

		EAINodeBranchesConfigIfc aDocumentNBC  = new EAINodeBranchesConfig( aDocumentNMgr);
		aDocumentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aDocumentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aDocumentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aDocumentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aDocumentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aDocumentNBC);

		EAINodeBranchesConfigIfc aStructuralFeatureTypingNBC  = new EAINodeBranchesConfig( aStructuralFeatureTypingNMgr);
		aStructuralFeatureTypingNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		gConfig.addNodeBranchesConfig( aStructuralFeatureTypingNBC);

		EAINodeBranchesConfigIfc aStructuredTypeNBC  = new EAINodeBranchesConfig( aStructuredTypeNMgr);
		aStructuredTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aStructuredTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aStructuredTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aStructuredTypeNBC);

		EAIBranchClassNodesConfigIfc  aTarget_transformationsBCNC  = new EAIBranchClassNodesConfig( aTarget_transformationsBMgr);
		aTarget_transformationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Transformation","core.model.trace"), aTransformationNMgr, null ));
		aTarget_transformationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Version","core.model.trace"), aVersionNMgr, null ));
		aTarget_transformationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Synthesis","core.model.trace"), aSynthesisNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTarget_transformationsBCNC);

		EAINodeBranchesConfigIfc aTransformationNBC  = new EAINodeBranchesConfig( aTransformationNMgr);
		aTransformationNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComment_attachementsBMgr, null));
		aTransformationNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAnnotation_sourcesBMgr, null));
		aTransformationNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTransformation_subTransformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aTransformationNBC);

		EAIBranchClassNodesConfigIfc  aTransformation_subTransformationsBCNC  = new EAIBranchClassNodesConfig( aTransformation_subTransformationsBMgr);
		aTransformation_subTransformationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Transformation","core.model.trace"), aTransformationNMgr, null ));
		aTransformation_subTransformationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Version","core.model.trace"), aVersionNMgr, null ));
		aTransformation_subTransformationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Synthesis","core.model.trace"), aSynthesisNMgr, null ));
		gConfig.addBranchClassNodesConfig( aTransformation_subTransformationsBCNC);

		EAINodeBranchesConfigIfc aSynthesisNBC  = new EAINodeBranchesConfig( aSynthesisNMgr);
		aSynthesisNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComment_attachementsBMgr, null));
		aSynthesisNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAnnotation_sourcesBMgr, null));
		aSynthesisNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTransformation_subTransformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aSynthesisNBC);

		EAINodeBranchesConfigIfc aVersionNBC  = new EAINodeBranchesConfig( aVersionNMgr);
		aVersionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComment_attachementsBMgr, null));
		aVersionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAnnotation_sourcesBMgr, null));
		aVersionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTransformation_subTransformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aVersionNBC);

		EAINodeBranchesConfigIfc aURLNBC  = new EAINodeBranchesConfig( aURLNMgr);
		gConfig.addNodeBranchesConfig( aURLNBC);

		EAINodeBranchesConfigIfc aMediaNBC  = new EAINodeBranchesConfig( aMediaNMgr);
		gConfig.addNodeBranchesConfig( aMediaNBC);

		EAINodeBranchesConfigIfc aCommentNBC  = new EAINodeBranchesConfig( aCommentNMgr);
		aCommentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComment_attachementsBMgr, null));
		gConfig.addNodeBranchesConfig( aCommentNBC);

		EAIBranchClassNodesConfigIfc  aComment_attachementsBCNC  = new EAIBranchClassNodesConfig( aComment_attachementsBMgr);
		aComment_attachementsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Attachment","core.model.trace"), aAttachmentNMgr, null ));
		aComment_attachementsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Media","core.model.trace"), aMediaNMgr, null ));
		aComment_attachementsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "URL","core.model.trace"), aURLNMgr, null ));
		gConfig.addBranchClassNodesConfig( aComment_attachementsBCNC);

		EAINodeBranchesConfigIfc aAttachmentNBC  = new EAINodeBranchesConfig( aAttachmentNMgr);
		gConfig.addNodeBranchesConfig( aAttachmentNBC);

		EAINodeBranchesConfigIfc aAnnotationNBC  = new EAINodeBranchesConfig( aAnnotationNMgr);
		aAnnotationNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComment_attachementsBMgr, null));
		aAnnotationNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAnnotation_sourcesBMgr, null));
		gConfig.addNodeBranchesConfig( aAnnotationNBC);

		EAIBranchClassNodesConfigIfc  aAnnotation_sourcesBCNC  = new EAIBranchClassNodesConfig( aAnnotation_sourcesBMgr);
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Connection","core.model.edoc"), aConnectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Link","core.model.define"), aLinkNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "LinkProjection","core.projection.define"), aLinkProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandlerProjection","core.projection.behavior"), aBehaviorInHandlerProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandler","core.model.behavior"), aBehaviorInHandlerNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Responded","core.model.behavior"), aRespondedNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RespondedProjection","core.projection.behavior"), aRespondedProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Requested","core.model.behavior"), aRequestedNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RequestedProjection","core.projection.behavior"), aRequestedProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Signaled","core.model.behavior"), aSignaledNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "SignaledProjection","core.projection.behavior"), aSignaledProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Listened","core.model.behavior"), aListenedNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ListenedProjection","core.projection.behavior"), aListenedProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Project","core.model.organize"), aProjectNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ProjectProjection","core.projection.organize"), aProjectProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Package","core.model.organize"), aPackageNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PackageProjection","core.projection.organize"), aPackageProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Community","core.model.edoc"), aCommunityNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Dependency","core.model.observe"), aDependencyNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Port","core.model.define"), aPortNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PortProjection","core.projection.define"), aPortProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionPortal","core.model.edoc"), aInteractionPortalNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionInterface","core.model.edoc"), aInteractionInterfaceNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredType","core.model.structural"), aStructuredTypeNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "DocumentProjection","core.projection.structural"), aDocumentProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BusinessSignal","core.model.edoc"), aBusinessSignalNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Document","core.model.structural"), aDocumentNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Content","core.model.edoc"), aContentNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredJavaClass","core.model.structural"), aStructuredJavaClassNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuredJavaClassProjection","core.projection.structural"), aStructuredJavaClassProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "StructuralType","core.model.edoc"), aStructuralTypeNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InternalRole","core.model.edoc"), aInternalRoleNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ProcessType","core.model.edoc"), aProcessTypeNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Resource","core.model.edoc"), aResourceNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ComponentProjection","core.projection.define"), aComponentProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ExternalRole","core.model.edoc"), aExternalRoleNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Component","core.model.define"), aComponentNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveProcess","core.model.edoc"), aPrimitiveProcessNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "CompositeProcess","core.model.edoc"), aCompositeProcessNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AssemblyProjection","core.projection.define"), aAssemblyProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Assembly","core.model.define"), aAssemblyNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AliasProjection","core.projection.define"), aAliasProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Alias","core.model.define"), aAliasNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Relay","core.model.define"), aRelayNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RelayProjection","core.projection.define"), aRelayProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ReferenceProjection","core.projection.structural"), aReferenceProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Reference","core.model.edoc"), aReferenceNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AttributeProjection","core.projection.structural"), aAttributeProjectionNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Attribute","core.model.edoc"), aAttributeNMgr, null ));
		aAnnotation_sourcesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ExposedStructuralFeature","core.model.structural"), aExposedStructuralFeatureNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAnnotation_sourcesBCNC);

		EAIBranchClassNodesConfigIfc  aSource_sourceOfAnnnotationsBCNC  = new EAIBranchClassNodesConfig( aSource_sourceOfAnnnotationsBMgr);
		aSource_sourceOfAnnnotationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Annotation","core.model.trace"), aAnnotationNMgr, null ));
		aSource_sourceOfAnnnotationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Transformation","core.model.trace"), aTransformationNMgr, null ));
		aSource_sourceOfAnnnotationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Version","core.model.trace"), aVersionNMgr, null ));
		aSource_sourceOfAnnnotationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Synthesis","core.model.trace"), aSynthesisNMgr, null ));
		aSource_sourceOfAnnnotationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Exclusion","core.model.trace"), aExclusionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aSource_sourceOfAnnnotationsBCNC);

		EAINodeBranchesConfigIfc aExclusionNBC  = new EAINodeBranchesConfig( aExclusionNMgr);
		aExclusionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComment_attachementsBMgr, null));
		aExclusionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAnnotation_sourcesBMgr, null));
		gConfig.addNodeBranchesConfig( aExclusionNBC);

		EAIBranchClassNodesConfigIfc  aComponentOwner_ownedComponentsBCNC  = new EAIBranchClassNodesConfig( aComponentOwner_ownedComponentsBMgr);
		aComponentOwner_ownedComponentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InternalRole","core.model.edoc"), aInternalRoleNMgr, null ));
		aComponentOwner_ownedComponentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ProcessType","core.model.edoc"), aProcessTypeNMgr, null ));
		aComponentOwner_ownedComponentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Resource","core.model.edoc"), aResourceNMgr, null ));
		aComponentOwner_ownedComponentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ComponentProjection","core.projection.define"), aComponentProjectionNMgr, null ));
		aComponentOwner_ownedComponentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ExternalRole","core.model.edoc"), aExternalRoleNMgr, null ));
		aComponentOwner_ownedComponentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Component","core.model.define"), aComponentNMgr, null ));
		aComponentOwner_ownedComponentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PrimitiveProcess","core.model.edoc"), aPrimitiveProcessNMgr, null ));
		aComponentOwner_ownedComponentsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "CompositeProcess","core.model.edoc"), aCompositeProcessNMgr, null ));
		gConfig.addBranchClassNodesConfig( aComponentOwner_ownedComponentsBCNC);

		EAIBranchClassNodesConfigIfc  aAssemblyOwner_ownedAssembliesBCNC  = new EAIBranchClassNodesConfig( aAssemblyOwner_ownedAssembliesBMgr);
		aAssemblyOwner_ownedAssembliesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AssemblyProjection","core.projection.define"), aAssemblyProjectionNMgr, null ));
		aAssemblyOwner_ownedAssembliesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Assembly","core.model.define"), aAssemblyNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAssemblyOwner_ownedAssembliesBCNC);

		EAIBranchClassNodesConfigIfc  aLinkOwner_ownedLinksBCNC  = new EAIBranchClassNodesConfig( aLinkOwner_ownedLinksBMgr);
		aLinkOwner_ownedLinksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Connection","core.model.edoc"), aConnectionNMgr, null ));
		aLinkOwner_ownedLinksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Link","core.model.define"), aLinkNMgr, null ));
		aLinkOwner_ownedLinksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "LinkProjection","core.projection.define"), aLinkProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aLinkOwner_ownedLinksBCNC);

		EAIBranchClassNodesConfigIfc  aPortOwner_ownedPortsBCNC  = new EAIBranchClassNodesConfig( aPortOwner_ownedPortsBMgr);
		aPortOwner_ownedPortsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Port","core.model.define"), aPortNMgr, null ));
		aPortOwner_ownedPortsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PortProjection","core.projection.define"), aPortProjectionNMgr, null ));
		aPortOwner_ownedPortsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionPortal","core.model.edoc"), aInteractionPortalNMgr, null ));
		aPortOwner_ownedPortsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionInterface","core.model.edoc"), aInteractionInterfaceNMgr, null ));
		gConfig.addBranchClassNodesConfig( aPortOwner_ownedPortsBCNC);

		EAIBranchClassNodesConfigIfc  aAbstractPort_linksBCNC  = new EAIBranchClassNodesConfig( aAbstractPort_linksBMgr);
		aAbstractPort_linksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Connection","core.model.edoc"), aConnectionNMgr, null ));
		aAbstractPort_linksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Link","core.model.define"), aLinkNMgr, null ));
		aAbstractPort_linksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "LinkProjection","core.projection.define"), aLinkProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAbstractPort_linksBCNC);

		EAIBranchClassNodesConfigIfc  aAbstractPort_connectedLinksBCNC  = new EAIBranchClassNodesConfig( aAbstractPort_connectedLinksBMgr);
		aAbstractPort_connectedLinksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Connection","core.model.edoc"), aConnectionNMgr, null ));
		aAbstractPort_connectedLinksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Link","core.model.define"), aLinkNMgr, null ));
		aAbstractPort_connectedLinksBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "LinkProjection","core.projection.define"), aLinkProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAbstractPort_connectedLinksBCNC);

		EAIBranchClassNodesConfigIfc  aDelegationOwner_ownedDelegationsBCNC  = new EAIBranchClassNodesConfig( aDelegationOwner_ownedDelegationsBMgr);
		aDelegationOwner_ownedDelegationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AliasProjection","core.projection.define"), aAliasProjectionNMgr, null ));
		aDelegationOwner_ownedDelegationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Alias","core.model.define"), aAliasNMgr, null ));
		aDelegationOwner_ownedDelegationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Relay","core.model.define"), aRelayNMgr, null ));
		aDelegationOwner_ownedDelegationsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RelayProjection","core.projection.define"), aRelayProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDelegationOwner_ownedDelegationsBCNC);

		EAIBranchClassNodesConfigIfc  aDelegator_delegatorOfBCNC  = new EAIBranchClassNodesConfig( aDelegator_delegatorOfBMgr);
		aDelegator_delegatorOfBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AliasProjection","core.projection.define"), aAliasProjectionNMgr, null ));
		aDelegator_delegatorOfBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Alias","core.model.define"), aAliasNMgr, null ));
		aDelegator_delegatorOfBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Relay","core.model.define"), aRelayNMgr, null ));
		aDelegator_delegatorOfBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RelayProjection","core.projection.define"), aRelayProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDelegator_delegatorOfBCNC);

		EAIBranchClassNodesConfigIfc  aDelegation_delegatorBCNC  = new EAIBranchClassNodesConfig( aDelegation_delegatorBMgr);
		aDelegation_delegatorBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Port","core.model.define"), aPortNMgr, null ));
		aDelegation_delegatorBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PortProjection","core.projection.define"), aPortProjectionNMgr, null ));
		aDelegation_delegatorBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionPortal","core.model.edoc"), aInteractionPortalNMgr, null ));
		aDelegation_delegatorBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionInterface","core.model.edoc"), aInteractionInterfaceNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDelegation_delegatorBCNC);

		EAIBranchClassNodesConfigIfc  aDelegation_delegateBCNC  = new EAIBranchClassNodesConfig( aDelegation_delegateBMgr);
		aDelegation_delegateBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Port","core.model.define"), aPortNMgr, null ));
		aDelegation_delegateBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PortProjection","core.projection.define"), aPortProjectionNMgr, null ));
		aDelegation_delegateBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionPortal","core.model.edoc"), aInteractionPortalNMgr, null ));
		aDelegation_delegateBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionInterface","core.model.edoc"), aInteractionInterfaceNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDelegation_delegateBCNC);

		EAIBranchClassNodesConfigIfc  aDelegate_delegateOfBCNC  = new EAIBranchClassNodesConfig( aDelegate_delegateOfBMgr);
		aDelegate_delegateOfBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "AliasProjection","core.projection.define"), aAliasProjectionNMgr, null ));
		aDelegate_delegateOfBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Alias","core.model.define"), aAliasNMgr, null ));
		aDelegate_delegateOfBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Relay","core.model.define"), aRelayNMgr, null ));
		aDelegate_delegateOfBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RelayProjection","core.projection.define"), aRelayProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDelegate_delegateOfBCNC);

		EAIBranchClassNodesConfigIfc  aAbstractLink_connectedPortBCNC  = new EAIBranchClassNodesConfig( aAbstractLink_connectedPortBMgr);
		aAbstractLink_connectedPortBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Port","core.model.define"), aPortNMgr, null ));
		aAbstractLink_connectedPortBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PortProjection","core.projection.define"), aPortProjectionNMgr, null ));
		aAbstractLink_connectedPortBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionPortal","core.model.edoc"), aInteractionPortalNMgr, null ));
		aAbstractLink_connectedPortBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "InteractionInterface","core.model.edoc"), aInteractionInterfaceNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAbstractLink_connectedPortBCNC);

		EAIBranchClassNodesConfigIfc  aAbstractLink_linkBCNC  = new EAIBranchClassNodesConfig( aAbstractLink_linkBMgr);
		aAbstractLink_linkBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Connection","core.model.edoc"), aConnectionNMgr, null ));
		aAbstractLink_linkBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Link","core.model.define"), aLinkNMgr, null ));
		aAbstractLink_linkBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "LinkProjection","core.projection.define"), aLinkProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAbstractLink_linkBCNC);

		EAINodeBranchesConfigIfc aComponentNBC  = new EAINodeBranchesConfig( aComponentNMgr);
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegationOwner_ownedDelegationsBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDependencyOwner_ownedDependenciesBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aComponentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aComponentNBC);

		EAINodeBranchesConfigIfc aAssemblyNBC  = new EAINodeBranchesConfig( aAssemblyNMgr);
		aAssemblyNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aAssemblyNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComponentOwner_ownedComponentsBMgr, null));
		aAssemblyNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aLinkOwner_ownedLinksBMgr, null));
		aAssemblyNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aAssemblyNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aAssemblyNBC);

		EAINodeBranchesConfigIfc aLinkNBC  = new EAINodeBranchesConfig( aLinkNMgr);
		aLinkNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractLink_connectedPortBMgr, null));
		aLinkNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractLink_linkBMgr, null));
		aLinkNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aLinkNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aLinkNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aLinkNBC);

		EAINodeBranchesConfigIfc aRelayNBC  = new EAINodeBranchesConfig( aRelayNMgr);
		aRelayNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegation_delegateBMgr, null));
		aRelayNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegation_delegatorBMgr, null));
		aRelayNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aRelayNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aRelayNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aRelayNBC);

		EAINodeBranchesConfigIfc aAliasNBC  = new EAINodeBranchesConfig( aAliasNMgr);
		aAliasNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegation_delegateBMgr, null));
		aAliasNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegation_delegatorBMgr, null));
		aAliasNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aAliasNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aAliasNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aAliasNBC);

		EAINodeBranchesConfigIfc aPortNBC  = new EAINodeBranchesConfig( aPortNMgr);
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractPort_connectedLinksBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegate_delegateOfBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegator_delegatorOfBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractPort_linksBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteractionOwner_ownedInteractionsBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aPortNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aPortNBC);

		EAINodeBranchesConfigIfc aProcessTypeNBC  = new EAINodeBranchesConfig( aProcessTypeNMgr);
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegationOwner_ownedDelegationsBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDependencyOwner_ownedDependenciesBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aProcessTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aProcessTypeNBC);

		EAINodeBranchesConfigIfc aBusinessSignalNBC  = new EAINodeBranchesConfig( aBusinessSignalNMgr);
		aBusinessSignalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aBusinessSignalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aBusinessSignalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aBusinessSignalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aBusinessSignalNBC);

		EAINodeBranchesConfigIfc aContentNBC  = new EAINodeBranchesConfig( aContentNMgr);
		aContentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aContentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aContentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aContentNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aContentNBC);

		EAINodeBranchesConfigIfc aCommunityNBC  = new EAINodeBranchesConfig( aCommunityNMgr);
		aCommunityNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aCommunityNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComponentOwner_ownedComponentsBMgr, null));
		aCommunityNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aCommunityNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aCommunityNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aCommunityNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPackageOwner_subPackagesBMgr, null));
		aCommunityNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aCommunityNBC);

		EAINodeBranchesConfigIfc aInteractionPortalNBC  = new EAINodeBranchesConfig( aInteractionPortalNMgr);
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractPort_connectedLinksBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegate_delegateOfBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegator_delegatorOfBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractPort_linksBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteractionOwner_ownedInteractionsBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aInteractionPortalNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aInteractionPortalNBC);

		EAINodeBranchesConfigIfc aInteractionInterfaceNBC  = new EAINodeBranchesConfig( aInteractionInterfaceNMgr);
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractPort_connectedLinksBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegate_delegateOfBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegator_delegatorOfBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractPort_linksBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteractionOwner_ownedInteractionsBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aInteractionInterfaceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aInteractionInterfaceNBC);

		EAINodeBranchesConfigIfc aCompositeProcessNBC  = new EAINodeBranchesConfig( aCompositeProcessNMgr);
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegationOwner_ownedDelegationsBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDependencyOwner_ownedDependenciesBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aCompositeProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aCompositeProcessNBC);

		EAINodeBranchesConfigIfc aPrimitiveProcessNBC  = new EAINodeBranchesConfig( aPrimitiveProcessNMgr);
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegationOwner_ownedDelegationsBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDependencyOwner_ownedDependenciesBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aPrimitiveProcessNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aPrimitiveProcessNBC);

		EAINodeBranchesConfigIfc aConnectionNBC  = new EAINodeBranchesConfig( aConnectionNMgr);
		aConnectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractLink_connectedPortBMgr, null));
		aConnectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractLink_linkBMgr, null));
		aConnectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aConnectionNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aConnectionNBC);

		EAINodeBranchesConfigIfc aInternalRoleNBC  = new EAINodeBranchesConfig( aInternalRoleNMgr);
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegationOwner_ownedDelegationsBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDependencyOwner_ownedDependenciesBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aInternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aInternalRoleNBC);

		EAINodeBranchesConfigIfc aExternalRoleNBC  = new EAINodeBranchesConfig( aExternalRoleNMgr);
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegationOwner_ownedDelegationsBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDependencyOwner_ownedDependenciesBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aExternalRoleNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aExternalRoleNBC);

		EAINodeBranchesConfigIfc aResourceNBC  = new EAINodeBranchesConfig( aResourceNMgr);
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDelegationOwner_ownedDelegationsBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDependencyOwner_ownedDependenciesBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcherOwner_ownedDispatchersBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandlerOwner_ownedHandlersBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aResourceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aResourceNBC);

		EAINodeBranchesConfigIfc aStructuralTypeNBC  = new EAINodeBranchesConfig( aStructuralTypeNMgr);
		aStructuralTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeatureOwner_ownedStructuralFeaturesBMgr, null));
		aStructuralTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aStructuralTypeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aStructuralTypeNBC);

		EAINodeBranchesConfigIfc aReferenceNBC  = new EAINodeBranchesConfig( aReferenceNMgr);
		aReferenceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeature_exposedAsBMgr, null));
		aReferenceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDefinedStructuralFeature_infoTypeBMgr, null));
		aReferenceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aReferenceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aReferenceNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aReferenceNBC);

		EAINodeBranchesConfigIfc aAttributeNBC  = new EAINodeBranchesConfig( aAttributeNMgr);
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aStructuralFeature_exposedAsBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDefinedStructuralFeature_infoTypeBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aAttributeNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aAttributeNBC);

		EAIBranchClassNodesConfigIfc  aPackageOwner_subPackagesBCNC  = new EAIBranchClassNodesConfig( aPackageOwner_subPackagesBMgr);
		aPackageOwner_subPackagesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Package","core.model.organize"), aPackageNMgr, null ));
		aPackageOwner_subPackagesBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "PackageProjection","core.projection.organize"), aPackageProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aPackageOwner_subPackagesBCNC);

		EAINodeBranchesConfigIfc aProjectNBC  = new EAINodeBranchesConfig( aProjectNMgr);
		aProjectNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aProjectNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aProjectNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComponentOwner_ownedComponentsBMgr, null));
		aProjectNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aProjectNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aProjectNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aProjectNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPackageOwner_subPackagesBMgr, null));
		aProjectNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aProjectNBC);

		EAINodeBranchesConfigIfc aPackageNBC  = new EAINodeBranchesConfig( aPackageNMgr);
		aPackageNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aPackageNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAssemblyOwner_ownedAssembliesBMgr, null));
		aPackageNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aComponentOwner_ownedComponentsBMgr, null));
		aPackageNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		aPackageNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPortOwner_ownedPortsBMgr, null));
		aPackageNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aPackageNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aPackageOwner_subPackagesBMgr, null));
		aPackageNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aPackageNBC);

		EAINodeBranchesConfigIfc aJavaClassHandlerNBC  = new EAINodeBranchesConfig( aJavaClassHandlerNMgr);
		aJavaClassHandlerNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aHandler_handlerOfBehaviorsBMgr, null));
		gConfig.addNodeBranchesConfig( aJavaClassHandlerNBC);

		EAINodeBranchesConfigIfc aJavaMethodDispatcherNBC  = new EAINodeBranchesConfig( aJavaMethodDispatcherNMgr);
		aJavaMethodDispatcherNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aDispatcher_dispatcherOfBehaviorsBMgr, null));
		gConfig.addNodeBranchesConfig( aJavaMethodDispatcherNBC);

		EAIBranchClassNodesConfigIfc  aBidirectionalInteraction_ownedReturnsBCNC  = new EAIBranchClassNodesConfig( aBidirectionalInteraction_ownedReturnsBMgr);
		aBidirectionalInteraction_ownedReturnsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Return","core.model.behavior"), aReturnNMgr, null ));
		gConfig.addBranchClassNodesConfig( aBidirectionalInteraction_ownedReturnsBCNC);

		EAIBranchClassNodesConfigIfc  aInteractionOwner_ownedInteractionsBCNC  = new EAIBranchClassNodesConfig( aInteractionOwner_ownedInteractionsBMgr);
		aInteractionOwner_ownedInteractionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Responded","core.model.behavior"), aRespondedNMgr, null ));
		aInteractionOwner_ownedInteractionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RespondedProjection","core.projection.behavior"), aRespondedProjectionNMgr, null ));
		aInteractionOwner_ownedInteractionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Requested","core.model.behavior"), aRequestedNMgr, null ));
		aInteractionOwner_ownedInteractionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "RequestedProjection","core.projection.behavior"), aRequestedProjectionNMgr, null ));
		aInteractionOwner_ownedInteractionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Signaled","core.model.behavior"), aSignaledNMgr, null ));
		aInteractionOwner_ownedInteractionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "SignaledProjection","core.projection.behavior"), aSignaledProjectionNMgr, null ));
		aInteractionOwner_ownedInteractionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Listened","core.model.behavior"), aListenedNMgr, null ));
		aInteractionOwner_ownedInteractionsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "ListenedProjection","core.projection.behavior"), aListenedProjectionNMgr, null ));
		gConfig.addBranchClassNodesConfig( aInteractionOwner_ownedInteractionsBCNC);

		EAIBranchClassNodesConfigIfc  aInteraction_ownedStimuliBCNC  = new EAIBranchClassNodesConfig( aInteraction_ownedStimuliBMgr);
		aInteraction_ownedStimuliBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "Stimuli","core.model.behavior"), aStimuliNMgr, null ));
		gConfig.addBranchClassNodesConfig( aInteraction_ownedStimuliBCNC);

		EAIBranchClassNodesConfigIfc  aHandlerOwner_ownedHandlersBCNC  = new EAIBranchClassNodesConfig( aHandlerOwner_ownedHandlersBMgr);
		aHandlerOwner_ownedHandlersBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "JavaClassHandler","core.model.behavior"), aJavaClassHandlerNMgr, null ));
		gConfig.addBranchClassNodesConfig( aHandlerOwner_ownedHandlersBCNC);

		EAIBranchClassNodesConfigIfc  aHandler_handlerOfBehaviorsBCNC  = new EAIBranchClassNodesConfig( aHandler_handlerOfBehaviorsBMgr);
		aHandler_handlerOfBehaviorsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandlerProjection","core.projection.behavior"), aBehaviorInHandlerProjectionNMgr, null ));
		aHandler_handlerOfBehaviorsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandler","core.model.behavior"), aBehaviorInHandlerNMgr, null ));
		gConfig.addBranchClassNodesConfig( aHandler_handlerOfBehaviorsBCNC);

		EAIBranchClassNodesConfigIfc  aAbstractBehaviorInHandler_handlerBCNC  = new EAIBranchClassNodesConfig( aAbstractBehaviorInHandler_handlerBMgr);
		aAbstractBehaviorInHandler_handlerBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "JavaClassHandler","core.model.behavior"), aJavaClassHandlerNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAbstractBehaviorInHandler_handlerBCNC);

		EAIBranchClassNodesConfigIfc  aAbstractBehaviorInHandler_dispatcherBCNC  = new EAIBranchClassNodesConfig( aAbstractBehaviorInHandler_dispatcherBMgr);
		aAbstractBehaviorInHandler_dispatcherBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "JavaMethodDispatcher","core.model.behavior"), aJavaMethodDispatcherNMgr, null ));
		gConfig.addBranchClassNodesConfig( aAbstractBehaviorInHandler_dispatcherBCNC);

		EAIBranchClassNodesConfigIfc  aDispatcherOwner_ownedDispatchersBCNC  = new EAIBranchClassNodesConfig( aDispatcherOwner_ownedDispatchersBMgr);
		aDispatcherOwner_ownedDispatchersBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "JavaMethodDispatcher","core.model.behavior"), aJavaMethodDispatcherNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDispatcherOwner_ownedDispatchersBCNC);

		EAIBranchClassNodesConfigIfc  aDispatcher_dispatcherOfBehaviorsBCNC  = new EAIBranchClassNodesConfig( aDispatcher_dispatcherOfBehaviorsBMgr);
		aDispatcher_dispatcherOfBehaviorsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandlerProjection","core.projection.behavior"), aBehaviorInHandlerProjectionNMgr, null ));
		aDispatcher_dispatcherOfBehaviorsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandler","core.model.behavior"), aBehaviorInHandlerNMgr, null ));
		gConfig.addBranchClassNodesConfig( aDispatcher_dispatcherOfBehaviorsBCNC);

		EAIBranchClassNodesConfigIfc  aBehaviorOwner_ownedBehaviorsBCNC  = new EAIBranchClassNodesConfig( aBehaviorOwner_ownedBehaviorsBMgr);
		aBehaviorOwner_ownedBehaviorsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandlerProjection","core.projection.behavior"), aBehaviorInHandlerProjectionNMgr, null ));
		aBehaviorOwner_ownedBehaviorsBCNC.addClassNodeConfigOverride( new EAIClassNodeConfigOverride( theCtxt.getMMFactory("Kit").getClassForType( theCtxt, "BehaviorInHandler","core.model.behavior"), aBehaviorInHandlerNMgr, null ));
		gConfig.addBranchClassNodesConfig( aBehaviorOwner_ownedBehaviorsBCNC);

		EAINodeBranchesConfigIfc aSignaledNBC  = new EAINodeBranchesConfig( aSignaledNMgr);
		aSignaledNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aSignaledNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aSignaledNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteraction_ownedStimuliBMgr, null));
		aSignaledNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aSignaledNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aSignaledNBC);

		EAINodeBranchesConfigIfc aListenedNBC  = new EAINodeBranchesConfig( aListenedNMgr);
		aListenedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aListenedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aListenedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteraction_ownedStimuliBMgr, null));
		aListenedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aListenedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aListenedNBC);

		EAINodeBranchesConfigIfc aRequestedNBC  = new EAINodeBranchesConfig( aRequestedNMgr);
		aRequestedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aRequestedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aRequestedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBidirectionalInteraction_ownedReturnsBMgr, null));
		aRequestedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteraction_ownedStimuliBMgr, null));
		aRequestedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aRequestedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aRequestedNBC);

		EAINodeBranchesConfigIfc aRespondedNBC  = new EAINodeBranchesConfig( aRespondedNMgr);
		aRespondedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aRespondedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBehaviorOwner_ownedBehaviorsBMgr, null));
		aRespondedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aBidirectionalInteraction_ownedReturnsBMgr, null));
		aRespondedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInteraction_ownedStimuliBMgr, null));
		aRespondedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aRespondedNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aRespondedNBC);

		EAINodeBranchesConfigIfc aBehaviorInHandlerNBC  = new EAINodeBranchesConfig( aBehaviorInHandlerNMgr);
		aBehaviorInHandlerNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractBehaviorInHandler_dispatcherBMgr, null));
		aBehaviorInHandlerNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aAbstractBehaviorInHandler_handlerBMgr, null));
		aBehaviorInHandlerNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aProjectable_originalOfProjectionsBMgr, null));
		aBehaviorInHandlerNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aSource_sourceOfAnnnotationsBMgr, null));
		aBehaviorInHandlerNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aTarget_transformationsBMgr, null));
		gConfig.addNodeBranchesConfig( aBehaviorInHandlerNBC);

		EAINodeBranchesConfigIfc aStimuliNBC  = new EAINodeBranchesConfig( aStimuliNMgr);
		aStimuliNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		gConfig.addNodeBranchesConfig( aStimuliNBC);

		EAINodeBranchesConfigIfc aReturnNBC  = new EAINodeBranchesConfig( aReturnNMgr);
		aReturnNBC.addBranchConfigOverride( new EAIBranchConfigOverride( aInfoTypeOwner_ownedInfoTypesBMgr, null));
		gConfig.addNodeBranchesConfig( aReturnNBC);

		EAINodeBranchesConfigIfc aCommonNBC  = new EAINodeBranchesConfig( aCommonNMgr);
		gConfig.addNodeBranchesConfig( aCommonNBC);





    return gConfig;
  }

}
