package org.campagnelab.hta.tables.actions;

/*Generated by MPS */

import jetbrains.mps.datatransfer.PastePostProcessor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.campagnelab.hta.tables.behavior.Statement_Behavior;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;

public class ReIdStatement_PastePostProcessor_0 implements PastePostProcessor {
  public SNode getApplicableConcept() {
    return SConceptOperations.findConceptDeclaration("org.campagnelab.hta.tables.structure.Statement");
  }

  public void postProcesNode(SNode pastedNode) {
    final String pastedId = SPropertyOperations.getString(pastedNode, "id");
    if (ListSequence.fromList(SNodeOperations.getDescendants(SNodeOperations.getAncestor(pastedNode, "org.campagnelab.hta.tables.structure.Analysis", false, false), "org.campagnelab.hta.tables.structure.Statement", false, new String[]{})).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return eq_kgn89z_a0a0a0a0a0b0b(SPropertyOperations.getString(it, "id"), pastedId);
      }
    })) {
      // give a pasted node a random ID if the same node already exists in the model 
      SPropertyOperations.set(pastedNode, "id", Statement_Behavior.call_randomCreate_8962032619593737530(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("org.campagnelab.hta.tables.structure.Statement"))), 10));
    }
  }

  private static boolean eq_kgn89z_a0a0a0a0a0b0b(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
}
