package org.campagnelab.metar.edgeR.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.campagnelab.metar.models.behavior.GroupFormula_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.campagnelab.metar.tables.behavior.TableRef_Behavior;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.campagnelab.metar.code.annotations.GroupValues;
import org.campagnelab.metar.tables.behavior.FutureTable_Behavior;
import org.campagnelab.metar.code.generator.helpers.NameHelper;
import org.campagnelab.metar.tables.behavior.Statement_Behavior;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.campagnelab.metar.tables.behavior.ColumnGroup_Behavior;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

@Generated
public class QueriesGenerated {
  public final boolean NEEDS_OPCONTEXT = false;
  public static boolean baseMappingRule_Condition_8031339867717481518(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConcept(_context.getNode()) == MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b58258b2L, "org.campagnelab.metar.edgeR.structure.CommonDispersion");
  }
  public static boolean baseMappingRule_Condition_8031339867717546242(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConcept(_context.getNode()) == MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b5816f25L, "org.campagnelab.metar.edgeR.structure.TagWiseDispersion");
  }
  public static boolean baseMappingRule_Condition_8031339867717548105(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConcept(_context.getNode()) == MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b5816ef3L, "org.campagnelab.metar.edgeR.structure.TrendedDispersion");
  }
  public static boolean baseMappingRule_Condition_8031339867717490894(final BaseMappingRuleContext _context) {
    return GroupFormula_Behavior.call_oneFactor_5124039371744206321(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, "org.campagnelab.metar.edgeR.structure.EdgeRTest")), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula")));
  }
  public static boolean baseMappingRule_Condition_8031339867719169483(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConcept(_context.getNode()) == MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b58258b2L, "org.campagnelab.metar.edgeR.structure.CommonDispersion");
  }
  public static boolean baseMappingRule_Condition_8031339867719169494(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConcept(_context.getNode()) == MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b5816f25L, "org.campagnelab.metar.edgeR.structure.TagWiseDispersion");
  }
  public static boolean baseMappingRule_Condition_8031339867719169505(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConcept(_context.getNode()) == MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b5816ef3L, "org.campagnelab.metar.edgeR.structure.TrendedDispersion");
  }
  public static boolean baseMappingRule_Condition_8031339867719169517(final BaseMappingRuleContext _context) {
    return !(GroupFormula_Behavior.call_oneFactor_5124039371744206321(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, "org.campagnelab.metar.edgeR.structure.EdgeRTest")), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula"))));
  }
  public static boolean baseMappingRule_Condition_6583618001725934951(final BaseMappingRuleContext _context) {
    return ((Boolean) _context.getVariable("oneFactor"));
  }
  public static boolean baseMappingRule_Condition_6583618001725940467(final BaseMappingRuleContext _context) {
    return !(((Boolean) _context.getVariable("oneFactor")));
  }
  public static Object propertyMacro_GetPropertyValue_8031339867718843427(final PropertyMacroContext _context) {
    return ((String) _context.getVariable("countsTableName"));
  }
  public static Object propertyMacro_GetPropertyValue_8031339867718891262(final PropertyMacroContext _context) {
    return ((String) _context.getVariable("countsTableName"));
  }
  public static Object propertyMacro_GetPropertyValue_8031339867718432234(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(TableRef_Behavior.call_firstColumnWithGroup_8031339867718453028(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56e97d7L, "countsTable")), "ID"), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8031339867718506089(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_6583618001724024800(final PropertyMacroContext _context) {
    final Iterable<SNode> usages = GroupFormula_Behavior.call_calculateGroupUsageNames_5124039371803265012(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula")));
    // find the columns with usage contained in the model formula 
    return IterableUtils.join(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(((SNode) _context.getVariable("countsTable")), MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x3dc59a0f37f897b3L, 0x3dc59a0f37f89c07L, "table")), MetaAdapterFactory.getContainmentLink(0x5ec1cd3d0a504049L, 0xa8faae768d7baa25L, 0x1e924e67df2c8b97L, 0x1e924e67df2c9a74L, "columns"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode col) {
        boolean result = ListSequence.fromList(SLinkOperations.getChildren(AttributeOperations.getAttribute(col, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8bacL, "org.campagnelab.metar.tables.structure.ColumnAnnotation"))), MetaAdapterFactory.getContainmentLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8bacL, 0x2f3745faddba9108L, "groups"))).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8c07L, 0x2f3745faddba8c08L, "columnGroup")) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8c07L, 0x2f3745faddba8c08L, "columnGroup"));
          }
        }).translate(new ITranslator2<SNode, SNode>() {
          public Iterable<SNode> translate(SNode it) {
            return SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8bfbL, 0x6f750d0ecde3e9dcL, "usesRefs"));
          }
        }).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x6f750d0ecde3e9dfL, 0x6f750d0ecde3e9e0L, "usage")) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x6f750d0ecde3e9dfL, 0x6f750d0ecde3e9e0L, "usage"));
          }
        }).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode usage) {
            return usage != null && Sequence.fromIterable(usages).contains(usage);
          }
        });
        if (LOG.isInfoEnabled()) {
          LOG.info("column:" + SPropertyOperations.getString(col, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + " expression: " + result);
        }
        return result;
      }
    }).select(new ISelector<SNode, String>() {
      public String select(SNode column) {
        return "\"" + SPropertyOperations.getString(column, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "\"";
      }
    }), ", ");
  }
  public static Object propertyMacro_GetPropertyValue_8031339867719204674(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8031339867722721665(final PropertyMacroContext _context) {

    // find the columns with usage 
    Iterable<SNode> columns = ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(((SNode) _context.getVariable("countsTable")), MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x3dc59a0f37f897b3L, 0x3dc59a0f37f89c07L, "table")), MetaAdapterFactory.getContainmentLink(0x5ec1cd3d0a504049L, 0xa8faae768d7baa25L, 0x1e924e67df2c8b97L, 0x1e924e67df2c9a74L, "columns"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode col) {
        return ListSequence.fromList(SLinkOperations.getChildren(AttributeOperations.getAttribute(col, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8bacL, "org.campagnelab.metar.tables.structure.ColumnAnnotation"))), MetaAdapterFactory.getContainmentLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8bacL, 0x2f3745faddba9108L, "groups"))).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8c07L, 0x2f3745faddba8c08L, "columnGroup")) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8c07L, 0x2f3745faddba8c08L, "columnGroup"));
          }
        }).translate(new ITranslator2<SNode, SNode>() {
          public Iterable<SNode> translate(SNode it) {
            return SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8bfbL, 0x6f750d0ecde3e9dcL, "usesRefs"));
          }
        }).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x6f750d0ecde3e9dfL, 0x6f750d0ecde3e9e0L, "usage")) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x6f750d0ecde3e9dfL, 0x6f750d0ecde3e9e0L, "usage"));
          }
        }).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode usage) {
            return eq_x583g4_a0a0a0a0a0a0a0a0a0a2a71(SPropertyOperations.getString(usage, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
          }
        });
      }
    });

    Iterable<String> values = GroupValues.build(columns, _context.getNode());
    if (GroupValues.valuesNeedQuote(Sequence.fromIterable(columns).first(), _context.getNode())) {
      values = Sequence.fromIterable(values).select(new ISelector<String, String>() {
        public String select(String name) {
          return "\"" + name + "\"";
        }
      });
    }
    return IterableUtils.join(Sequence.fromIterable(values), ", ");
  }
  public static Object propertyMacro_GetPropertyValue_578023650351128805(final PropertyMacroContext _context) {
    return FutureTable_Behavior.call_getCleanTableName_4166618652720345586(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56ebd77L, "destinationTable")));
  }
  public static Object propertyMacro_GetPropertyValue_578023650351128814(final PropertyMacroContext _context) {
    return FutureTable_Behavior.call_getCleanTableName_4166618652720345586(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56ebd77L, "destinationTable")));
  }
  public static Object propertyMacro_GetPropertyValue_578023650350787074(final PropertyMacroContext _context) {
    return FutureTable_Behavior.call_getCleanTableName_4166618652720345586(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56ebd77L, "destinationTable")));
  }
  public static Object propertyMacro_GetPropertyValue_578023650350787083(final PropertyMacroContext _context) {
    return FutureTable_Behavior.call_getCleanTableName_4166618652720345586(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56ebd77L, "destinationTable")));
  }
  public static Object propertyMacro_GetPropertyValue_962445451565867504(final PropertyMacroContext _context) {
    return ((SNode) _context.getNode()).getNodeId().toString();
  }
  public static Object propertyMacro_GetPropertyValue_8031339867733381206(final PropertyMacroContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56ebd77L, "destinationTable")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static Object propertyMacro_GetPropertyValue_8031339867733399660(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56ebd77L, "destinationTable")), MetaAdapterFactory.getProperty(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745fadd605ac5L, 0x39d2cd96c5e52d3dL, "id"));
  }
  public static Object propertyMacro_GetPropertyValue_280962132771004473(final PropertyMacroContext _context) {
    return Statement_Behavior.call_id_3007013211740741445(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_2742007948305584053(final PropertyMacroContext _context) {
    return Statement_Behavior.call_errorCatchingEnabled_2742007948304790371(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_8031339867724616579(final PropertyMacroContext _context) {
    return IterableUtils.join(Sequence.fromIterable(GroupFormula_Behavior.call_calculateGroupUsageNames_5124039371803265012(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula")))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
      }
    }), " +");
  }
  public static Object propertyMacro_GetPropertyValue_6583618001726046369(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(Sequence.fromIterable(GroupFormula_Behavior.call_calculateGroupUsageNames_5124039371803265012(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula")))).first(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static boolean ifMacro_Condition_6583618001718586960(final IfMacroContext _context) {
    return GroupFormula_Behavior.call_oneFactor_5124039371744206321(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula")));
  }
  public static boolean ifMacro_Condition_6583618001726019248(final IfMacroContext _context) {
    return !(GroupFormula_Behavior.call_oneFactor_5124039371744206321(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula"))));
  }
  public static boolean ifMacro_Condition_8031339867730269722(final IfMacroContext _context) {
    return SNodeOperations.getConcept(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b581daeaL, "dispersionMethod"))) == MetaAdapterFactory.getConcept(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b5816f25L, "org.campagnelab.metar.edgeR.structure.TagWiseDispersion");
  }
  public static boolean ifMacro_Condition_6583618001726028145(final IfMacroContext _context) {
    return !(GroupFormula_Behavior.call_oneFactor_5124039371744206321(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula"))));
  }
  public static boolean ifMacro_Condition_8031339867726629965(final IfMacroContext _context) {
    return GroupFormula_Behavior.call_oneFactorTwoGroups_3083373816531153937(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula")));
  }
  public static SNode sourceNodeQuery_8031339867730262914(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b581daeaL, "dispersionMethod"));
  }
  public static SNode sourceNodeQuery_8031339867726638648(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c368L, "contrasts"));
  }
  public static Object templateArgumentQuery_8031339867718393870(final TemplateQueryContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56e97d7L, "countsTable")), MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x3dc59a0f37f897b3L, 0x3dc59a0f37f89c07L, "table")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static Object templateArgumentQuery_8031339867724001479(final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56e97d7L, "countsTable"));
  }
  public static Object templateArgumentQuery_6583618001725954811(final TemplateQueryContext _context) {
    return _context.getNode();
  }
  public static Object templateArgumentQuery_6583618001725955157(final TemplateQueryContext _context) {
    return GroupFormula_Behavior.call_oneFactorTwoGroups_3083373816531153937(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula")));
  }
  public static Iterable<SNode> sourceNodesQuery_8031339867718491133(final SourceSubstituteMacroNodesContext _context) {
    // calculate the set of columns names to remove: 
    // remove each column that is not labeled with the counts group 
    return ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4680380920ee443fL, 0xbea90bee114b90b3L, 0x79170bb4b56e6ecbL, 0x79170bb4b56e97d7L, "countsTable")), MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x3dc59a0f37f897b3L, 0x3dc59a0f37f89c07L, "table")), MetaAdapterFactory.getContainmentLink(0x5ec1cd3d0a504049L, 0xa8faae768d7baa25L, 0x1e924e67df2c8b97L, 0x1e924e67df2c9a74L, "columns"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return ListSequence.fromList(SLinkOperations.getChildren(AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8bacL, "org.campagnelab.metar.tables.structure.ColumnAnnotation"))), MetaAdapterFactory.getContainmentLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8bacL, 0x2f3745faddba9108L, "groups"))).all(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return neq_x583g4_a0a0a0a0a0a0a0a0a0c0ob(SPropertyOperations.getString(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8c07L, 0x2f3745faddba8c08L, "columnGroup")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), "counts");
          }
        });
      }
    });
  }
  public static Iterable<SNode> sourceNodesQuery_8031339867718980790(final SourceSubstituteMacroNodesContext _context) {
    final Iterable<String> groupUsageNames = ListSequence.fromList(SNodeOperations.getNodeDescendants(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea90814c0afL, 0x471c3ea90814c207L, "modelFormula")), MetaAdapterFactory.getConcept(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea907eddd91L, "org.campagnelab.metar.models.structure.GroupUsageRef"), false, new SAbstractConcept[]{})).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return SPropertyOperations.getString(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xecc862c95ab542efL, 0x87032039019fb338L, 0x471c3ea907eddd91L, 0x471c3ea907eddd92L, "groupUsage")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
      }
    }).distinct();
    // calculate the set of groups that have usage in the model formula: 
    // remove each column that is not labeled with the counts group 
    return ListSequence.fromList(SModelOperations.roots(SNodeOperations.getModel(_context.getNode()), MetaAdapterFactory.getConcept(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8c00L, "org.campagnelab.metar.tables.structure.ColumnGroupContainer"))).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0x5d6bde844ce44eb5L, 0xa37e25a5edd55129L, 0x2f3745faddba8c00L, 0x2f3745faddba8c01L, "groups"));
      }
    }).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return ColumnGroup_Behavior.call_uses_8031339867721231487(it);
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode use) {
        return Sequence.fromIterable(groupUsageNames).contains(SPropertyOperations.getString(use, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      }
    }).distinct();
  }
  protected static Logger LOG = LogManager.getLogger(QueriesGenerated.class);
  private static boolean eq_x583g4_a0a0a0a0a0a0a0a0a0a2a71(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
  private static boolean neq_x583g4_a0a0a0a0a0a0a0a0a0c0ob(Object a, Object b) {
    return !(((a != null ? a.equals(b) : a == b)));
  }
}
