package org.campagnelab.hta.tables.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class TableRef_Constraints extends BaseConstraintsDescriptor {
  public TableRef_Constraints() {
    super("org.campagnelab.hta.tables.structure.TableRef");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("table", new BaseReferenceConstraintsDescriptor("table", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            // find the tables defined before this reference: 
            List<SNode> statements = SNodeOperations.getDescendants(SNodeOperations.getAncestor(_context.getEnclosingNode(), "org.campagnelab.hta.tables.structure.Analysis", false, false), "org.campagnelab.hta.tables.structure.Statement", true, new String[]{});
            final SNode thisStatement = SNodeOperations.getAncestor(_context.getEnclosingNode(), "org.campagnelab.hta.tables.structure.Statement", true, false);
            final Wrappers._boolean before = new Wrappers._boolean(true);
            return ListSequence.fromList(statements).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode it) {
                return before.value && (before.value = (it != thisStatement));
              }
            }).translate(new ITranslator2<SNode, SNode>() {
              public Iterable<SNode> translate(SNode it) {
                return SNodeOperations.getDescendants(it, "org.campagnelab.hta.tables.structure.FutureTable", false, new String[]{});
              }
            }).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode it) {
                return (SLinkOperations.getTarget(it, "table", false) != null);
              }
            }).select(new ISelector<SNode, SNode>() {
              public SNode select(SNode it) {
                return SLinkOperations.getTarget(it, "table", false);
              }
            });
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_1duni_a0a1a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_1duni_a0a1a0a0a1a0b0a1a1 = new SNodePointer("r:377e7fab-b099-4462-b9f3-2050d4b23cf6(org.campagnelab.hta.tables.constraints)", "4451133196880007445");
}
