package org.campagnelab.hta.expressions.constraints;

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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class ColumnValue_Constraints extends BaseConstraintsDescriptor {
  public ColumnValue_Constraints() {
    super("org.campagnelab.hta.expressions.structure.ColumnValue");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("column", new BaseReferenceConstraintsDescriptor("column", this) {
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
            // restrict to columns in the table referenced by the parent statement in current script.  
            // TODO: calculate column visibility according to data transformations 
            return ListSequence.fromList(SNodeOperations.getDescendants(SNodeOperations.getAncestor(_context.getEnclosingNode(), "org.campagnelab.hta.script.structure.Statement", true, false), "org.campagnelab.hta.tables.structure.TableRef", false, new String[]{})).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode it) {
                return (SLinkOperations.getTarget(it, "table", false) != null);
              }
            }).select(new ISelector<SNode, SNode>() {
              public SNode select(SNode it) {
                return SLinkOperations.getTarget(it, "table", false);
              }
            }).translate(new ITranslator2<SNode, SNode>() {
              public Iterable<SNode> translate(SNode it) {
                return SLinkOperations.getTargets(it, "columns", true);
              }
            }).distinct();
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_md63eh_a0a1a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_md63eh_a0a1a0a0a1a0b0a1a1 = new SNodePointer("r:ba5d3597-eba8-4e65-ad21-cd8e280ee11f(org.campagnelab.hta.expressions.constraints)", "4140623938104378052");
}
