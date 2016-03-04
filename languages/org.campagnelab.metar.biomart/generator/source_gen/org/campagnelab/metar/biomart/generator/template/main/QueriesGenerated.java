package org.campagnelab.metar.biomart.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.generator.template.PropertyMacroContext;
import org.campagnelab.metar.tables.behavior.Statement__BehaviorDescriptor;
import org.campagnelab.metar.biomart.behavior.Biomart__BehaviorDescriptor;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.campagnelab.metar.biomart.behavior.Attribute__BehaviorDescriptor;
import org.campagnelab.metar.code.generator.helpers.RPath;
import jetbrains.mps.util.MacrosFactory;
import java.io.File;
import org.campagnelab.metar.code.generator.helpers.NameHelper;
import org.campagnelab.metar.tables.behavior.ID__BehaviorDescriptor;
import org.campagnelab.metar.tables.behavior.TableRef__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

@Generated
public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_4815694748097848373(final BaseMappingRuleContext _context) {
    if (SPropertyOperations.hasValue(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x5acc66ed9b861522L, 0x5acc66ed9b86737fL, "typePropertie"), "id_list")) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean baseMappingRule_Condition_4815694748097860970(final BaseMappingRuleContext _context) {
    if (SPropertyOperations.hasValue(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x5acc66ed9b861522L, 0x5acc66ed9b86737fL, "typePropertie"), "list")) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean baseMappingRule_Condition_4815694748099763047(final BaseMappingRuleContext _context) {
    if (SPropertyOperations.hasValue(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x5acc66ed9b861522L, 0x5acc66ed9b86737fL, "typePropertie"), "boolean_list")) {
      return true;
    } else if (SPropertyOperations.hasValue(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x5acc66ed9b861522L, 0x5acc66ed9b86737fL, "typePropertie"), "boolean")) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean baseMappingRule_Condition_4815694748102937557(final BaseMappingRuleContext _context) {
    if (SPropertyOperations.hasValue(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x5acc66ed9b861522L, 0x5acc66ed9b86737fL, "typePropertie"), "text")) {
      return true;
    } else {
      return false;
    }
  }
  public static Object propertyMacro_GetPropertyValue_4815694748111001769(final PropertyMacroContext _context) {
    return (String) Statement__BehaviorDescriptor.id_id2AV3DmgHDX5.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_873968672225433641(final PropertyMacroContext _context) {
    return "\"" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0xc20f5e07d06ffc9L, "martDataset")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c13f13bL, 0xc20f5e07c13f525L, "martName")) + "\"";

  }
  public static Object propertyMacro_GetPropertyValue_873968672225433664(final PropertyMacroContext _context) {
    return "\"" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0xc20f5e07c4fac44L, "martDatabase")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c13f13bL, 0xc20f5e07c13f525L, "martName")) + "\"";

  }
  public static Object propertyMacro_GetPropertyValue_1264713405877678556(final PropertyMacroContext _context) {
    return Biomart__BehaviorDescriptor.getBioMartServer_id16dayhk0JYo.invoke(_context.getNode()).substring("http://".length());
  }
  public static Object propertyMacro_GetPropertyValue_873968672225433688(final PropertyMacroContext _context) {
    return IterableUtils.join(ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0xc20f5e07c983c05L, "martAttributes"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c8989e8L, 0xc20f5e07c8989e9L, "attribute")) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c8989e8L, 0xc20f5e07c8989e9L, "attribute"));
      }
    }).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return "\"" + SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c13f13bL, 0xc20f5e07c13f525L, "martName")) + "\"";
      }
    }), ",");


  }
  public static Object propertyMacro_GetPropertyValue_8641281067911446039(final PropertyMacroContext _context) {
    return "c(" + IterableUtils.join(ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0xc20f5e07c983c05L, "martAttributes"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c8989e8L, 0xc20f5e07c8989e9L, "attribute")) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c8989e8L, 0xc20f5e07c8989e9L, "attribute"));
      }
    }).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return "\"" + Attribute__BehaviorDescriptor.getCleanSetName_id4U2hhjzCCKJ.invoke(it) + "\"";
      }
    }), ",") + ")";
  }
  public static Object propertyMacro_GetPropertyValue_873968672226534287(final PropertyMacroContext _context) {
    return new RPath(MacrosFactory.getGlobal().expandPath("${org.campagnelab.metaR.results_dir}") + File.separator + "table_" + NameHelper.RName(SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0x7992e0e669fcbb8dL, "outputTable")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))) + "_" + Integer.toString(SPropertyOperations.getInteger(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0x7992e0e669fcbb8dL, "outputTable")), MetaAdapterFactory.getProperty(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745fadd605ac5L, 0x39d2cd96c5e52d3dL, "id"))) + ".tsv").toString();
  }
  public static Object propertyMacro_GetPropertyValue_4815694748111535551(final PropertyMacroContext _context) {
    return (String) Statement__BehaviorDescriptor.id_id2AV3DmgHDX5.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_5857936452064546648(final PropertyMacroContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0x7992e0e669fcbb8dL, "outputTable")), MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745fadd605ac5L, 0x2f3745fadd605affL, "table")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static Object propertyMacro_GetPropertyValue_5857936452064547388(final PropertyMacroContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0x7992e0e669fcbb8dL, "outputTable")), MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745fadd605ac5L, 0x2f3745fadd605affL, "table")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static Object propertyMacro_GetPropertyValue_5857936452064547400(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0x7992e0e669fcbb8dL, "outputTable")), MetaAdapterFactory.getProperty(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745fadd605ac5L, 0x39d2cd96c5e52d3dL, "id"));
  }
  public static Object propertyMacro_GetPropertyValue_3007013211742901911(final PropertyMacroContext _context) {
    return (String) Statement__BehaviorDescriptor.id_id2AV3DmgHDX5.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_2742007948305466840(final PropertyMacroContext _context) {
    return (boolean) Statement__BehaviorDescriptor.errorCatchingEnabled_id2od$re20jdz.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_2210428371637604683(final PropertyMacroContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x8c5eed24d91730fL, 0x8c5eed24d917310L, "setOfIds")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static Object propertyMacro_GetPropertyValue_2210428371637609141(final PropertyMacroContext _context) {
    return "c(" + IterableUtils.join(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x8c5eed24d91730fL, 0x8c5eed24d917310L, "setOfIds")), MetaAdapterFactory.getContainmentLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x39d2cd96c5aecb7bL, 0x39d2cd96c5aef550L, "ids"))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return (String) ID__BehaviorDescriptor.getID_idkv77yv5cRL.invoke(it);
      }
    }), ",") + ")";
  }
  public static Object propertyMacro_GetPropertyValue_2210428371637563129(final PropertyMacroContext _context) {
    return "\"" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c13f13bL, 0xc20f5e07c13f525L, "martName")) + "\"";
  }
  public static Object propertyMacro_GetPropertyValue_2210428371645346840(final PropertyMacroContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1ead04e484201162L, 0x1ead04e484320098L, "tableRef")), MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x3dc59a0f37f897b3L, 0x3dc59a0f37f89c07L, "table")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static Object propertyMacro_GetPropertyValue_2210428371645344144(final PropertyMacroContext _context) {
    return "$" + TableRef__BehaviorDescriptor.firstColumnWithGroup_id6XP3gVdMCs$.invoke(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1ead04e484201162L, 0x1ead04e484320098L, "tableRef")), "ID");
  }
  public static Object propertyMacro_GetPropertyValue_4815694748089062010(final PropertyMacroContext _context) {
    return "\"" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c13f13bL, 0xc20f5e07c13f525L, "martName")) + "\"";
  }
  public static Object propertyMacro_GetPropertyValue_4815694748095578771(final PropertyMacroContext _context) {
    {
      final SNode filterWithList = SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x8c5eed24dba0b23L, "filterWith"));
      if (SNodeOperations.isInstanceOf(filterWithList, MetaAdapterFactory.getConcept(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x42d4c8dbd65e3fbcL, "org.campagnelab.metar.biomart.structure.FilterWithList"))) {
        if (isNotEmptyString(SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(filterWithList, MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x42d4c8dbd65e3fbcL, 0x708b1099a33164c8L, "filterListValue")), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x708b1099a31b3122L, 0x708b1099a31b3127L, "filterListValue")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))) {
          // return withText 
          return "\"" + SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(filterWithList, MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x42d4c8dbd65e3fbcL, 0x708b1099a33164c8L, "filterListValue")), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x708b1099a31b3122L, 0x708b1099a31b3127L, "filterListValue")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "\"";
        } else {
          // return withText 
          return "null";
        }
      }
    }
    return "null";
  }
  public static Object propertyMacro_GetPropertyValue_4815694748099744597(final PropertyMacroContext _context) {
    return "\"" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c13f13bL, 0xc20f5e07c13f525L, "martName")) + "\"";
  }
  public static Object propertyMacro_GetPropertyValue_4815694748099744613(final PropertyMacroContext _context) {
    {
      final SNode withBoolean = SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x8c5eed24dba0b23L, "filterWith"));
      if (SNodeOperations.isInstanceOf(withBoolean, MetaAdapterFactory.getConcept(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x708b1099a29bdf16L, "org.campagnelab.metar.biomart.structure.FilterWithBoolean"))) {
        if (SPropertyOperations.getBoolean(withBoolean, MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x708b1099a29bdf16L, 0x708b1099a29be2dbL, "withBoolean"))) {
          return "TRUE";
        } else {
          return "FALSE";
        }
      }
    }
    return "FALSE";

  }
  public static Object propertyMacro_GetPropertyValue_4815694748101261382(final PropertyMacroContext _context) {
    return "\"" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x1bf3508d1da2119cL, "filterRef")), MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0xc20f5e07c13f13bL, 0xc20f5e07c13f525L, "martName")) + "\"";
  }
  public static Object propertyMacro_GetPropertyValue_4815694748101261398(final PropertyMacroContext _context) {
    {
      final SNode withText = SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x8c5eed24dba0b23L, "filterWith"));
      if (SNodeOperations.isInstanceOf(withText, MetaAdapterFactory.getConcept(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x708b1099a2a52674L, "org.campagnelab.metar.biomart.structure.FilterWithText"))) {
        if (isNotEmptyString(SPropertyOperations.getString(withText, MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x708b1099a2a52674L, 0x708b1099a2a52675L, "text")))) {
          // return withText 
          return "\"" + SPropertyOperations.getString(withText, MetaAdapterFactory.getProperty(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x708b1099a2a52674L, 0x708b1099a2a52675L, "text")) + "\"";
        } else {
          // return withText 
          return "null";
        }
      }
    }
    return "null";
  }
  public static Object propertyMacro_GetPropertyValue_8109593806054942825(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x42d4c8dbd65e3fbcL, 0x708b1099a33164c8L, "filterListValue")), MetaAdapterFactory.getReferenceLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x708b1099a31b3122L, 0x708b1099a31b3127L, "filterListValue")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static boolean ifMacro_Condition_8109593806043826428(final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0x1bf3508d1da21238L, "martFilters"))).isEmpty();
  }
  public static boolean ifMacro_Condition_5463439110625112492(final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1ead04e484201162L, 0x1ead04e48420294dL, "rowFilter")) != null);
  }
  public static SNode sourceNodeQuery_2210428371637572250(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1bf3508d1da20dd7L, 0x8c5eed24dba0b23L, "filterWith"));
  }
  public static SNode sourceNodeQuery_5463439110625111683(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x1ead04e484201162L, 0x1ead04e48420294dL, "rowFilter")), MetaAdapterFactory.getConcept(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x6c03c168da3d8078L, "org.campagnelab.metar.tables.structure.FilterWithExpression")), MetaAdapterFactory.getContainmentLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x6c03c168da3d8078L, 0x273ac682111263b1L, "filter"));
  }
  public static Iterable<SNode> sourceNodesQuery_4815694748094456839(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xe633fc480aaf45b5L, 0x9894247b67cf0890L, 0x350920b05a37c8ddL, 0x1bf3508d1da21238L, "martFilters"));
  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}
