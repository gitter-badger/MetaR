package org.campagnelab.hta.tables.scopes;

/*Generated by MPS */

import jetbrains.mps.scope.Scope;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.scope.CompositeScope;

public class ImportedTableScope {
  public static Scope allImported(SNode contextNode) {
    SNode script = SNodeOperations.getAncestor(contextNode, "org.campagnelab.hta.tables.structure.Analysis", false, false);
    Scope imported = ListScope.forNamedElements(ListSequence.fromList(SNodeOperations.getDescendants(script, "org.campagnelab.hta.tables.structure.ImportTable", false, new String[]{})).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(it, "future", true), "table", false), "columns", true);
      }
    }));
    Scope futureTables = ListScope.forNamedElements(ListSequence.fromList(SNodeOperations.getDescendants(script, "org.campagnelab.hta.tables.structure.Table", false, new String[]{})).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(it, "columns", true);
      }
    }));

    return CompositeScope.createComposite(imported, futureTables);
  }
}
