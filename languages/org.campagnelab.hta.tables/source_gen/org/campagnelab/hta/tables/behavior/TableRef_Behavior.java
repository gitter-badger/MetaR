package org.campagnelab.hta.tables.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class TableRef_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean call_hasGroup_4140623938104765280(SNode thisNode, final String groupName) {
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "table", false), "columns", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute("org.campagnelab.hta.tables.structure.ColumnAnnotation")), "groups", true)).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return eq_n5v452_a0a0a0a0a0a0a0a0a0a0b(SPropertyOperations.getString(SLinkOperations.getTarget(it, "columnGroup", false), "name"), groupName);
          }
        });
      }
    });
  }

  public static boolean call_hasGroupWithIntent_4140623938104897834(SNode thisNode, final String intentName) {
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "table", false), "columns", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute("org.campagnelab.hta.tables.structure.ColumnAnnotation")), "groups", true)).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode group) {
            return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(group, "columnGroup", false), "uses", true)).any(new IWhereFilter<SNode>() {
              public boolean accept(SNode intent) {
                return eq_n5v452_a0a0a0a0a0a0a0a0a0a0a0a0a0a0c(SPropertyOperations.getString(intent, "name"), intentName);
              }
            });
          }
        });
      }
    });
  }

  private static boolean eq_n5v452_a0a0a0a0a0a0a0a0a0a0b(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }

  private static boolean eq_n5v452_a0a0a0a0a0a0a0a0a0a0a0a0a0a0c(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
}
